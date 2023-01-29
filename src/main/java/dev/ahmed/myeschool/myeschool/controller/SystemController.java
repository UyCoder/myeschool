
package dev.ahmed.myeschool.myeschool.controller;

import dev.ahmed.myeschool.myeschool.pojo.Admin;
import dev.ahmed.myeschool.myeschool.pojo.LoginForm;
import dev.ahmed.myeschool.myeschool.pojo.Student;
import dev.ahmed.myeschool.myeschool.pojo.Teacher;
import dev.ahmed.myeschool.myeschool.service.AdminService;
import dev.ahmed.myeschool.myeschool.service.StudentService;
import dev.ahmed.myeschool.myeschool.service.TeacherService;
import dev.ahmed.myeschool.myeschool.util.CreateVerifiCodeImage;
import dev.ahmed.myeschool.myeschool.util.JwtHelper;
import dev.ahmed.myeschool.myeschool.util.Result;
import dev.ahmed.myeschool.myeschool.util.ResultCodeEnum;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Ahmed Bughra
 * @create 2023-01-25  7:39 PM
 */
@RestController
@RequestMapping("/sms/system")
public class SystemController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;


    @ApiOperation("The method of obtaining the currently logged-in user information through the token password")
    @GetMapping("/getInfo")
    public Result getInfoByToken(
            @ApiParam("token password") @RequestHeader("token") String token) {
        boolean expiration = JwtHelper.isExpiration(token);
        if (expiration) {
            return Result.build(null, ResultCodeEnum.TOKEN_ERROR);
        }
        //get the user id and user type from the token
        Long userId = JwtHelper.getUserId(token);
        Integer userType = JwtHelper.getUserType(token);


        Map<String, Object> map = new LinkedHashMap<>();
        switch (userType) {
            case 1:
                Admin admin = adminService.getAdminById(userId);
                map.put("userType", 1);
                map.put("user", admin);
                break;
            case 2:
                Student student = studentService.getStudentById(userId);
                map.put("userType", 2);
                map.put("user", student);
                break;
            case 3:
                Teacher teacher = teacherService.getTeacherById(userId);
                map.put("userType", 3);
                map.put("user", teacher);
                break;
        }
        return Result.ok(map);
    }


    @ApiOperation("Login")
    @PostMapping("/login")
    public Result login(
            @ApiParam("Login form to submit information")
            @RequestBody LoginForm loginForm,
            HttpServletRequest request) {
        // Verificode verification
        HttpSession session = request.getSession();
        String sessionVerifiCode = (String) session.getAttribute("verifiCode");
        String loginVerifiCode = loginForm.getVerifiCode();
        if ("".equals(sessionVerifiCode) || null == sessionVerifiCode) {
            return Result.fail().message("The verification code is invalid, please refresh and try again");
        }
        if (!sessionVerifiCode.equalsIgnoreCase(loginVerifiCode)) {
            return Result.fail().message("The verification code is incorrect, please enter it carefully and try again");
        }
        //Remove existing captchas from the session field
        session.removeAttribute("verifiCode");


        // Check by user type
        // Prepare a map user to store the response data
        Map<String, Object> map = new LinkedHashMap<>();
        switch (loginForm.getUserType()) {
            case 1:
                try {
                    Admin admin = adminService.login(loginForm);
                    if (null != admin) {
                        // The user type and user id are converted into a ciphertext, which is fed back to the client in the name of token
                        map.put("token", JwtHelper.createToken(admin.getId().longValue(), 1));
                    } else {
                        throw new RuntimeException("Username or password is wrong");
                    }
                    return Result.ok(map);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    return Result.fail().message(e.getMessage());
                }
            case 2:
                try {
                    Student student = studentService.login(loginForm);
                    if (null != student) {
                        // The user type and user id are converted into a ciphertext, which is fed back to the client in the name of token
                        map.put("token", JwtHelper.createToken(student.getId().longValue(), 2));
                    } else {
                        throw new RuntimeException("Username or password is wrong");
                    }
                    return Result.ok(map);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    return Result.fail().message(e.getMessage());
                }
            case 3:
                try {
                    Teacher teacher = teacherService.login(loginForm);
                    if (null != teacher) {
                        // The user type and user id are converted into a ciphertext, which is fed back to the client in the name of token
                        map.put("token", JwtHelper.createToken(teacher.getId().longValue(), 3));
                    } else {
                        throw new RuntimeException("Username or password is wrong");
                    }
                    return Result.ok(map);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    return Result.fail().message(e.getMessage());
                }
        }
        return Result.fail().message("No such user found");

    }


    @ApiOperation("GetVerificationCodeImage")
    @GetMapping("/getVerifiCodeImage")
    public void getVerifiCodeImage(HttpServletRequest request, HttpServletResponse response) {
        // get the image
        BufferedImage verifiCodeImage = CreateVerifiCodeImage.getVerifiCodeImage();

        // get the verification code on the image
        String verifiCode = new String(CreateVerifiCodeImage.getVerifiCode());

        // Put the verification code text into the session field to prepare for the next verification
        HttpSession session = request.getSession();
        session.setAttribute("verifiCode", verifiCode);

        // Respond the verification code image to the browser
        try {
            ImageIO.write(verifiCodeImage, "JPEG", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
