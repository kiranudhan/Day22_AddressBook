package com_bridgelabz_address_book_system;

import java.util.Scanner;

public class AddressBookSystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Management System");
		ContactsOperationsImpl contacts=new ContactsOperationsImpl();
		 Scanner sc=new Scanner(System.in);
		 while(true) {
		 System.out.println("Enter option you want :: ");
		 System.out.println("1.Add contact 2.Edit Contact 3.Delete Contact");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
		       contacts.addContact();
		        break;
		 case 2:
		        contacts.editContact();
		        break;
		 case 3:
			    contacts.deleteContact();
		  default:
			  System.out.println("Enter a valid option");
		 }
		 }
	}

}
