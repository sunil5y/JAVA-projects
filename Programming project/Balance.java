public class Balance {
    public static void main(String[] args) {
        int euro =1000;
        double rate = 0.05;
        double year1 = euro * rate+ euro;
        double year2 = year1 * rate+ euro;
        double year3 = year2 *  rate + euro;
        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);
    }
    
}
