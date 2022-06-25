/*The video game machines at your local arcade output coupons according to how well 
you play the game.  You can redeem 10 coupons for a candy bar or 3 coupons for a 
gumball.  You prefer candy bars to gumballs.  Write a program that defines a variable 
initially assigned to the number of coupons you win.  Next, the program should output 
how many candy bars and gumballs you can get if you spend all of your coupons on candy 
bars first, and any remaining coupons on gumballs. */
public class ProjectCupons {
	public static final int COUPONS_PER_CANDYBAR = 10;
	public static final int COUPONS_PER_GUMBALL = 3;

	public static void main(String[] args)
	{
		int CouponsWin = 597;

		int Candybars = CouponsWin / COUPONS_PER_CANDYBAR;

		int remainingCoupons = CouponsWin % COUPONS_PER_CANDYBAR;

		int Gumballs = remainingCoupons / COUPONS_PER_GUMBALL;

		remainingCoupons = remainingCoupons % COUPONS_PER_GUMBALL;

		System.out.println("Number of coupons win: " + CouponsWin);
		System.out.println("Number of candy bars : " + Candybars);
		System.out.println("Number of gumballs   : " + Gumballs);
		System.out.println("Number of remaining coupons: " + remainingCoupons);
    }
}
