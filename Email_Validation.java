package Java_assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Validation {
	static String [] dataBase= {"vedanadhareddy123@gmail.com", "vedareddy500@gmail.com","vedanadhareddy199@gmail.com", "vedanadhareddy143@gmail.com"};


	public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String emailID;
		while (true){
	     System.out.println("---- Please Enter your email ID--- ");
	     emailID = inp.next();
	     while(VerfiyFormate(emailID))
	     {
		     System.out.println("---- Please Enter your email ID with valid formate ex: eamaple@domain.com --- ");
		     emailID = inp.next();
	     }

	     VerfiyID(emailID);


	     System.out.println("");

		}

	}

	private static void VerfiyID(String ID)
	{
		boolean accessFlag= false;
	     for(String id : dataBase)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 accessFlag=true;
		    	 System.out.println(ID );
	    		 break;
	    	 }   	 

	     }

	     if(accessFlag==false)
	     {
	    	 System.out.println( ID );

	     }


	}

	private static boolean VerfiyFormate(String ID)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())
		{
			return true;

		}else 
		{
			return false;

		}

	}

}
