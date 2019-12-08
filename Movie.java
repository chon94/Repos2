/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.moviedatabase.dto;

/**
 *
 * @author G10-DEV10W3
 */
public class Movie {
    
    private String movieTitle;
    private String releaseDate;
    private String mppaRating;
    private String directorName;
    private String studio;
    private String userRating;
    
  
    public String getMovieTitle(){
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }
    public String getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }
    public String getMppaRating(){
        return mppaRating;
    }
    public void setMppaRating(String mppaRating){
        this.mppaRating = mppaRating;
    }
    public String getDirectorName(){
        return directorName;
    }
    public void setDirectorName(String directorName){
        this.directorName = directorName;
    }
     public String getStudio(){
        return studio;
    }
    public void setStudio(String studio){
        this.studio = studio;
    }
     public String getUserRating(){
        return userRating;
    }
    public void setUserRating(String userRating){
        this.userRating = userRating;
    }
    
}
