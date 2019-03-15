
package contactlist;

import model.Contact;

/**
 * Creates a ContactList class which implements the interface of IContact. Implements all the optional contact operations
 * @author hmuhire
 */
public class ContactList implements IContact<Contact> {
    private Node<Contact> head;
  //  private Node<T> tail;
    private Node<Contact> pointer;
    private int size;  
    static char delimiter = ',';
    
    /**
     * Constructs an empty contactList 
     */
    public ContactList(){
        head = new Node<>(null,null,null);
        pointer = new Node<>(null,null,null);;
        size = 0;
    }    
    /**
     * Returns the first element in the list
     * @return the head 
     */

    public Node<Contact> getHead() {
        return head;
    }
    /**
     * 
     * @param head The first node in the list
     */
    public void setHead(Node<Contact> head) {
        this.head = head;
    }
    /**
     * Sets the pointer points to the next element in the list
     * @param c points to the next Node
     */
    public void setnextItem(Node<Contact> c){
        this.pointer = c;
    }
    /**
     * Returns the number of elements in the list
     * @return The number of elements in the list
     */
    public int getSize() {
        return size;
    }
    /**
     * Sets number of contacts in the list
     * @param size The size of the list
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     *  Inserts the specified contact at the end of the contact List
     * @param contact The contact to be added in the list
     */
    @Override
    public void insertContact(Contact contact) {
        Node<Contact> nodetmp = new Node<>(null,contact,null);
        if(this.size ==0){
            nodetmp.setNext(nodetmp);
            nodetmp.setPrevious(nodetmp);
            this.setHead(nodetmp); 
            this.setnextItem(head);
        }//if the size is not equal to zero, means greater than 0 in this case
        else{
            nodetmp.setPrevious(pointer);
            pointer.setNext(nodetmp);
            head.setPrevious(nodetmp);
            nodetmp.setNext(head);
            this.setHead(nodetmp);
       }
       size++;
    }
    
    /**
     * Removes the contact at the specified position in this list
     * @param fname The name of the specific contact to be removed from the list
     */
    @Override
    public void removeContact(String fname) {        
        for(int i = 0; i < this.size; i++){
         if(this.head.getContact().getFirstName().equals(fname) || this.head.getContact().getLastName().equals(fname)){//if the head is the only thing in the list and it matches the object
            System.out.println("removing contact: "+this.head.getContact().getFirstName()+" "+this.head.getContact().getLastName());
             this.head.getPrevious().setNext(this.head.getNext());
            this.head.getNext().setPrevious(this.getHead().getPrevious());
            this.size--;
        }   
         this.setHead(this.head.getNext());
    }                               
}
    /**
     * Allows to search a contact using telephone number and then retrieves that specified contact
     * @param telephone The Telephone number searched from the contactList
     */
    @Override
    public void searchByTelephone(String telephone) {
        Node<Contact> temp = head;
        
        if(size == 0){
            System.out.println("This Contact List is Empty"); 
        }
        
        else{
             for(int i = 1; i <=size; i++){                
                if(telephone.equals(temp.getContact().getTelephoneNumber())){
                     temp.getContact().display();
                     return;
                }
                else{
                    temp = temp.getNext();
                }
                
            }System.out.println("Number does not exist!");
        }
    }
    /**
     * Enables to search a contact using a name, and then retrieve that contact from contact List
     * @param name The name being searched from the contactList
     */
    @Override
    public void searchByName(String name) {
        // Node<Contact> temp = head;
        if(size == 0){
            System.out.println("The list is empty!! sorry");
        }
        else {
            int n = 0;
            while(this.getHead()!= null && n < size){
                if(head.getContact().getFirstName().equals(name) || head.getContact().getLastName().equals(name)){                   
                    this.head.getContact().display();    
                    return;
                }
                else{
                    this.setHead(head.getNext());                    
                }
                n++;
            }
            
        }
    }
    /**
     * Prints list of specified contacts information
     */
    public void print(){
        Node currentNode = head;
        int n = 0;
        while(currentNode != null && n < this.size){
            currentNode.getContact().display(); 
            currentNode = currentNode.next;
            n++;
        }
    }
    /**
     * 
     * @param delimiter Used for the format to identify the beginning and end of a character string, 
     * which helps separate contact elements
     * @return Empty space
     */
    public String toString(char delimiter) {
        //String output = "";
        return "";
    }
}
