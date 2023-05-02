/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uguryagmur;

import com.uguryagmur.controller.ChallengeController;
import com.uguryagmur.controller.UserController;
import com.uguryagmur.entity.User;
import com.uguryagmur.service.UserService;
import com.uguryagmur.utility.EGender;
import java.util.Scanner;

/**
 *
 * @author Ugur
 */
public class YarismaHibernate {

    public static void main(String[] args) {
        UserService service=new UserService();
         Scanner scan = new Scanner(System.in);
        User user1 = new User();
        System.out.println("Lütfen isim giriniz");
        user1.setName(scan.nextLine());
        System.out.println("Lütfen soyisim giriniz");
        user1.setSurname(scan.nextLine());
        System.out.println("Lütfen yaşınızı giriniz");
        user1.setAge(scan.nextLong());
        user1.setEGender(EGender.OTHER);
        service.save(user1);
    }
}
