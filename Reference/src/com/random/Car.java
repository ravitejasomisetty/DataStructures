package com.random;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Car {

	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void drive() {
		System.out.println("Have a wornderful ride in " + carName + " Car");
	}

	public static void main(String[] args) {

		Logger LOGGER = Logger.getLogger(Car.class.getName());

		List<Car> carList = new ArrayList();
		Car c1 = new Car();
		c1.setCarName("jkhk");
		carList.add(c1);

		Car c2 = new Car();
		c2.setCarName("Porche");
		carList.add(c2);

		try {

			if (carList != null) {
				if (carList.isEmpty()) {
					System.out.println("there are no cars");
					return;
				}
				else{
				for (Car c : carList) {
					c.drive();
				}
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
