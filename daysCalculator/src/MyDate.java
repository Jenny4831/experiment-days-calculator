public class MyDate {
	
	private int year;
	private int month;
	private int day;
	boolean isLeap;
	
	public MyDate(String date){
		year = Integer.parseInt(date.substring(date.length() - 4));
		month = Integer.parseInt(date.substring(3, 5)) - 1; 
		day = Integer.parseInt(date.substring(0, 2));
		if(year % 4 == 0){
			isLeap  = true;
		}
	}
	/**
	 * 
	 * GETTERS
	 * 
	 */	
	public int getYear(){
		return year;
	}

	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	 /**
	  * Searches for the days in given month
	  * @param m month
	  * @return amount of days of this month
	  */
	public int getallDaysinMonth(int m){
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(isLeap){
			months[1] = 29;
		}
		return months[m];
	}
}