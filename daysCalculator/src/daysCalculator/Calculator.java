package daysCalculator;

public class Calculator {
		
	public static int daysinYears(int y1, int y2){
		if(y1 == y2){
			return 0;
		}	
		int leap = 0;
		for(int i = y1 + 1; i < y2 + 1; i++){
			if(i % 4 == 0){
				leap++;
			}
		}
		return (y2 - y1 - 1) * 365 + leap; 
	}
	
	//calculates how many days left in start date year's month and end date year's month.
	public static int daysinMonths(MyDate d1, MyDate d2){
		int result = 0;
		if(d2.getYear() > d1.getYear()){
			
			for(int i = d1.getMonth() + 1; i < 12; i++){
				result += d1.getallDaysinMonth(i);
			}

			for(int j = 0; j < d2.getMonth(); j++){
				result += d2.getallDaysinMonth(j);
			}
			return result;
			
		}else{
			for(int q = d1.getMonth() + 1; q < d2.getMonth(); q++){
				result += d1.getallDaysinMonth(q);
			}
			return result;
		}	
	}
	
	//calculates how many days in start date month and end date month.
	public static int dayswithinMonths(MyDate d1, MyDate d2){
		
		//check if same month
		if(d1.getMonth() == d2.getMonth() && d1.getYear()==d2.getYear()){
			return d2.getDay() - d1.getDay() - 1;
		}else{
			return d1.getDaysinMonth() - d1.getDay() + d2.getDay() - 1;
		}
	}
	
	
	
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("No input is inserted");
		}
		try{
			MyDate date1 = new MyDate(args[0]);
			MyDate date2 = new MyDate(args[2]);
			MyDate temp = date1;
			if(date1.getYear() > date2.getYear()){
				date1 = date2;
				date2 = temp;
			}else if(date1.getYear() == date2.getYear() && date1.getMonth() > date2.getMonth()){
				date1 = date2;
				date2 = temp;
			}else if(date1.getYear() == date2.getYear() && date1.getMonth() == date2.getMonth() && date1.getDay() > date2.getDay()){
				date1 = date2;
				date2 = temp;
			}
			System.out.println(daysinYears(date1.getYear(), date2.getYear()) + daysinMonths(date1, date2) + dayswithinMonths(date1,date2));
			return;
		}catch (Exception e){
			System.out.println("Please insert in the following format: DD/MM/YYYY - DD/MM/YYYY");
			return;
		}
	}
}