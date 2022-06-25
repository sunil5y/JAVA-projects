//Main class name, ArtificialSweetener 
public class ArtificialSweetener
{
    //Program starts the main argument function
     public static void main(String []args)
     {
    
        //Defined four constant items and as well  as variable name
        double killMouse =0.0000013;
		double mouseWeight = 0.020; 
		double desiredWeight =90.0;
		final double PERCENTAGE_OF_ArtificialSweetener = 0.001;

        // Calculate the proportionate fatal amount of 
		// soda for safety
		double safetySoda = (killMouse /mouseWeight)
				* desiredWeight / PERCENTAGE_OF_ArtificialSweetener;
         //Print result on screen
		System.out.printf("The dieter can safely have up" + "to "+safetySoda+ "drink");
    }
}
