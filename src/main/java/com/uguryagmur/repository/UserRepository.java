/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.repository;

import com.uguryagmur.entity.User;
import com.uguryagmur.utility.MyFactoryRepository;

/**
 *
 * @author Ugur
 */
public class UserRepository extends MyFactoryRepository<User, Long>{

    public UserRepository() {
        super(new User());
    }
    
    
    
}
