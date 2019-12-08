/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.ui;

import java.util.Scanner;

/**
 *
 * @author G10-DEV10W3
 */
public class UserIOConsoleImpl implements UserIO{

    Scanner sc = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        return Double.parseDouble(sc.nextLine());
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
       print(prompt);
       double userInput = Double.parseDouble(sc.nextLine());
       while(userInput < min || userInput > max){
           print(prompt);
           userInput = Double.parseDouble(sc.nextLine());
       }
       return userInput;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        return Float.parseFloat(sc.nextLine());
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
       print(prompt);
       float userInput = Float.parseFloat(sc.nextLine());
       while(userInput < min || userInput > max){
           print(prompt);
           userInput = Float.parseFloat(sc.nextLine());
       }
       return userInput;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        print (prompt);
        int userInput = Integer.parseInt(sc.nextLine());
        while (userInput < min || userInput > max) {
            print (prompt);
            userInput = Integer.parseInt(sc.nextLine());
        }
        return userInput;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        return Long.parseLong(sc.nextLine());
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        print (prompt);
        long userInput = Long.parseLong(sc.nextLine());
        while (userInput < min || userInput > max) {
            print (prompt);
            userInput = Long.parseLong(sc.nextLine());
        }
        return userInput;
    }

    @Override
    public String readString(String prompt) {
        print (prompt);
        return (sc.nextLine());
        
    }
   
}
