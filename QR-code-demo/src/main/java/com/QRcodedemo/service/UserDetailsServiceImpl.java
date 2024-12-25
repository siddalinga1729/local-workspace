package com.QRcodedemo.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.QRcodedemo.entity.UserDetails;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;

import jakarta.annotation.PostConstruct;

@Service
public class UserDetailsServiceImpl {

	public void generateQRCode(UserDetails userDetails) throws Exception {
		String qrPath = "src/main/resources/QR-Codes/" + userDetails.getUserName() + "-qrcode.png";
		QRCodeWriter qrCodeWriter = new QRCodeWriter();

		BitMatrix bitMatrix = qrCodeWriter.encode(userDetails.getUserName() + "\n" + userDetails.getPassword(),
				BarcodeFormat.QR_CODE, 250, 250);
		Path path = FileSystems.getDefault().getPath(qrPath);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);

	}

	@PostConstruct
	public String createQRCode() throws Exception {
		UserDetails userDetails = new UserDetails("Siddu", "Siddu1729@");
		generateQRCode(userDetails);
		System.out.println(decodeQRCode("src/main/resources/QR-Codes/" + userDetails.getUserName() + "-qrcode.png"));
		return "Genrated SuccessFully";

	}

	private String decodeQRCode(String path) {
		try {
			BufferedImage bufferedImage = ImageIO.read(new File(path));
			LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
			BinaryBitmap bitMatrix = new BinaryBitmap(new HybridBinarizer(luminanceSource));

			Result decode = new MultiFormatReader().decode(bitMatrix);
			return decode.getText();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
