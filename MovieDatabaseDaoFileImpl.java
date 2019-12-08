/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.dao;

import com.mycompany.moviedatabase.dto.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G10-DEV10W3
 */
public class MovieDatabaseDaoFileImpl implements MovieDatabaseDao {

    private final ArrayList<Movie> movies = new ArrayList<>();

    @Override
    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }

    @Override
    public List<Movie> getAllMovie() {
        return new ArrayList<Movie>(movies);
    }

    @Override
    public Movie getMovie(String movieTitle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Movie removesMovie(String movieTitle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Movie movie) {
        List<Movie> all = getAllMovie();
        for (int i = 0; i < all.size(); i++) {
            all.set(i, movie);
            
            return true;
        }
        return false;
    }
            

    
   
    }

   /*
public boolean update(Bug bug) throws BugSafariPersistenceException {
        List<Bug> all = findAll();
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getBugId() == bug.getBugId()) {
                all.set(i, bug);
                save(all);
                return true;
            }
        }

        return false;
    }
*/
    

    



