/*
 * A mini calculator demo
 */
public class MiniCalc {


    /*
     * Constructor
     */
	public MiniCalc(){
		int int3 = add(4,3);
		int int4 = multiply(9,8);
		System.out.println(int3+" "+int4);
	}

	/*
	 * Add two values
	 */
	public int add(int int1, int int2){
		return int1 + int2;
	}
	
	/*
	 * Multiply two values
	 */
	public int multiply(int int1, int int2){
		return int1 * int2;
	}
	
	
	/*
	 * The main method
	 */
	public static final void main(String[] str) {
		System.out.println("MiniCalc");
		MiniCalc mc = new MiniCalc();
	}
}