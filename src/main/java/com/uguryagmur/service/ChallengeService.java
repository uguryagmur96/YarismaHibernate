/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.service;

import com.uguryagmur.entity.Challenge;
import com.uguryagmur.repository.ChallengeRepository;
import com.uguryagmur.utility.MyFactoryRepository;
import com.uguryagmur.utility.MyFactoryService;

/**
 *
 * @author Ugur
 */
public class ChallengeService extends MyFactoryService<Challenge, ChallengeRepository>{

    public ChallengeService() {
        super(new ChallengeRepository());
    }

   
    
    
}
