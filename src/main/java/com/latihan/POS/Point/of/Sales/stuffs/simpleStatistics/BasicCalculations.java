package com.latihan.POS.Point.of.Sales.stuffs.simpleStatistics;

import org.springframework.stereotype.Controller;

@Controller
public class BasicCalculations {
	
	public float sum(float[] setOfNumbers) {
		float total=0;
		for(int index=0;index<setOfNumbers.length;index++) {
			total+=setOfNumbers[index];
		}
		return total;
	}
	
	public float average(float[] setOfNumbers) {
		return sum(setOfNumbers)/setOfNumbers.length;
	}
	
}
