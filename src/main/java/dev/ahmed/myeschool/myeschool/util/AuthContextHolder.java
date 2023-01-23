package dev.ahmed.myeschool.myeschool.util;

import javax.servlet.http.HttpServletRequest;

public class AuthContextHolder {

    //Get userid from request header token
    public static Long getUserIdToken(HttpServletRequest request) {
        //From request header token
        String token = request.getHeader("token");
        //call tool class
        Long userId = JwtHelper.getUserId(token);
        return userId;
    }

    //Get the name from the request header token
    public static String getUserName(HttpServletRequest request) {
        //Get token from header
        String token = request.getHeader("token");
        //jwt gets username from token
        String userName = JwtHelper.getUserName(token);
        return userName;
    }
}
