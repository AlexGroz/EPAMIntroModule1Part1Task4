import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        double n = 111.222;

        n = (n - n % 1) / 1000 + n % 1 * 1000;

        System.out.println((double) Math.round(n * 1000) / 1000);
    }
}
