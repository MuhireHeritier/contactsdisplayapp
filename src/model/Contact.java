
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Builds a contact class which implements the IDisplayable interface
 * It provides information 
 * Such as name, phone number, email, date and contact type for every new contact registered.
 * @author hmuhire
 */
public class Contact implements IDisplayable{
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private Calendar dateCreated;
    private String contactType;
    
    /**
     * Constructs an empty new Contact. It helps to initialize the class variables
     */
    public Contact(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.dateCreated = getNow();
        this.contactType = contactType;
}
    /**
     * Constructs a new Contact which takes several parameters for a contact specified by arguments
     * @param firstName
     * @param lastName
     * @param telephoneNumber
     * @param email
     * @param contactType 
     */
    public Contact(String firstName, String lastName, String telephoneNumber, String email, String contactType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.dateCreated = getNow();
        this.contactType = contactType;
    }
    /**
     * Constructor with parameters which helps to initialize the global variables
     * @param firstName
     * @param lastName
     * @param telephoneNumber
     * @param email
     * @param contactType
     * @param dateCreated 
     */
    public Contact(String firstName, String lastName, String telephoneNumber, String email, String contactType, Calendar dateCreated){
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.contactType = contactType;
        this.dateCreated = dateCreated;
    }
    
    /**
     * Gets the first name 
     * @return The first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets the first name of user
     * @param firstName set the first name 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Provide last name of type string 
     * @return The last name 
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Sets the last name of the user
     * @param lastName Assign the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Gets the telephone number
     * @return The telephone number
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    /**
     * 
     * Sets the telephone number of the user
     * @param telephoneNumber Telephone number of the user
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    /**
     * Gets the email
     * @return email
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets a email of type string
     * @param email Email of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Returns the date a contact was created
     * @return The date a contact was created
     */
    public Calendar getDateCreated() {
        return dateCreated;
    }
    /**
     * Returns the type of contact
     * @return The contactType
     */
    public String getContactType() {
        return contactType;
    }
    /**
     * Set the contactType of string type
     * @param contactType 
     */
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
    /**
     * Creates the appropriate date format for the date created
     * @param dateCreated date the contact was created 
     * @return the date in a well specified standard format
     */
    private static String formatSDateTime(Calendar dateCreated) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:MM:SS");
        Calendar now = Calendar.getInstance();  
        return dateFormat.format(dateCreated.getTime());
        //return dateFormat.format(dateCreated);
    }
    /**
     * Returns the current date
     * @return The time for now after creating the contact
     */
    private Calendar getNow() {
        Calendar now = Calendar.getInstance();  
        return now;
    }    
    /**
     * Display the appropriate contact information to the user.
     */
    @Override
    public void display() {
        System.out.println("First name :"+getFirstName()+"\n"+"Last name: "
                +getLastName()+"\n"+"Telephone number : "+getTelephoneNumber()+
                "\n"+"Email :"+getEmail()+"\nContact type: "+this.getContactType()+"\t\tcreated on "+formatSDateTime(getDateCreated()));
    }
    /**
     * Returns an empty string
     * @return empty string 
     */
    @Override
    public String toString(){
        return "First name :"+getFirstName()+"\n"+"Last name: "
                +getLastName()+"\n"+"Telephone number : "+getTelephoneNumber()+
                "\n"+"Email :"+getEmail()+" created on "+formatSDateTime(getDateCreated());
    }   
    
}
