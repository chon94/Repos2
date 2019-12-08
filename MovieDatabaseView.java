/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.ui;

import com.mycompany.moviedatabase.dto.Movie;
import java.util.List;

/**
 *
 * @author G10-DEV10W3
 */
public class MovieDatabaseView {
    
     UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List All Movies");
        io.print("2. Add a Movie");
        io.print("3. Edit Movie Information");
        io.print("4. Remove a Movie");
        io.print("5. Display a Movie Information");
        io.print("6. Search For a Movie By Title");
        io.print("7. Exit");

        return io.readInt("Please select from the above choices.", 1, 7);
    }
    
        public Movie getNewMovie(){
            String movieTitle = io.readString("Please enter Movie Title");
            String releaseDate = io.readString("Please enter Release Date");
            String mppaRating = io.readString("Please enter MPPA Rating");
            String directorName = io.readString("Please enter Director Name");
            String studio = io.readString("Please enter the Studio");
            String userRating = io.readString("Please enter User Rating");
            
            Movie currentMovie = new Movie();
            currentMovie.setMovieTitle(movieTitle);
            currentMovie.setReleaseDate(releaseDate);
            currentMovie.setMppaRating(mppaRating);
            currentMovie.setDirectorName(directorName);
            currentMovie.setStudio(studio);
            currentMovie.setUserRating(userRating);
            return currentMovie;
        }
        
        public void displayCreateMovieBanner(){
            io.print("=== Create Movie ===");
        }
        
        public void displayCreateSuccessBanner() {
            io.readString(
            "Movie successfully created.  Please hit enter to continue");
        }

   

   public void displayMovieList(List<Movie> movieList) {
    for (Movie currentMovie : movieList) {
        io.print(currentMovie.getMovieTitle() + ": "
                + currentMovie.getReleaseDate() + " "
                + currentMovie.getMppaRating() + " "
                + currentMovie.getDirectorName() + " "
                + currentMovie.getStudio() + " "
                + currentMovie.getUserRating());
    }
    io.readString("Please hit enter to continue.");
}
   public void displayDisplayAllBanner() {
    io.print("=== Display All Movies ===");
}
   
   public Movie update(Movie movie) {

        String movieName = io.readString(
                String.format("Movie Name (%s):", movie.getMovieTitle()));
        if (!movieName.isBlank()) {
            movie.setMovieTitle(movieName);
        }

        return movie;
    }

    public void displayMessage(String message) {
        io.print(message);
    }   
    
     public int readMovieTitle(String header) {
        io.print("");
        io.print(header);
        io.print("============");
        return io.readInt("Movie title?:");
    }
}
