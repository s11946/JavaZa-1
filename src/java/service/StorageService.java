/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.User;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bartek
 */
public class StorageService {
    
    private List<User> db = new ArrayList<User>();
    
    public void add(User user){
        User newUser = new User(user.getFirstName(), user.getLastName(), user.getEmail(), user.getCompany(), user.getInfo(), user.getJob());
                
    }
    
    public List<User> getAllUsers(){
        return db;
    }


}
