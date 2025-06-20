package in.kp.controllers;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class myController {
	
	
	@GetMapping("/openUploadFilePage")
	public String openUploadPage() {
		

				
		return "upload-file";
	}
	
	
	@PostMapping("/uploadFileForm")
	public String uploadFile(@RequestParam("file1") MultipartFile file1, Model model) {
		
		String status="";
		
		try {
			String fileName= file1.getOriginalFilename();
			byte[] file_in_bytes= file1.getBytes();
			
			FileOutputStream fout = new FileOutputStream("E:\\Backend\\SpringWebMVC-5-UploadFiles\\src\\ServerFiles\\"+fileName);
			fout.write(file_in_bytes);
			System.out.println("File Uploaded Sucessfully...");
			
			status="Upload Success";
			
			
		} catch (Exception e) {
			System.out.println("Error while uploading file");
			e.printStackTrace();
			status="Upload Fail";
		}
		model.addAttribute("upload_status", status);
		
		
		
		return "success";
	}

}
