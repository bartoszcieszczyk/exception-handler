package edu.agh.ics.lab4;

import org.apache.log4j.Logger;

public class SumOfIntegers {

	public static Logger log = Logger.getLogger(SumOfIntegers.class);
	
	public static void main(String[] args) {
		if(args.length == 0) {
			log.error("Provide list of floating-point numbers...");
			System.exit(-1);
		}
		int sum = 0;
		for (String token : args) {
			try {
				sum += Integer.parseInt(token);
			}
			catch (NumberFormatException e) {
				log.warn("Invalid input argument: " + token + " skipped");
			}
		}
		log.info("Sum: " + sum);
	}

}
