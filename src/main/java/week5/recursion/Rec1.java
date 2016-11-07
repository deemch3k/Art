package week5.recursion;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class Rec1 {

    public static void main(String[] args) {

        System.out.println(count7(111));

    }

    private static int f(int i) {
        if (i == 1) return 2;
        return f(i - 1) + 2;
    }

    private static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 0) ? bunnyEars2(bunnies - 1) + 3 : bunnyEars2(bunnies - 1) + 2;
    }

    public static int count7(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7) {
            return count7(n / 10) + 1;
        } else {
            return count7(n - 1);
        }
    }

    public static int count8(int n) {
        if (n == 0) return 0;
        if ( n % 100 == 88) {
            return count8(n / 10) + 2;
        } else if (n % 10 == 8){
            return count8(n / 10) + 1;
        } else {
            return count8(n / 10);
        }
    }


}
