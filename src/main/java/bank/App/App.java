/**
 * Author Nishant Kumar.
 * 
 * Hello guys I welcome you all here, It is an application of a Indian Bank to complete the needs of the customer. 
 * 
 * A Program To Illustrate Encapsulation and Abstraction. It also includes the concept of exception handling.
 */

package bank.App;									//Creating bank package

import java.util.Scanner;							//Importing scanner
import static java.lang.System.*;					//Importing all lang package using *
import com.bank.controller.bankController;			//importing user defined package of bank control
import com.bank.model.bankModel;					//importing user defined package of bank model

public class App {									//Main Class
	public static void main( String[] args )
    { 
        bankController bc = new bankController();	//Bank Controller Object is Created
        bankModel bm = new bankModel();				//Bank Model Object
       
        Scanner sc = new Scanner(System.in);		//Scanner Object is Created
        out.println("--------Welcome to Indian Bank--------");
        out.println(" Enter User Name ");
        String accuserName = sc.next();
        bm.setUserName(accuserName);				//User Name is is taken from the user to save it in bank database.
        out.println("Hello  "+bm.getUserName());	//Giving output as Hello "User's Name"
        try {
       	 if(bc.checkUsername(bm)){
       		 out.println("Create Password");		//Taking input password from User
       		 String pass = sc.next();
       		 bm.setAccPass(pass);
       		        		
       		 try {
       			  if(bc.checkaccPass(bm)) {									//Checking given password by the user
       				  	out.println(" Enter Account Number ");				 //Asking account Number From User
       				  	int accNum = sc.nextInt();							//Taking Input
       				  	out.println(" Enter Minimum Balence");				//Asking Minimum Balance Available in Account
       				  	int minaccBal = sc.nextInt();						//Taking Input
       				  	bm.setAccBal(minaccBal);
       	             	int choice = 0;   	
       	             	while (choice <= 5) {								//Choice for he user to perform action
       	             		out.println("Please Enter the choice:- \n "
       	             				+ "Press-1 => To Display Account Details. \n"
       	             				+ "Press-2 => To Deposit Amount. \n"
       	             				+ "Press-3 => To Withdraw Amount. \n"
       	             				+ "Press-4 => To Know Your Account Balence. \n"
       	             				+ "Press-5 => Exit-- \n");
       	             	choice = sc.nextInt();
       	             	switch (choice) {
       	             						case 1 -> {																		//If option 1 is chosen by the user
       	             							out.println("Enter Password to View Account Details");						//Ask for the password 
       	             							String getaccPass = sc.next();												//Taking Input
       	             							try {
       	             								 if(bc.checkaccPass1(bm,getaccPass))									//Matching the password given by the user
       	             								 {																		//If the password is matched by the earlier password given by the user
       	             									out.println("-------- Account Details --------\n" + bm.toString());  //Printing the desired details of the user
       	             								 }	
       	             							}catch (Exception e) {
            	             								out.println(e.getMessage());       	            			 //If Password is wrong the message will print							
       	             							
       	             							}
       	             						     }
       	             							case 2 -> {														//If option 2 is chosen by the user
       	             								   		out.println(" Enter Password For Deposit Amount");	//Ask for the password
       	             								   		String getaccPass = sc.next();						//Taking Input
       	             								   	try {
       	             								   			if(bc.checkaccPass1(bm,getaccPass))				//Matching the password given by the user
       	             								   			{
       	             								   				out.println("Enter Amount to Deposit ");	//Entering the amount to be deposited by the user
       	             								   				int addAmt = sc.nextInt();					//Taking input
       	             								   				bm.setDepositAmount(addAmt);
       	             								   				out.println("Success !! Your Final Account Balence is "+ bm.getAccBal());  //Printing final amount in the account 
       	             								   			}
       	             								   	}
       	             								   	catch (Exception e) {
       	             								   		out.println(e.getMessage());
       	             								   	}
       	             							}           		
       	             							case 3 -> {															//If option 3 is chosen by the user
       	             								out.println("Enter Password to Withdraw Amount");				//Asking Password
       	             								String getPass = sc.next();										//Taking input
       	             								out.println("Enter Amount To Withdraw");						//Asking the amount to be withdrawn from the account
       	             								int withdrawAmt = sc.nextInt();									//Taking Input
       	             								try {
       	             									if(bc.toWithdrawAmount(bm,getPass,withdrawAmt)) {			//Checking Password
       	             										bm.setWithdrawAmount(withdrawAmt);
       	             										out.println("Your Money Withdrawn Successfully. ");
       	             									}
       	             								} catch (Exception e) {
       	             									out.println(e.getMessage());
       	             								}
       	             							}
       	             							case 4 -> {															//If option 4 is chosen by the user
       	             							out.println("Enter Password to Check Account Balence");				//Asking password
   	             								String getPass = sc.next();											//Taking input
   	             								try {
   	             									if(bc.checkaccPass1(bm,getPass)) {								//Verifying password
   	             										out.println("Your Account Balence are " +bm.getAccBal() + "in your account");  //Printing balence of the user
   	             									}
   	             								} catch (Exception e) {
   	             									out.println(e.getMessage());
   	             								}      	             							}
       	             								default -> {out.println("Thank you for your Visit");
       	             									System.exit(0);												//Exiting program
       	             								}
       	             							}
       	             							    	             						     
            	
            	 }
       			  }}
       		
        catch(Exception r ) {
       	 out.println(r.getMessage());
       	      }
       	 }
        }
        catch (Exception e) {
        	out.println(e.getMessage() + " Please Try Again");		//Message for wrong input
        	System.exit(0);											//Exiting
        }
        sc.close();													//Closing Scanner
    }
}

