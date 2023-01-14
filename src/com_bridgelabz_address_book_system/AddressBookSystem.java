package com_bridgelabz_address_book_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookSystem {
	
	 	static ArrayList<Contact> contact=new ArrayList<Contact>();
	 	public void addContact() {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("How many persons data do you want to enter : :");
	  	       int num=sc.nextInt();
	  	       sc.nextLine();
	  	       for(int i=1;i<=num;i++) {
			   System.out.println("Contact details of person :: ");	   
	    	   System.out.println("Enter Firstname :: ");
			    String firstname=sc.nextLine();
		       System.out.println("Enter Lastname :: ");          
				String lastname=sc.nextLine();
				System.out.println("Enter Address:: ");
			    String address=sc.nextLine();
			    System.out.println("Enter City :: ");
			    String city=sc.nextLine();
			    System.out.println("Enter State :: ");
			    String state=sc.nextLine();
			    System.out.println("Enter Zip :: ");
			    long z=sc.nextLong();
			    System.out.println("Enter Mobile Number ::");
			    long no=sc.nextLong();	    
			    sc.nextLine();
			    Contact details=new Contact(firstname,lastname,address,city,state,z,no);
			    contact.add(details);
	  	       }
	   	  }
	 	
	 	public  void editContact() {
	 		Scanner sc=new Scanner(System.in);
			System.out.println("Enter first name of person ::");
			String name=sc.nextLine();
			sc.nextLine();
			for(Contact person:contact) {
				if(name.equalsIgnoreCase(person.getFirstname())) {
					System.out.println("Choose field you want to add:");
					System.out.println("1.First Name 2.Last Name 3.Phone Number 4.City\t5.Zip\t6. State 7.Address");
					int choice=sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Re-Correct your firstname");
						person.setFirstname(sc.next());
						break;
					case 2:
						System.out.println("Re-correct your Lastname");
						person.setLastname(sc.next());
						break;
					case 3:
						System.out.println("Re-Correct your Phone Number");
						person.setMobileno(sc.nextLong());
						break;
					case 4:
						System.out.println("Re-Correct your City");
						person.setCity(sc.next());
						break;
					case 5:
						System.out.println("Re-Correct your Zip");
						person.setZip(sc.nextLong());
						break;
					case 6:
						System.out.println("Re-Correct your State");
						person.setState(sc.next());
						break;
					case 7:
						System.out.println("Re-Correct your Address");
						person.setAddress(sc.next());
						break;
				    default:
				    	System.out.println("Enter valid number");
					}
				}
			}
		}
		
		
		public void deleteContact() {
		     boolean flag=false; 
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter a name :: ");
		     String name=sc.nextLine();
	        for(int i=0;i<contact.size();i++) {
	       	 Contact person=contact.get(i);
	       	 if(name.equalsIgnoreCase(person.getFirstname())) {
	       		 System.out.println("Entered name found in the contact");
	       		   flag=true;      
	       		 contact.remove(person);
	       	 }
	        }
	        
	        if(flag==false){
	       		 System.out.println("Entered name not found");
	        }
	        
		}
		
		public  void showContacts() {
			int i = 1;
			for(Contact contact_info : contact) {
				System.out.println(contact.toString());
				i++;
			}
		}
		  

	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Management System");
		
		HashMap<String, AddressBookSystem> addressBooks = new HashMap<>();
		AddressBookSystem book1 = new AddressBookSystem();
		AddressBookSystem book2 = new AddressBookSystem();
		AddressBookSystem book3 = new AddressBookSystem();
		addressBooks.put("AddressBook1", book1);
		addressBooks.put("AddressBook2", book2);
		addressBooks.put("AddressBook3", book3);
		
		int i = 1;
		 while(i != 0) {
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter 1 for AddressBook1 2 for AddressBook2 3 for AddressBook3 :: ");
		 int choose_AddressBook = sc.nextInt();
		 System.out.println("Enter 1 for  add contact, Enter 2 for edit contact , Enter 3 for Delete contact,Enter 4 for showing details of contact");
		 int choice=sc.nextInt();
		 switch(choice) {
		 case 1:
			 	if(choose_AddressBook == 1) {
			 		book1.addContact();
			 	}else if(choose_AddressBook == 2) {
			 		book2.addContact();
			 	}else if(choose_AddressBook == 3) {
			 		book3.addContact();
			 	}else {
			 		System.out.println("Option not found");
			 	}
			 	break;
		      
		 case 2:
			 if(choose_AddressBook == 1) {
			 		book1.editContact();
			 	}else if(choose_AddressBook == 2) {
			 		book2.editContact();
			 	}else if(choose_AddressBook == 3) {
			 		book3.editContact();
			 	}else {
			 		System.out.println("Option not found");
			 	}
			 	break;
			 
		        
		 case 3:
			  if(choose_AddressBook == 1) {
			 		book1.deleteContact();
			 	}else if(choose_AddressBook == 2) {
			 		book2.deleteContact();
			 	}else if(choose_AddressBook == 3) {
			 		book3.deleteContact();
			 	}else {
			 		System.out.println("Option not found");
			 	}
			 	break;
			   
		 case 4:
			 if(choose_AddressBook == 1) {
			 		book1.showContacts();
			 		break;
			 	}else if(choose_AddressBook == 2) {
			 		book2.showContacts();
			 		break;
			 	}else if(choose_AddressBook == 3) {
			 		book3.showContacts();
			 		break;
			 	}else {
			 		System.out.println("Option not found");
			 	}
			 	
		  default:
			  System.out.println("Enter a valid option");
		 }
		 }
	}

}
