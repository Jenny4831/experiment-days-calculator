package daysCalculator;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(String date){
		year = Integer.parseInt(date.substring(date.length() - 4));
		month = Integer.parseInt(date.substring(3, 5));
		day = Integer.parseInt(date.substring(0, 2));
	}
	
	public int getYear(){
		return year;
	}

	public int getMonth() {
		return month;
	}


	public int getDay() {
		return day;
	}


	
}
