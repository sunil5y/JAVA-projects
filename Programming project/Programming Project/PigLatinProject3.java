/*Write a program that starts with the string variable first set to your first name and
 the string variable last set to your last name.  Both names should be all lowercase.
Your program should then create a new string that contains your full name in pig latin 
with the first letter capitalized for the first and last name.  Use only the pig latin 
rule of moving the first letter to the end of the word and adding “ay.” Output the pig 
latin name to the screen.  Use the substring and toUpperCase methods to construct the 
new name.
For example, given
first = "walt";
last = "savitch";
the program should create a new string with the text “Altway Avitchsay” and print it.
 */
public class PigLatinProject3 {
    public static void main(String[] args) {
        String first = "Altway";
		String last  = "Avitchsay";
		String latinFirst;
		String latinLast;
		String latinName;

		latinFirst = first.substring(1) + first.charAt(0) + "ay";
		latinLast = last.substring(1) + last.charAt(0) + "ay";

	    latinFirst = latinFirst.substring(0, 1).toUpperCase() 
						+ latinFirst.substring(1);

		latinLast = latinLast.substring(0, 1).toUpperCase()
						+ latinLast.substring(1);

		latinName = latinFirst + " " + latinLast;

		System.out.println("First Name   :    " + first);
		System.out.println("Last Name    :     " + last);
		System.out.println("PigLatin Name: " + latinName);
    }
    
}
