
package contactlist;

import model.Contact;

/**
 * This class implements a Node. It specifies the components of a Node.
 * @author hmuhire
 * @param <T>
 */
public class Node<T> {
    private Contact contact;
    public Node<T> previous;
    public Node<T> next;
    
    /**
     * Constructs a Node with contact
     * @param contact the contact of the node
     */
    public Node(Contact contact){
        previous = null;
        this.contact = contact;
        next = null;       
    }
    /**
     * Constructs a new node whose previous and next are specified by Node 
     * arguments, and contact which is specified by Contact argument
     * @param previous
     * @param contact
     * @param next 
     */
    public Node(Node previous, Contact contact, Node next){
        this.previous = previous;
        this.contact = contact;
        this.next = next;
    }
    /**
     * Get the previous node
     * @return the previous node
     */
    public Node<T> getPrevious() {
        return previous;
    }
    /**
     * Sets the previous node
     * @param previous Used to identify the previous node
     */
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
    /**
     * Gets the next node
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    }
    /**
     * Sets the next node
     * @param next This is the next node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }  
    /**
     * Gets the contact 
     * @return The node contact
     */
    public Contact getContact() {
        return contact;
    }
    
    /**
     * Sets the contact
     * @param contact Node contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
}
