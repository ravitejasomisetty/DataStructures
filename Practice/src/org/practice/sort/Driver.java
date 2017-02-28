/**
 * @author Raviteja Somisetty
 *
 * 
 */
package org.practice.sort;

import org.practice.amazon.Movies;

public class Driver {

	public static void main(String[] args) {

		Sortings<Integer> sIntSort = new Sortings<Integer>();

		sIntSort.BubbleIntegerSort(new Integer[] { 27, 1, 9, -9, 3 });

		Movies.Movie movieA = new Movies.Movie(1, 1.2f);
		Movies.Movie movieB = new Movies.Movie(2, 2.4f);
		Movies.Movie movieC = new Movies.Movie(3, 3.6f);
		Movies.Movie movieD = new Movies.Movie(4, 4.8f);
		
		movieA.addSimilarMovie(movieB);
		movieA.addSimilarMovie(movieC);
		
		movieB.addSimilarMovie(movieA);
		movieB.addSimilarMovie(movieD);
		
		movieC.addSimilarMovie(movieA);
		movieC.addSimilarMovie(movieD); 
		
		movieD.addSimilarMovie(movieB);
		movieD.addSimilarMovie(movieC);

		for (Movies.Movie m : Movies.getMovieRecommendations(movieB, 2)) {
			System.out.println("Movie id= " + m.getId() + " Rating= " + m.getRating());
		}

	}

}
