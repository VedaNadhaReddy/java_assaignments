package Java_assignments1;

import java.util.ArrayList;
import java.util.Scanner;

public class Email_Validation {
	public static void main(String[] args) {
		          Scanner sc = new Scanner(System.in); 
		          System.out.print("Enter  email_ID: ");  
		          String e = sc.nextLine();  
		          sc.close();
		          ArrayList<String> arr=new ArrayList<String>();   
			      arr.add("vedanadhareddy123@gmail.com");
			      arr.add("vedareddy500@gmail.com");
			      arr.add("dharani@gmail.com");
			      arr.add("karna@gamail.com");
			      arr.add("venu@gamial.com");
			      if (arr.contains(e)){
			    	System.out.println("Valid Email_ID");
			       }
			      else {
			    		System.out.println("Unvalid Email_ID");
			       }
	}
}

