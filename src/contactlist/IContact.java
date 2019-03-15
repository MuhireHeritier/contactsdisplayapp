/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

import model.Contact;

/**
 *This creates an interface for contact display functions
 * @author hmuhire
 * @param <T> Takes generic type T
 * 
 */
public interface IContact<T> {
    public void insertContact(Contact contact);
    public void removeContact(String fname);
    public void searchByTelephone(String telephone);
    public void searchByName(String name);    
}
