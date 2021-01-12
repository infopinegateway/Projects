package com.sample.jca;

import java.security.MessageDigest;
import java.util.Scanner;

public class MessageDigestExample {
   public static void main(String args[]) throws Exception{
      //Reading data from user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the message");
      String message = sc.nextLine();
	  
      //Creating the MessageDigest object 
      MessageDigest md = MessageDigest.getInstance("SHA-256");

      //Passing data to the created MessageDigest Object
      md.update(message.getBytes());
      
      //Compute the message digest
      byte[] digest = md.digest();
      System.out.println("SHA-256: "+digest + "Algorithm :"+ md.getAlgorithm());
      
       
      md = MessageDigest.getInstance("SHA-1");

      //Passing data to the created MessageDigest Object
      md.update(message.getBytes());
      
      //Compute the message digest
      digest = md.digest();      
      System.out.println("SHA-1: "+digest);
      
      md = MessageDigest.getInstance("MD5");

      //Passing data to the created MessageDigest Object
      md.update(message.getBytes());
      
      //Compute the message digest
      digest = md.digest();      
      System.out.println("MD5: "+digest);
      
      //Converting the byte array in to HexString format
      StringBuffer hexString = new StringBuffer();
      
      for (int i = 0;i<digest.length;i++) {
         hexString.append(Integer.toHexString(0xFF & digest[i]));
      }
      System.out.println("Hex format : " + hexString.toString());     
      
      
   }
}