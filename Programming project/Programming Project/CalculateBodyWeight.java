public class CalculateBodyWeight {
    public static int WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS = 110;
    public static int MINIMUM_ALLOW_HEIGHT_IN_FEET = 5;
    public static int WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS = 5;
    public static int INCHES_PER_FEET = 12;
    public static void main(String[] args) {
        int personHeightInFeet = 6; // should not be less than 5
        int personHeightInInches = 3;
        double idealBodyWeightInPounds = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS
        + ((personHeightInFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)
        * INCHES_PER_FEET + personHeightInInches)* WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;
        System.out.println("Person height in feet: "+ personHeightInFeet + "."+ personHeightInInches);
        System.out.println("Ideal Body Weight in pounds: "+ idealBodyWeightInPounds);
        


    }
    
}
