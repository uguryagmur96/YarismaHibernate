/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.service;

import com.uguryagmur.entity.CompetitorArea;
import com.uguryagmur.repository.CompetitorAreRepository;
import com.uguryagmur.utility.MyFactoryRepository;
import com.uguryagmur.utility.MyFactoryService;

/**
 *
 * @author Ugur
 */
public class CompetitorAreaService extends MyFactoryService<CompetitorArea, CompetitorAreRepository>{

    public CompetitorAreaService() {
        super(new CompetitorAreRepository());
    }

    
}
