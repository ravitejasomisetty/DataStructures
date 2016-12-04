package com.random;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Factorial {

	public static void main(String[] args) {
		Factorial fact = new Factorial();

		int a = fact.computeFactorial(5);
		if (a > 0)
			System.out.println(a);
	}

	int computeFactorial(int number) {
		int result = 1;
		Logger LOGGER = Logger.getLogger(Factorial.class.getName());
		try {
			if (number < 0) {
				System.out.println("Invalid Input. Please enter only positive number");
				return -1;
			} 
			else if (number == 1 || number == 0) {
				return 1;
			}

			else {

				for (int i = 1; i <= number; i++) {
					result *= i;
				}
				// return result;
			}

		} catch (Exception ex) {
			LOGGER.log(Level.FINE, null, ex);
			ex.printStackTrace();
		}
		return result;

	}

}
