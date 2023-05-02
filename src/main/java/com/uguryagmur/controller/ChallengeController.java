/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.controller;

import com.uguryagmur.entity.Challenge;
import com.uguryagmur.service.ChallengeService;
import java.time.Instant;
import static java.time.LocalDate.now;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ugur
 */
public class ChallengeController {
    private ChallengeService service;

    public ChallengeController() {
        this.service=new ChallengeService();
    }
    public void createChallenge(){
        Scanner scan = new Scanner(System.in);
        Challenge challenge=new Challenge();
        System.out.println("Lütfen yarışma ödülünü giriniz: ");
        challenge.setReward(scan.nextLine());
        System.out.println("Lütfen kullanıcı limitini giriniz: ");
        challenge.setLimit(scan.nextLong());
        challenge.setStartDate(Date.from(Instant.now()));
        challenge.setEndDate(Date.from(Instant.now()));
              service.save(challenge);
    }
    
}
