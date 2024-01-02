package com.test3;

import java.util.Arrays;

/*
 * 8)	Create an array of Theatre to maintain data in sorted order of Movie Rating 
		Theatre (Theatreid,Theatrename,location,Movie)
		Movie (Movieid,Moviename,Rating)

 */

 class Movie{
	int movieId;
	String movieName;
	int rating;
	
	public Movie() {
		 
		movieId=0;
		movieName="";
		rating=0;
	}
	public Movie(int movieId, String movieName, int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [ Id=" + movieId + ",  Name=" + movieName + ", Rating=" + rating + "]";
	}
	
}
public class Theatre {

	int theatreId;
	String theatreName;
	String location;
	Movie mov;
	
	public Theatre() {
		 
		theatreId=0;
		theatreName="";
		location="";
		mov=new Movie();
	}
	
	public Theatre(int theatreId, String theatreName, String location, Movie mov) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.mov = mov;
	}
	
	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMov() {
		return mov;
	}

	public void setMov(Movie mov) {
		this.mov = mov;
	}

	
	@Override
	public String toString() {
		return "Theatre [ Id=" + theatreId + ",  Name=" + theatreName + ", Location=" + location + mov + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Movie mov1=new Movie(01,"RRR",5);
		Movie mov2=new Movie(02,"3 idiots",3);
		Movie mov3=new Movie(03,"Uri",4);
		
		Theatre arrT[]=new Theatre[3];
		arrT[0]=new Theatre(101,"ABC","Pune",mov1);
		arrT[1]=new Theatre(102,"DEF","Pune",mov2);
		arrT[2]=new Theatre(103,"HIJ","Pune",mov3);

		System.out.println(Arrays.toString(arrT));
		
		for(int i=0; i<arrT.length-1; i++) {
			for(int j=i+1; j<arrT.length ; j++)
			if(arrT[i].mov.rating > arrT[j].mov.rating) {
				Theatre temp=arrT[i];
				arrT[i]  = arrT[j] ;
				arrT[j]  = temp;
			}
		}
		System.out.println(Arrays.toString(arrT));
	}
	

}
