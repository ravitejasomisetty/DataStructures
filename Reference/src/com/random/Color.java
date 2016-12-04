package com.random;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Color {
	private String name;
	String a=Integer.toString(-123);
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// Please implement a method to return a new list containing only those
	// colors that are not "blue".

	public List<Color> removeBlues(List<Color> inputColors) {

		Logger LOGGER = Logger.getLogger(Color.class.getName());

		public List<Color> newColorsList = new ArrayList<Color>();
		try {

			if (inputColors != null) {
				if (inputColors.isEmpty()) {
					System.out.println("there are no colors in the list");
					return;
				} else {
					for (Color c : inputColors) {
						if (!c.getName.equalsIgnoreCase("blue")) {
							newColorsList.add(c);
						}
					}
					return newColorsList;
				}
			}
		} catch (NullPointerException ex) {
			LOGGER.log(Level.SEVERE, null, ex);
			ex.printStackTrace();

		} catch (Exception ex) {
			LOGGER.log(Level.FINE, null, ex);
			ex.printStackTrace();
		}

	}
}
