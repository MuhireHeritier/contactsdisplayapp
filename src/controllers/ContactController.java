
package controllers;

import contactlist.ContactList;
import contactlist.Node;
import model.Contact;
import daos.DAOTextImpl;
import helpers.InputHelper;
import java.util.Scanner;

/**
 *
 * @author hmuhire
 * Creates a class ContactController which helps to create a menu for the contactList
 */
public class ContactController {
    DAOTextImpl mydata = new DAOTextImpl();
    public ContactList contactList; 
    InputHelper input = new InputHelper();
    Scanner inputi = new Scanner(System.in);
    /**
     * Constructs an empty ContactController which initialize the contactList object to the file loaded
     */
    public ContactController(){
         contactList = mydata.load("contacts.txt");    
    }
    /**
     * Run a list of options available on the menu for the List
     */
     public void run() {
        boolean finished = false;
        
        do {
            char choice = displayListMenu();
            switch (choice) {
                case 'A': 
                    addContact();
                    break;
                case 'B':  
                    deleteContact();
                    break;
                case 'C': 
                    listContacts(); 
                    break;                    
                case 'D': 
                    searchContact();
                    break;
                case 'F':
                    printExistingContacts();
                    break;
                case 'Q': 
                    finished = true;
            }
        } while (!finished);
    }
    
     /**
      * Displays a list of options available on the list menu and their assigned characters
      * @return a prompt and its valid characters representing options to be selected from
      */
    private char displayListMenu() {
        InputHelper input = new InputHelper();
        //Scanner input = new Scanner(System.in);
        System.out.print("\nA. Add Contact");
        System.out.print("\tB. Delete Contact");        
        System.out.print("\tC. List Contact");
        System.out.print("\tD. Search contact"); 
        System.out.println("\tF. Existing contact");
        System.out.print("Q. Quit\n");
        try {
        return input.readCharacter("Enter choice", "ABCDFQ");  
        } catch(java.lang.RuntimeException ex) {
            System.out.format("\033[31m%s\033[0m%n","Please try again with the available options below.");
        }
        return 0;
        
    }
    /**
     * Creates a new contact. Allows user to add a contact by prompting him/her to enter information details for the contact
     */
    private void addContact() {
        System.out.println("= Add Contact =\n"+ "=============");
        Contact contact = new Contact();        
        String fname, lname, phoneNumber, email, typeC; 
            do{
                System.out.println("Enter first name:\t ");
            fname = inputi.nextLine();
            contact.setFirstName(fname);
                if(fname.equals("")){
                    System.out.format("\033[31m%s\033[0m%n","Please enter a valid name");
                }              
            }while(fname.equals(""));
            do{
                System.out.println("Enter last name:\t ");
            lname = inputi.nextLine();
            contact.setLastName(lname);
                if(lname.equals("")){
                    System.out.format("\033[31m%s\033[0m%n","Please enter a valid name");
                }              
            }while(lname.equals(""));
            do{
                System.out.println("Enter phone number:\t ");
            phoneNumber = inputi.nextLine();
            contact.setTelephoneNumber(phoneNumber);
                if(phoneNumber.equals("")){
                    System.out.format("\033[31m%s\033[0m%n","Please enter a valid phone number");
                }              
            }while(phoneNumber.equals(""));
            do{
                System.out.println("Enter email:\t ");
            email = inputi.nextLine();
            contact.setEmail(email);
                if(email.equals("")){
                    System.out.format("\033[31m%s\033[0m%n","Please enter a valid email");
                }              
            }while(email.equals(""));
            do{
                System.out.println("Enter contact type:\t ");
            typeC = inputi.nextLine();
            contact.setContactType(typeC);
                if(typeC.equals("")){
                    System.out.format("\033[31m%s\033[0m%n","Please enter a valid name");
                }              
            }while(typeC.equals(""));
        contact.getDateCreated();
        this.contactList.insertContact(contact);
    }
    /**
     * Displays the search menu. It can either be by telephone number or by name. 
     * A user get to chose which one s/she wants. 
     * @return Prompts with specified options to base on while selecting
     */
       private char displaySearchMenu(){
        InputHelper input = new InputHelper();
        System.out.print("\n1. Seach by Phone number");
        System.out.print("\t\t2. Search by Name");
        System.out.println("\n");
        try {
        return input.readCharacter("Enter choice either (1)phone number or (2)name", "12");  
        } catch(java.lang.RuntimeException ex) {
         //System.out.format("\033[31m%s\033[0m%n","Please try again with the available options below.");
        }
        return 0;
    }
    /**
     * Removes a specified contact from the contactList
     */
    
    private void deleteContact(){
        System.out.format("Delete Contact\n"+"===============");
        System.out.println("\nEnter the contact name you want to delete: ");
        String name = inputi.nextLine();
        contactList.removeContact(name);
    }
    /**
     * Retrieves a list of contacts currently available in the List.
     */
    private void listContacts() {        
        System.out.println("List Contacts\n"+"==============");
        Node<Contact> temp = this.contactList.getHead();
   
            for(int i = 1; i<=this.contactList.getSize(); i++){  
                    System.out.println(temp.getContact());
                    System.out.println("\n");
                    temp = temp.next;                    
                    //return;
                }
    }      
    /**
     * Searches a contact either using a specified telephone number or name depending on the 
     * user choice, and then retrieves that particular contact from the List and display it. 
     */
    private void searchContact(){
        System.out.println("Search Contact\n"+"==============");
        char option = displaySearchMenu();
        switch(option){
            case '1':
                System.out.println("Enter a phone number: ");                
                String number = inputi.nextLine();
                contactList.searchByTelephone(number);
     
                break;
                
            case '2':
                System.out.println("Enter a name you're searching: ");
                String name = inputi.nextLine();
                contactList.searchByName(name);
                break;
            default:
            System.out.format("\033[31m%s\033[0m%n","Enter the right option please!!");
            break;   
        }
    }
    /**
     * Prints the contacts saved in the file
     */
    private void printExistingContacts(){
        System.out.println("Existing contacts\n"+"=================");
        DAOTextImpl dao = new DAOTextImpl();
        dao.load("contacts.txt").print();
    }

}  
