package com.practice1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;

@RestController
public class MyServlet extends HttpServlet {
	@GetMapping("/get")
	protected String doGet1() throws IOException {

		return "succesfully running...!";
	}

	@GetMapping("/create")
	public String write() {
		String absolutePath = "/opt/"; // Replace with your actual absolute path.
		String fileName = "example.txt";

		try {
			// Create the file using the absolute path.
			File file = new File(absolutePath, fileName);
			file.setExecutable(true);
			file.setReadable(true);
			file.setWritable(true); // Ensure the directory structure exists, creating parent directories if needed.
			file.getParentFile().mkdirs();

			// Write content to the file.
			FileWriter writer = new FileWriter(file);
			writer.write("Your content goes here.");
			writer.close();

			// You can also send a response back to the client if needed.
			return "File created successfully.";
		} catch (IOException e) {
			e.printStackTrace();
			// Handle any exceptions here.
		}
		return "Something went wrong";
	}
}
