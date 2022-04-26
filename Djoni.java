public class Djoni {

    public static void main(String[] args) {

        System.out.println(doThree(5, 6));
        System.out.println("  ");
        System.out.println(doFour(4));
        System.out.println("  ");
        System.out.println(doFive(3));
        System.out.println("  ");
        four(3, "Привет,как дела?");
        System.out.println(isLeapYearBool(1986));

    }

    public static boolean doThree(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static boolean doFour(int a) {
        if(a > 0)return false;
        else return true;

    }

    public static boolean doFive(int a) {
        if (a < 0) return true;
        return false;
    }

    public static void four(int a, String string) {
        for (int i = a; i > 0; i--) {
            System.out.println(string);
        }}

    public static boolean isLeapYearBool ( int year) {
            if (year%4==0 && year%100 !=0 || year%400==0) return true;
            return false;
        }

}

