package com_bridgelabz_address_book_system;

public class AddressBookSystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Management System");
		ContactsOperationsImpl contacts=new ContactsOperationsImpl();
		contacts.addContact();
	}

}
