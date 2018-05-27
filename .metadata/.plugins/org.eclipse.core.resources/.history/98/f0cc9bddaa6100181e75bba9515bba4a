public class Calculator {

	/**
	 * Calculates amount of days in the years within two dates, excluding
	 * given years
	 * @param  y1 the start year
	 * @param  y2 the end year
	 * @return the amount of days in the years
	 */	
	public static int daysinYears(int y1, int y2){

		if(y1 == y2){
			return 0;
		}	
		int leap = 0;
		//check for existence of years in between
		if(y2 - y1 > 1){
			for(int i = y1 + 1; i < y2; i++){
				if(i % 4 == 0){
					leap++;
				}
			}
			return (y2 - y1 - 1) * 365 + leap; 
		}
		return 0; 
	}

	/**
	 * Calculates amount of days in the months within two dates, excluding
	 * given months
	 * @param  d1 the start date
	 * @param  d2 the end date
	 * @return the amount of days in the months
	 */	
	public static int daysinMonths(MyDate d1, MyDate d2){
		int result = 0;

		if(d2.getYear() > d1.getYear()){
			//if different years
			for(int i = d1.getMonth() + 1; i < 12; i++){
				result += d1.getallDaysinMonth(i);
			}
			for(int j = 0; j < d2.getMonth(); j++){
				result += d2.getallDaysinMonth(j);
			}
			return result;
		}else{
			//if same year
			for(int q = d1.getMonth() + 1; q < d2.getMonth(); q++){
				result += d1.getallDaysinMonth(q);
			}
			return result;
		}	
	}

	/**
	 * Calculates amount of days in the given date's months
	 * @param  d1 the start date
	 * @param  d2 the end date
	 * @return the amount of days in the given months
	 */	
	public static int dayswithinMonths(MyDate d1, MyDate d2){
		//check if same month
		if(d1.getMonth() == d2.getMonth() && d1.getYear() == d2.getYear()){
			return d2.getDay() - d1.getDay();
		}else{
			return d1.getDaysinMonth() - d1.getDay() + d2.getDay();
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
			
			System.out.println(daysinYears(date1.getYear(), date2.getYear()) + daysinMonths(date1, date2) + dayswithinMonths(date1,date2) - 1);
			return;
			
		}catch (Exception e){
			System.out.println("Please insert in the following format: DD/MM/YYYY - DD/MM/YYYY");
			return;
		}
	}
}