package edu.agh.ics.lab4;

import org.apache.log4j.Logger;

public class ExceptionExperiments {
	
	public static Logger log = Logger.getLogger(ExceptionExperiments.class);

	public void throwNullPointerException() {
		String a = null;
		a.toString();
	}
	
	public void throwIndexOutOfBoundsException() {
		int[] array = new int[10];
		for (int i = 0; i <= array.length; i++) {
			int tmp = array[i];
		}
	}
	
	public void throwOutOfMemoryError() {
		Double[][] bigMatrix = new Double[10000][10000];
	}
	
	public void throwArithmeticException() {
		double a = 1.0, b, c = 0.0;
		c = a/c;
	}
	
	public static void main(String[] args) {
		ExceptionExperiments ee = new ExceptionExperiments();
		ee.throwArithmeticException();
		ee.throwIndexOutOfBoundsException();
		ee.throwNullPointerException();
		ee.throwOutOfMemoryError();
	}

}
