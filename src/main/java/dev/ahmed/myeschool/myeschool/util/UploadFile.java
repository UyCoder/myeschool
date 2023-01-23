package dev.ahmed.myeschool.myeschool.util;

import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @project: sms
 * @description: Tool class for uploading files
 */
public class UploadFile {

    //Store file upload failure error message
    private static Map<String, Object> error_result = new HashMap<>();
    //Store the upload result information of the avatar
    private static Map<String, Object> upload_result = new HashMap<>();

    /**
     * @description: Verify the size and format of the uploaded pictures...
     * @param: photo
     * @param: path
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     */
    private static Map<String, Object> uploadPhoto(MultipartFile photo, String path) {
        //Limit avatar size (20M)
        int MAX_SIZE = 20971520;
        //Get the original name of the image
        String orginalName = photo.getOriginalFilename();
        //If the path to save the file does not exist, create the directory
        File filePath = new File(path);
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        //Limit the size of uploaded files
        if (photo.getSize() > MAX_SIZE) {
            error_result.put("success", false);
            error_result.put("msg", "The uploaded image size cannot exceed 20M!");
            return error_result;
        }
        //Restrict uploaded file types
        String[] suffixs = new String[]{".png", ".PNG", ".jpg", ".JPG", ".jpeg", ".JPEG", ".gif", ".GIF", ".bmp", ".BMP"};
        SuffixFileFilter suffixFileFilter = new SuffixFileFilter(suffixs);
        if (!suffixFileFilter.accept(new File(path + orginalName))) {
            error_result.put("success", false);
            error_result.put("msg", "Uploading this type of file is prohibited! Please upload a picture!");
            return error_result;
        }

        return null;
    }

    /**
     * @description: (Extract public code: improve code reusability) Obtain the upload result information of the avatar
     * @param: photo
     * @param: dirPaht
     * @param: portraitPath
     * @return: java.util.Map<java.lang.String, java.lang.Object>
     */
    public static Map<String, Object> getUploadResult(MultipartFile photo, String dirPaht, String portraitPath) {

        if (!photo.isEmpty() && photo.getSize() > 0) {
            //Get the original name of the image
            String orginalName = photo.getOriginalFilename();
            //Upload picture, error_result: store the error message of failure to upload the avatar
            Map<String, Object> error_result = UploadFile.uploadPhoto(photo, dirPaht);
            if (error_result != null) {
                return error_result;
            }
            //Rename image name using UUID (uuid__original image name)
            String newPhotoName = UUID.randomUUID() + "__" + orginalName;
            //Save the uploaded file to the target directory
            try {
                photo.transferTo(new File(dirPaht + newPhotoName));
                upload_result.put("success", true);
                upload_result.put("portrait_path", portraitPath + newPhotoName);//Return the path of the item where the avatar is stored to the page
            } catch (IOException e) {
                e.printStackTrace();
                upload_result.put("success", false);
                upload_result.put("msg", "Failed to upload file! An exception occurred on the server side!");
                return upload_result;
            }

        } else {
            upload_result.put("success", false);
            upload_result.put("msg", "Avatar upload failed! The specified image was not found!");
        }
        return upload_result;
    }
}
