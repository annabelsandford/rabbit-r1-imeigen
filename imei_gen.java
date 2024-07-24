import java.util.Random;

public class IMEIGenerator {
    static int calc(String s) {
        int sum = 0;
        boolean dbl = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            if (dbl) {
                d *= 2;
                if (d > 9) d -= 9;
            }
            sum += d;
            dbl = !dbl;
        }
        return (10 - (sum % 10)) % 10;
    }
    static String gen() {
        String t = "35847631";
        StringBuilder sn = new StringBuilder("00");
        Random rand = new Random();
        for (int i = 0; i < 4; i++) sn.append(rand.nextInt(10));
        String imei = t + sn;
        return imei + calc(imei);
    }
    public static void main(String[] args) {
        System.out.println(gen());
    }
}
