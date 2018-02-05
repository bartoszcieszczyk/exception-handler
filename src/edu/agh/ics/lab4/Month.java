package edu.agh.ics.lab4;

public enum Month {

	JAN("Styczeñ", 1, 31),
	FEB("Luty", 2, 28),
	MAR("Marzec", 3, 31),
	APR("Kwiecieñ", 4, 30),
	MAY("Maj", 5, 31),
	JUN("Czerwiec", 6, 30),
	JUL("Lipiec", 7, 31),
	AUG("Sierpieñ", 8, 31),
	SEP("Wrzesieñ", 9, 30),
	OCT("Pazdziernik", 10, 31),
	NOV("Listopad", 11, 30),
	DEC("Grudzieñ", 12, 31);
	
	private final String name;
	
	private final int number;
	
	private final int numberOfDays;
	
	private Month(String name, int number, int numberOfDays) {
		this.name = name;
		this.number = ordinal() + 1;
		this.numberOfDays = numberOfDays;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public Month getNext() { //FIXME
		return Month.AUG;
	}
	
	public Month getPrevious() { //FIXME
		return Month.AUG;
	}
	
	public int getNumberOfDays() { //FINE
		return numberOfDays;
	}
	
	@Override
	public String toString() {
		return name + " " + number + " " + numberOfDays;
	}
}
