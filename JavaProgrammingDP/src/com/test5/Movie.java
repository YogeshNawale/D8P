package com.test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/*	Consider a arraylsit of Movie
 * 	Movie has (int movieid, name, List<String>actor)
 * find amitabh bacchan has acted in how many movies
 */
public class Movie {

	private int movieid;
	private String name;
	List<String> actor;

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieid, String name, List<String> actor) {
		super();
		this.movieid = movieid;
		this.name = name;
		this.actor = actor;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getActor() {
		return actor;
	}

	public void setActor(List<String> actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", name=" + name + ", actor=" + actor + "]";
	}

	public static void main(String[] args) {
		ArrayList<Movie> m = new ArrayList<>();

		m.add(new Movie(101, "Sholey", Arrays.asList("Amithabh Bacchan", "Dharmendra")));
		m.add(new Movie(102, "URI", Arrays.asList("Viky Kaushal", "Yami Gautham")));
		m.add(new Movie(103, "Piku", Arrays.asList("Amithabh Bacchan", "Irfan Khan")));
		m.add(new Movie(104, "PK", Arrays.asList("Amir Khan", "Karina kapoor")));
		m.add(new Movie(105, "Bagban", Arrays.asList("Amithabh Bacchan", "Hema Malini")));
		m.add(new Movie(106, "Dangal", Arrays.asList("Amir Khan")));

		int count = 0;
		for (Movie m1 : m) {
			List<String> arr = m1.getActor();
			ListIterator<String> l = arr.listIterator();
			while (l.hasNext()) {
				if (l.next().equals("Amithabh Bacchan"))
					count++;
			}

		}
		System.out.println("amitabh bacchan has acted in "+ count+" movies");
	
	}
}
