/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.controller;

import com.mycompany.moviedatabase.dao.MovieDatabaseDao;
import com.mycompany.moviedatabase.dao.MovieDatabaseDaoFileImpl;
import com.mycompany.moviedatabase.dto.Movie;
import com.mycompany.moviedatabase.ui.MovieDatabaseView;
import com.mycompany.moviedatabase.ui.UserIO;
import com.mycompany.moviedatabase.ui.UserIOConsoleImpl;
import java.util.List;

/**
 *
 * @author G10-DEV10W3
 */
public class MovieDatabaseController {
    
    MovieDatabaseView view = new MovieDatabaseView();
    MovieDatabaseDao dao = new MovieDatabaseDaoFileImpl();
    private UserIO io = new UserIOConsoleImpl();
    
    private void listMovies() {
    view.displayDisplayAllBanner();
    List<Movie> movieList = dao.getAllMovie();
    view.displayMovieList(movieList);
}

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            
            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listMovies();
                    break;
                case 2:
                    createMovie();
                    break;
                case 3:
                    io.print("EDIT MOVIE");
                    break;
                case 4:
                    io.print("REMOVE MOVIE");
                    break;
                case 5:
                    io.print("DISPLAY MOVIE INFO");
                    break;
                case 6:
                    io.print("SEARCH MOVIE BY TITLE");
                    break;
                case 7:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createMovie() {
    view.displayCreateMovieBanner();
    Movie newMovie = view.getNewMovie();
    dao.addMovie(newMovie);
    view.displayCreateSuccessBanner();
}
    
    
}
