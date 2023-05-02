/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.entity;

import com.uguryagmur.utility.EGender;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Columns;

/**
 *
 * @author Ugur
 */
@Entity
@Table(name = "tbl_user")
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Getter
@Setter
@lombok.ToString
public class User {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long id;
  @Column(nullable = false,length = 60)   
  private  String name;
  @Column(nullable = false,length = 60)
  private  String surname;
  @Column(nullable = false,length = 3)
  private  Long age;
  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private  EGender eGender;
  
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "created_challenges",joinColumns = @JoinColumn(name = "id"))
  private List<Challenge> createdChallenges;
  @OneToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "joined_challenges",joinColumns = @JoinColumn(name = "id"))
  private List<Challenge> joinedChallenges;
 
    
    
    
}
