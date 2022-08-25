//This Module contains the database of the bank where implementation details and user details are stored
//Only necessary details are shared with the user/customers


package com.bank.model;

public class bankModel {  									//Bank Model class created
	private int accNum;
	private int accBal;
	private int withdrawAmount;
	private int depositAmount;
	private String userName;
	private String accPass;
	public int getAccNum() {								// Get Account number method is to get account number from the the database.
		return accNum;
	}
	public void setAccNum(int accNum) {						// Set Account number is the method to set account number in the bank
		// database.
		this.accNum = accNum;
	}
	public int getAccBal() {								// get account balance is the method display output of account balance to the
															// user, and it can also be used in other classes..
		accBal += depositAmount;
		return accBal;
	}
	public void setAccBal(int accBal) {						// set account balance is the method to set account balance in the Database
		this.accBal = accBal;
	}
	
	public int getWithdrawAmount() {						// Withdraw amount method to display withdraw amount from user and to use it in
															// another class.
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {		// set withdraw amount method to set withdraw amount taken from
															// the user in the bank database.
		this.withdrawAmount = withdrawAmount;				// Account balance is also updated here after subtracting the withdraw amount.
	}
	public int getDepositAmount() {							// Deposit amount method to get deposit amount from user.
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {		// set Deposit amount method to set deposit amount taken from the
		this.depositAmount = depositAmount;					// Account balance is also updated here after adding the deposit amount.
	}
	public String getUserName() {							// Get user name method is to get user name from the database.
		return userName;
	}
	public void setUserName(String userName) {				// set user name method to set user name taken from the user in the bank Database
		this.userName = userName;
	}
	public String getAccPass() {							// get password is used to get password from the database.
		return accPass;
	}
	public void setAccPass(String accPass) {				// set password is used to set the password in database of the bank for its further use
		this.accPass = accPass;
	}
	
	@Override
	public String toString() {								// to string is the method to display all the details of the customer as output.
		return "bankModel [accNum=" + accNum + ", accBal=" + accBal + ", userName=" + userName + ", accPass=" + accPass
				+ "]";
	}
	
	

	
}
