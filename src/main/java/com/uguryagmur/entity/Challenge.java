/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Ugur
 */
@Entity
@Table(name = "tbl_challenge")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Getter
@Setter
@lombok.ToString
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date startDate;
   private Date endDate;
   private String reward;
   private Long limit;
   
   @OneToMany(cascade = CascadeType.ALL)
   private List<User> userList;
   
   
}
