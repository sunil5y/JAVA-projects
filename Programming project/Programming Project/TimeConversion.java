/*Write a program that outputs the number of hours, minutes, and seconds that
 corresponds to 50,391 total seconds.  The output should be 13 hours, 59 minutes, and 
 51 seconds. Test your program with a different number of total seconds to ensure that
it works for other cases. */
public class TimeConversion {
    public static int SECONDS_PER_HOUR = 3600;
	public static int SECONDS_PER_MINUTE = 60;

    public static void main(String[] args) {
        int remainingSeconds;
        int totalSeconds;
        int minutes;
        int seconds;
        int hours;
     totalSeconds = 50391;

	 hours = totalSeconds / SECONDS_PER_HOUR;

	 remainingSeconds = totalSeconds % SECONDS_PER_HOUR;

	 minutes = remainingSeconds / SECONDS_PER_MINUTE;

	 remainingSeconds = remainingSeconds % SECONDS_PER_MINUTE;

	 seconds = remainingSeconds;

		System.out.println("There are " + hours + " hours, "
        + minutes + " minutes, and " + seconds+ " seconds in "
     + totalSeconds + " seconds.");


         
     totalSeconds = 678391;
 
     hours = totalSeconds / SECONDS_PER_HOUR;
 
     remainingSeconds = totalSeconds % SECONDS_PER_HOUR;
 
     minutes = remainingSeconds / SECONDS_PER_MINUTE;
 
     remainingSeconds = remainingSeconds % SECONDS_PER_MINUTE;
 
     seconds = remainingSeconds;
 
     System.out.println("There are " + hours + " hours, "
     + minutes + " minutes, and " + seconds+ " seconds in "
     + totalSeconds + " seconds.");
 
 


    }
    
}
