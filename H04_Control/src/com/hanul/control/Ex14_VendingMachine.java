package com.hanul.control;

import java.util.Scanner;

public class Ex14_VendingMachine {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
         
      System.out.println("---- 자판기 메뉴 ----");
      System.out.println("1.콜라    : 1250원");
      System.out.println("2.레쓰비 : 800원");
      System.out.println("3.코코팜 : 1000원");
      
      // 메뉴변수와 선택가능 변수를 선언한다
      
      int coke = 1250;
      int letsbe = 800;
      int cocopam = 1000;
      
      boolean choice1=false, choice2=false, choice3=false;
      // 경우의 수가 두가지밖에 없는 경우 boolean으로 하는게 좋다. 
      // int로 할 수 있지만 그럼 또 정수(0,1)로 가야하니까 자판기의 경우 맞거나틀리거나의 두가지 경우니까 boolean으로 
      // 먼저 false를 선언해준 후 if문으로 조건에 맞는 경우를 true로 처리해주는게 깔끔.!
      // 투입된 금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 처리한다.
      System.out.println("투입구에 돈을 넣으세요");
      int mymoney =sc.nextInt();
      System.out.println("투입금액은 : " + mymoney );
      
      // 투입금액에 따라 선택가능한 메뉴를 true로 변경시켜준다
      
      if(mymoney>=1250) {
          choice1=true;
      }
      if(mymoney>=800) {
          choice2=true;
      }
      if(mymoney>=1000) {
          choice3=true;
      } 
         	  
      System.out.println("1번 콜라 1250원 " + (choice1 ? "선택가능":""));
      System.out.println("2번 레쓰비 800원 " + (choice2 ? "선택가능":""));
      System.out.println("3번 코코팜 1000원 " + (choice3 ? "선택가능":""));
      System.out.println("음료를 선택하세요");
         
      
      // 음료를 선택한다
      int menu = sc.nextInt();
      int jan = 0;
      
      if(choice1 && menu==1) {
         jan = mymoney-coke;
         System.out.println("콜라나온다");
      }else if(choice2 && menu==2) {
         jan = mymoney-letsbe;
         System.out.println("레쓰비나온다");
      }else if(choice3 && menu==3) {
         jan = mymoney-cocopam;
         System.out.println("코코팜나온다");
      }else {
    	  jan=mymoney;
    	  System.out.println("잘못된 선택입니다");
      }
      
      // 거스름돈 처리하기
      
      int c1000=0, c500=0, c100=0, c10=0;
      int change=0;
      
      c1000 = jan / 1000;  // jan = 900 , c1000 = 0
      change = jan % 1000;  //change = 900      
      if(c1000 > 0){    	  
    	  System.out.println("지폐 " + c1000 + "장 입니다");
      }
      
      c500 = change / 500; // 900  c500 = 1 
	  change = change % 500;  //  900/500 change = 400	  
      if(c500 > 0) {    	  
    	  System.out.println("500원 동전 " + c500 + "개 입니다");
      }
      
      c100 = change / 100;  // 400  c100=4
	  change = change % 100;  // change = 0
      if(c100 > 0) {
    	  System.out.println("100원 동전 " + c100 + "개 입니다");
      }
      
      c10 = change / 10;  // 0 c10=0
	  change = change % 10;  //change = 0
      if(c10 > 0) {
    	  System.out.println("10원 동전 " + c10 + "개 입니다");
      }
    	  
    	  
      
      sc.close();
      
      
      
      
      
      }
      
   }

