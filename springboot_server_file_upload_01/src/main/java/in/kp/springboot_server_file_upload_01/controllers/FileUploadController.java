package in.kp.springboot_server_file_upload_01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import in.kp.springboot_server_file_upload_01.helper.FileUploadHelper;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

        try {

            System.out.println(file.getOriginalFilename());
            System.out.println(file.getContentType());

            // validation
            if (!file.getContentType().equals("image/jpeg")) {
                return ResponseEntity.badRequest().body("Only JPEG files are allowed");
            }

            // if is null then validate
            if (file.isEmpty()) {
                return ResponseEntity.status( 500).body("Something went wrong. Please try again later.");
            }

            // upload File
            if (!fileUploadHelper.FileUpload(file)) {
                return ResponseEntity.ok("File uploaded ERROR");
            }

            // for static path
           // return ResponseEntity.ok("File uploaded successfully");

           //to print actual image location
           return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error uploading file: " + e.getMessage());
        }

    }

    @GetMapping("/check")
    public ResponseEntity<String> check() {
        return ResponseEntity.ok("API Call successfully.");
    }

}
