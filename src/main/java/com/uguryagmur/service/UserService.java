/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.service;

import com.uguryagmur.entity.User;
import com.uguryagmur.repository.UserRepository;
import com.uguryagmur.utility.MyFactoryRepository;
import com.uguryagmur.utility.MyFactoryService;

/**
 *
 * @author Ugur
 */
public class UserService extends MyFactoryService<User, UserRepository>{

    public UserService() {
        super(new UserRepository());
    }
    
    
}
