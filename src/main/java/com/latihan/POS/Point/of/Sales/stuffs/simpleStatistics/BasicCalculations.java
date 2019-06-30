package com.latihan.POS.Point.of.Sales.stuffs.simpleStatistics;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

@Controller
public class BasicCalculations {
	
	public float sum(ArrayList<Float> setOfNumbers) {
		Float total=(float) 0;
		for(int index=0;index<setOfNumbers.size();index++) {
			total+=setOfNumbers.get(index);
		}
		return total;
	}
	
	public float average(ArrayList<Float> setOfNumbers) {
		return sum(setOfNumbers)/setOfNumbers.size();
	}
	
}
