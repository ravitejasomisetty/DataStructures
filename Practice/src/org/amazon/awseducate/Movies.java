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

import org.practice.sort.Sortings;

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
	public static Movie[] getMovieRecommendations(Movie movie, int numTopRatedSimilarMovies) {
		Set<Movie> moviesSorted = BFS(movie);
		Movie[] topNMovies = new Movie[numTopRatedSimilarMovies];
		Iterator<Movie> it = moviesSorted.iterator();
		int i=0;
		while(it.hasNext() && i<numTopRatedSimilarMovies){
			topNMovies[i++] = it.next();
		}
		
		System.out.println("Top N Movies"+Arrays.toString(topNMovies)+"\r\n Given Movie: "+movie.getId());
		
		topNMovies = BFSWithHeapSort(movie);
		System.out.println("HEAP SORTED Top N Movies"+Arrays.toString(topNMovies)+"\r\n Given Movie: "+movie.getId());
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
	
	
	// Traversing all movies
		private static Movie[] BFSWithHeapSort(Movie startNode) {
			//NOTE: HashSet doesn't preserve your insertion order
			Set<Movie> allNodes = new HashSet<Movie>();
			
			
			Queue<Movie> queue = new LinkedList<Movie>();
			queue.add(startNode);

			while (!queue.isEmpty()) {
				Movie nextNode = queue.poll();
				if (!allNodes.contains(nextNode)) {
					allNodes.add(nextNode);
					queue.addAll(nextNode.getSimilarMovies());
				}
			}
			Movie[] allNodesArray = new Movie[allNodes.size()];
			allNodes.toArray(allNodesArray);
			
			Sortings sort = new Sortings();
			sort.HeapIntegerSort(allNodesArray);
			
			System.out.println("After BFS : "+ Arrays.toString(allNodesArray));
			
			return allNodesArray;
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
