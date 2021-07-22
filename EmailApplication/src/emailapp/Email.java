package emailapp;

import java.util.Scanner;

public class Email {
	private String FirstName;
	private String LastName;
	private String Department;
	private String password;
	private String email;
	private int lengthpassword = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuff = "aeycompany.com";
	
	//constructor
	public Email(String fname,String lname) {
		this.FirstName = fname;
		this.LastName = lname;
		System.out.println("Email created: "+ this.FirstName +" " + this.LastName);
		// call for asking the department and return the department
		this.Department = setDepartment();
		System.out.println("Department Set to: "+this.Department);
		//call for the password
		this.password = randomPassword(lengthpassword);
		System.out.println("Your Password:"+this.password);
		//combine element to get the email
		email = FirstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+Department+"."+ companySuff;
		System.out.println("Your Email is: "+ this.email);
	}
	//Ask for the Department
	private String setDepartment() {
		System.out.println("Enter the Department Code:");
		System.out.println("1 for sales");
		System.out.println("2 for the Development");
		System.out.println("3 for the Accounting");
		System.out.println("0 for None");
		Scanner sc = new Scanner(System.in);
		int departmentchoice = sc.nextInt();
		if(departmentchoice == 1) { return "sales"; }
		else if(departmentchoice == 2) { return "Development"; }
		else if(departmentchoice == 3) { return "Accounting"; }
		else { return "" ; }
	}
	//set the mailBox Capacity
	public void setMailCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//generate the random Password
	private String randomPassword(int l) {
		String pssword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123@$&*1234567890abcdefghijklmnopqrstuvwxyz ";
		char[] password = new char[l];
		for(int i=0;i<l;i++) {
			int rand= (int)(Math.random()*pssword.length());
			password[i] = pssword.charAt(rand);
		}
		return new String(password);
	}
	//set the alternate Email
	public void setAlternateEmail(String eml) {
		this.alternateEmail = eml;
	}
	//change the password
	public void changePasswor(String pass) {
		this.password = pass;
	}
	
	//show the mailbox Capacity
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	//get the alternate email
	public String getAlternateEmail() {
		return (this.alternateEmail);
	}
	public String getPassword() {
		return this.password;
	}
	// show info
	public void showInfo() {
		System.out.println();
		System.out.println("<-------------Info------------->");
		System.out.println();
		System.out.println("Name: "+this.FirstName+" "+ this.LastName);
		System.out.println("Department: "+this.Department);
		System.out.println("Email: "+this.email);
		System.out.println("Alternate Email: "+this.alternateEmail);
		System.out.println("MailBoxCapacity: "+this.mailboxCapacity);
		System.out.println();
		System.out.println("<-------------Thanks------------->");
		System.out.println();
	}
}
