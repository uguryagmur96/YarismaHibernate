/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.repository;

import com.uguryagmur.entity.CompetitorArea;
import com.uguryagmur.utility.MyFactoryRepository;

/**
 *
 * @author Ugur
 */
public class CompetitorAreRepository extends MyFactoryRepository<CompetitorArea, Long>{

    public CompetitorAreRepository() {
        super(new CompetitorArea());
    }
    
    
}
