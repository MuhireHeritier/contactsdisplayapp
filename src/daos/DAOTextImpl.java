
package daos;

import contactlist.ContactList;
import model.Contact;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Creates a class DAOTextImpl which implements DAOInterface
 * It helps to implement the operation set in the interface which allows to load a file of contacts
 * @author hmuhire
 * 
 */
public class DAOTextImpl implements DAOInterface{
    static final String delimiter = ", ";
    
    /**
     * Loads contacts from a file and pass them to a contactList
     * @param filename file that contain contacts
     * @return contactList a list of contact 
     */
    @Override
    public ContactList load(String filename) {
        ContactList contactList = new ContactList();
        BufferedReader brObj = null;
        
        try{
            FileReader frObj = new FileReader(filename);
            brObj = new BufferedReader(frObj);
            String tempHolder [];
            String currentLine = brObj.readLine();
            while(currentLine != null){
                tempHolder = currentLine.split(delimiter);
                String firstName = stripQuotes(tempHolder[0]);
                String lastName = stripQuotes(tempHolder[1]);
                String phone = stripQuotes(tempHolder[2]);
                String email = stripQuotes(tempHolder[3]);
                String contactType = stripQuotes(tempHolder[4]);
                String dateString = stripQuotes(tempHolder[5]); 
                
                Calendar date = Calendar.getInstance();
                
                SimpleDateFormat obj = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                try{
                Date formatDate = obj.parse(dateString);
                date.setTime(formatDate);
                }
                catch(ParseException ex){
                    
                }
                
                Contact contact = new Contact(firstName, lastName, phone, email, contactType, date);
                //Contact contact = new Contact();
                contactList.insertContact(contact);
                
                currentLine=brObj.readLine();  
            }            
            brObj.close();            
        }
        catch(IOException ex){
            ex.printStackTrace();
            System.out.println("File typed Not Found");
        } 
        return contactList;
    }
    /**
     * Extract the characters from a string, then return new substring
     * @param str strips the quotes from a provided string
     * @return 
     */
    private String stripQuotes(String str){ 
       return str.substring(1, str.length()-1);
   }   
    
}
