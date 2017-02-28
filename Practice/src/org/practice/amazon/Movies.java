/**
 * @author Raviteja Somisetty
 *
 * 
 */
package org.practice.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Movies {
	/*
	 * *
	 * 
	 * @param movie
	 * 
	 * @param numTopRatedSimilarMovies number of movies we want to return
	 * 
	 * @return List of top rated similar movies
	 */
	public static List<Movie> getMovieRecommendations(Movie movie, int numTopRatedSimilarMovies) {
		Set<Movie> moviesSorted = BFS(movie);
		List<Movie> topNMovies = new LinkedList<Movie>();
		Iterator<Movie> it = moviesSorted.iterator();
		while(it.hasNext() && topNMovies.size()<numTopRatedSimilarMovies){
			topNMovies.add(it.next());
		}
		
		System.out.println("Top N Movies"+Arrays.toString(topNMovies.toArray())+"\r\n Given Movie: "+movie.getId());
		return topNMovies;
	}

	// Traversing all movies
	private static Set<Movie> BFS(Movie startNode) {
		Set<Integer> visitedSet = new HashSet<Integer>();
		
		Set<Movie> allNodes = new TreeSet<Movie>(new Comparator<Movie>(){

			@Override
			public int compare(Movie movieA, Movie movieB) {
				Movie mA = (Movie)movieA;
				Movie mB = (Movie)movieB;
				return ((Float)mB.getRating()).compareTo((Float)mA.getRating());					
			}
			
		});
		Queue<Movie> queue = new LinkedList<Movie>();
		queue.add(startNode);

		while (!queue.isEmpty()) {
			Movie nextNode = queue.poll();
			if (!visitedSet.contains(nextNode.getId())) {
				visitedSet.add(nextNode.getId());
				allNodes.add(nextNode);
				queue.addAll(nextNode.getSimilarMovies());
			}
		}

		System.out.println("After BFS : "+ Arrays.toString(allNodes.toArray()));
		return allNodes;
	}
	
	
	
	public static class Movie {
	    private final int movieId;
	    private final float rating;
	    private List<Movie> similarMovies; // Similarity is bidirectional
	 
	    public Movie(int movieId, float rating) {
	        this.movieId = movieId;
	        this.rating = rating;
	        similarMovies = new ArrayList<Movie>();
	    }
	 
	    public int getId() {
	        return movieId;
	    }
	 
	    public float getRating() {
	        return rating;
	    }
	 
	    public void addSimilarMovie(Movie movie) {
	        similarMovies.add(movie);
	        movie.similarMovies.add(this);
	    }
	 
	    public List<Movie> getSimilarMovies() {
	        return similarMovies;
	    }

		@Override
		public String toString() {
			
			return ((Integer)this.getId()).toString();
		}    
	    
	}
}
