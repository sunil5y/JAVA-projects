/*One way to measure the amount of energy that is expended during exercise is to use
 metabolic equivalents (MET).  Here are some METS for various activities:

Running 6 MPH: 10 METS
Basketball: 8 METS
Sleeping: 1 MET
The number of calories burned per minute may be estimated using the following formula:
CaloriesjMinute = 0.0175 * MET * Weight in kilograms
Write a program that calculates and outputs the total number of calories burned for a 
150-pound person who runs 6 MPH for 30 minutes, plays basketball for 30 minutes, and 
then sleeps for 6 hours.  One kilogram is  */
public class Calories {
	public static final double killoGramPerPound = 2.2;
	public static final int runningMETS = 10;
	public static final int basketballMETS = 8;
	public static final int sleepingMETS = 1;
		
	public static void main(String[] args)
	{
		double weightInKilograms = 150 /killoGramPerPound;
		double runningTimeInMinutes = 30;
		double basketballTimeInMinutes = 30;
		double sleepingTimeInMinutes = 6 * 60;
		
		double caloriesBurnedForRunning = 0.0175 * runningMETS * weightInKilograms
		         * runningTimeInMinutes;
		
		double caloriesBurnedForBasketball = 0.0175 *basketballMETS * weightInKilograms
		         * basketballTimeInMinutes;
		
		double caloriesBurnedForSleeping = 0.0175 * sleepingMETS * weightInKilograms
		         * sleepingTimeInMinutes;
		
		double totalCaloriesBurned = caloriesBurnedForRunning 
			     + caloriesBurnedForBasketball+ caloriesBurnedForSleeping;		
		
		System.out.println("Number of calories burned for running: " 
		         + caloriesBurnedForRunning);

		System.out.println("Number of calories burned for basketball: " 
                 + caloriesBurnedForBasketball);
		
		System.out.println("Number of calories burned for sleeping:   " 
				 + caloriesBurnedForSleeping);

		System.out.println("Total number of calories burned per minute: " 
                 + totalCaloriesBurned);	
    }
}