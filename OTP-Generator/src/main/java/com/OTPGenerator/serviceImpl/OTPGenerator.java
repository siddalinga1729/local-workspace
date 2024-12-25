package com.OTPGenerator.serviceImpl;

import java.util.Random;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class OTPGenerator {

	@PostConstruct
	public void otpGenerator() {
		Random random=new Random();
		int nextInt = random.nextInt(0, 1000000);
		String pattern="%06d";
		//format otp to 4 digits
		String formattedOTP = String.format(pattern, nextInt);
		System.out.println(formattedOTP);
	}
}
