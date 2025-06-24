package in.kp.springboot_server_file_upload_01.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {

    
    //for static path
    // String fileUploadPath = "E:\\Backend\\springboot_server_file_upload_01\\src\\main\\resources\\static\\image";

    //For dyanmic path
    String fileUploadPath = new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException{
        //constructor

    }

    public boolean FileUpload(MultipartFile multipartFile) {
        boolean status = false;

        try {

            //Method 01

            // String fileName = multipartFile.getOriginalFilename();

            // InputStream is = multipartFile.getInputStream();

            // byte[] data = new byte[is.available()];
            // is.read(data);

            // // write
            // FileOutputStream ft = new FileOutputStream(fileUploadPath + File.separator + fileName);

            // ft.write(data);
            // ft.flush();
            // ft.close();
            // status = true;


            //Method 02 - to upload file

            Files.copy(multipartFile.getInputStream(), Paths.get(fileUploadPath + File.separator + multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            status = true;

            

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return status;

    }

}
