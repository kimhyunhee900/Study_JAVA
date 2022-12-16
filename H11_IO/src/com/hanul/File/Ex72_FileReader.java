package com.hanul.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex72_FileReader {

   public static void main(String[] args) {
      // 문자 파일 읽고 쓰기
      FileReader reader = null;
      try {
         reader = new FileReader("reader.txt");
         while(true) {         
            
//               int data;
//               while((data=reader.read()) != -1 ) {
//                  char ch = (char) reader.read();
//                  System.out.println(ch);
//               }
            int data = reader.read();
            if(data == -1) {
               break;
            }
            char ch = (char) reader.read();
            System.out.println(ch);
            
                        
         }
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         try {
            reader.close();            
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      try {
         reader = new FileReader("reader.txt");
         char[] data = new char[100];
         
         int no = reader.read(data);
         System.out.println(no);
         for(int idx=0; idx<no; idx++) {
            System.out.println(data[idx]);
         }
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

}