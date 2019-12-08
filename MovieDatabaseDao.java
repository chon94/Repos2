/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.dao;

import com.mycompany.moviedatabase.dto.Movie;
import java.util.List;

/**
 *
 * @author G10-DEV10W3
 */
public interface MovieDatabaseDao {
    
    Movie addMovie(Movie movie);
    
    List<Movie> getAllMovie();
    
    Movie getMovie(String movieTitle);
    
    Movie removesMovie(String movieTitle);

    boolean update(Movie movie);
}
