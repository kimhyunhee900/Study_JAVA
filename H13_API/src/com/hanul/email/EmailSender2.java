package com.hanul.email;

import java.util.ArrayList;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender2 {

	// 이메일 전송클래스
	// 1. 프로젝트에 lib 폴더를 만든다
	// 2. lib에 javax.mail.jar, common-email-1.5.jar, activation-1.1.jar 파일을 다운로드받아 넣는다
	// 3. H13_API 마우스우클릭 Build path -> Configure Build path -> 라이브러리 -> classpath -> Add External JARs -> 3파일 추가 -> 어플라이엔클로우즈
	// 3. 송신 할 메일의 환경설정에서 SMTP 사용을 설정해야한다.
	//		naver -> 하단 환경설정 -> POP3/IMAP 설정 -> POP3/SMTP 사용함으로 선택
	//		gmail -> 상단 환경설정 -> 전달 및 POP3/IMAP -> IMAP 액세스:IMAP 사용으로 선택
	//				 상단 내 계정 -> 로그인 및 보안 -> 맨아래 연결된 앱 및 사이트 -> 보안수준이 낮은 앱 허용 : 사용
	// Common Email API 는 메일 발송을 처리해주는 SimpleEmail, HtmlEmail과 같은 클래스를 제공하고 있으며
	// 이들 클래스를 사용하여 일반 텍스트 메일, HTML 메일, 첨부메일 등을 매우 간단하게 발송할 수 있다
	
	private String emailAddress, password, sendname;  // 메일 보내는 관리자 정보

	public EmailSender2(String emailAddress, String password, String sendname) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
		this.sendname = sendname;
	}
	
	// 메일 받는 사람 정보
	//void sendSimple(String email, String arriveName) {
		void sendSimple(ArrayList<Student> studArray) {
		// 기본 메일 객체 생성
		SimpleEmail mail = new SimpleEmail();
		// 이메일을 보내는 사람의 메일 서버 지정 : smtp.naver.com, smtp.gmail.com.......
		mail.setHostName("smtp." + emailAddress.substring(emailAddress.indexOf("@") + 1 )); // @를 찾고 +1을 해줘야 그 다음부터 끝까지 자름
		mail.setCharset("UTF-8");
		// 메일 전송처리 확인을 위한 로그 출력을 지정
		mail.setDebug(true);
		// 로그인하기 위한 아이디/비번을 지정 : 보내는 사람 메일의 인증 아이디와 비번 지정
		mail.setAuthentication(emailAddress, password);
		mail.setSSLOnConnect(true); // 보안이 강조된 형태로 보내주는 메소드
	
		try {
		// 메일 보낼 사람 지정 : 송신인 메일주소를 full로 지정해야함
		mail.setFrom(emailAddress, this.sendname);
			// ex) mail.setFrom("khh4477@naver.com","관리자");
		// 메일 받을 사람 지정 : 수신인 지정 -> 여러명에게 보낼때는 addTo 만 추가
			//mail.addTo(email,arriveName);
			// ex) mail.addTo("sehee0623@naver.com","김세희");
		for(int i=0; i<studArray.size(); i++) {
		mail.addTo(studArray.get(i).getEmail(),studArray.get(i).getName());
		}
		// 메일 제목, 내용
		mail.setSubject("항상화이팅!");
		mail.setMsg("감기조심하세요~!");
		// 메일 전송버튼 클릭
		mail.send();
			
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
