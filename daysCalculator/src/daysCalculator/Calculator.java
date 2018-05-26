package daysCalculator;

public class Calculator {
		
	public static int daysinYears(int y1, int y2){
		if(y1 == y2){
			return 0;
		}	
		int years = y2 -y1;
		int leap = 0;
		for(int i = y1 + 1; i < y2 + 1; i++){
			if(i % 4 == 0){
				leap++;
			}
		}
		return years * 365 + leap; 
	}
	
	//calculates how many days left in start date year's month and end date year's month.
	public static int daysinMonths(MyDate d1, MyDate d2){
		int result = 0;
		if(d2.getYear() > d1.getYear()){
			for(int i = d1.getMonth(); i < 12; i++){
				result += d1.getallDaysinMonth(i);
			}
			
			for(int j = 0; j < d2.getMonth() - 1; j++){
				result += d2.getallDaysinMonth(j);
			}
			return result;
		}else{
			
			for(int q = d1.getMonth() + 1; q < d2.getMonth() - 1; q++){
				result += d1.getallDaysinMonth(q);
			}
			System.out.println(result);
			return result;
		}	
	}
	
	//calculates how many days in start date month and end date month.
	public static int dayswithinMonths(MyDate d1, MyDate d2){
		
		//check if same month
		if(d1.getMonth() == d2.getMonth()){
			return d2.getDay() - d1.getDay() - 1;
		}else{
			return d1.getDaysinMonth() - d1.getDay() + d2.getDay() - 1;
		}
	}
	
	
	
	public static void main(String[] args) {
		//input 04/07/1984 - 25/12/1984
		MyDate date1 = new MyDate(args[0]);
		MyDate date2 = new MyDate(args[2]);
		int totaldays = daysinYears(date1.getYear(), date2.getYear());
		int monthDays = dayswithinMonths(date1,date2);
		System.out.println(daysinYears(date1.getYear(), date2.getYear()) + daysinMonths(date1, date2) + dayswithinMonths(date1,date2));
		
	}

}

