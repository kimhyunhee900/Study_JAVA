package com.hanul.email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class EmailSenderMain1 {

	//이메일 전송 클래스
	public static void main(String[] args) {

		EmailSender1 sender = new EmailSender1("khh4477@naver.com","dudfhrdl90@@!!","관리자");
		sender.sendSimple("sehee0623@naver.com","김세희");
		sender.sendAttach("sehee0623@naver.com", "김세희");
//		sender.sendSimple("khh4477@naver.com","김현희");
//		sender.sendAttach("khh4477@naver.com", "김현희");
//		
	}

}
