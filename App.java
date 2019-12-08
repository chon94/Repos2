/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase;

import com.mycompany.moviedatabase.controller.MovieDatabaseController;

/**
 *
 * @author G10-DEV10W3
 */
public class App {
    
    public static void main(String[] args) {
        MovieDatabaseController controller = new MovieDatabaseController();
        controller.run();
    }   
}
