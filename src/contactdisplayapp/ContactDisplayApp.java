
package contactdisplayapp;

import controllers.ContactController;

/**
 * Creates a class that ensures the display of the App. It is used to run the whole application.
 * @author hmuhire
 * 
 */
public class ContactDisplayApp {
    /**
     * Creates a new contactController object and use it to run the application 
     */
    public static void run(){
        System.out.println("======  Contact Display App  ====\n" + "\t=====================");
        
        ContactController contactController = new ContactController();  
        contactController.run();
        System.out.println("Thank you for using this app. Happy!!\n");        
    }
    
    /**
     * Runs the application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactDisplayApp displayApp = new ContactDisplayApp();
        displayApp.run();

    }
    
}
