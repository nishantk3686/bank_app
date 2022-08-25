
// In this Module validation process is going on

package com.bank.controller;			//Importing bank controller package i.e., user defined
import java.io.IOException;				//importing exception package
import java.util.regex.Pattern;			//importing pattern package
import com.bank.model.bankModel;		//Importing bank model from bank model package

public class bankController {			//Creating bank controller class
	
	public boolean checkUsername(bankModel bm) throws IOException {		//
		String username = bm.getUserName();
		
		if(Pattern.matches("[a-zA-Z]{5,13}", username))			//Validating User name
		{
			return true;
		}
		else {
			throw new IOException("Username must have <=5 and >=13 only alphabets");
			
		}
	}
   public boolean checkaccPass(bankModel bm) throws IOException{
	   String password = bm.getAccPass();
	   
	   if(Pattern.matches("[A-Za-z0-9@#$&]{8,16}", password))		//Validating Password
	   {
		   return true;
	   }
	   else {
		   throw new IOException(" Password must have <=8 and >=16 only alphabets and digits and 1 special character");
	   }
	   
   }  public boolean checkaccPass1(bankModel bm, String getaccPass) throws IOException{
	   String password = bm.getAccPass();
	   
	   if(getaccPass.equals (password))									//Validating Password
	   {
		   return true;
	   }
	   else {
		   throw new IOException(" Incorrect Password.");
	   }
	   
   }
   public boolean toWithdrawAmount(bankModel bm, String getpass, int withdrawAmount) throws IOException {
		String verifyPassword = bm.getAccPass();
		int accBalance = bm.getAccBal();		
		if (getpass.equals(verifyPassword)) {			//Validating password to withdraw amount.
			if (withdrawAmount < accBalance) {
				return true;
			} else {
				throw new IOException("Sorry can't perform this action beacuse of Insufficient funds in your Account. ");
			}
		} else {
			throw new IOException("Incorrect password. Please try again.");
		}
	}


}

	
	

	
		
		
	


