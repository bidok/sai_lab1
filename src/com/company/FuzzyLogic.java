package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Vasyl Bidiak
 * @created : 25.04.2022
 * @className : FuzzyLogic
 **/

public class FuzzyLogic {
	public static void main(String[] args) {
		//test
		Map<Double, String> map = new HashMap<>();
		double n = 80;
		double s = 1.0/(1.0+Math.pow((n-30)/12, 12));
		map.put(s, "slow");
		double m = 1.0/(1.0+Math.pow((n-70)/3, 6));
		map.put(m, "medium");
		double f = 1.0/(1.0+Math.pow((n-100)/6, 10));
		map.put(f, "fast");

		double biggest = map.keySet().stream().mapToDouble(aDouble -> aDouble).max().orElse(0.0);
		System.out.printf("current speed are %s%n", map.get(biggest));
	}
}
