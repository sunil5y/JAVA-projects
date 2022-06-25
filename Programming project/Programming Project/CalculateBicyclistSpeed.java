/*Bicyclists can calculate their speed if the gear size and cadence is known.  Gear 
size refers to the effective diameter of the wheel.  Gear size multiplied by pi (3.14) \
gives the distance travelled with one turn of the pedals. Cadence refers to the number 
of pedal revolutions per minute (rpm). The speed in miles per hour is calculated by the
 following:
    speed(mph)= Gear size(inches)*pi*(1(ft)/12(inches))*(1(mile)/5280(ft))*cadence(rpn)*
	(60minutes)/hour
 
This is a program that calculates the speed for a gear size
 of 100 inches and a cadence of 90 rpm.  This would be considered
  a high cadence and a maximum gear size for a typical bicycle.1/12 will result in 0, 
  because both 1 and 12 are integers, and when the integer division is performed, the 
  fractional part is discarded. 
 */
public class CalculateBicyclistSpeed {
    public static double PI = 3.14;

	public static void main(String[] args)
	{
		double gearSizeInInches = 100.0;
		double cadenceRPM= 90.0;

		double speedInMPH = gearSizeInInches * PI * (1.0 / 12.0)
				             * (1.0 / 5280.0) * cadenceRPM * (60.0 / 1.0);

		System.out.println("Gear size in inches   : " + gearSizeInInches);
		System.out.println("Cadence in RPM        : " + cadenceRPM);
		System.out.println("Bicyclist speed in MPH: " + speedInMPH);
	}
}
    

