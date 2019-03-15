/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import contactlist.ContactList;

/**
 *
 * @author hmuhire
 */
public interface DAOInterface {
    public ContactList load(String filename);
 
    
    
}
