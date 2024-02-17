import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class p3j {
    public static void main(String[] args) {
        int size = 6;
        int qty = 5;

        generateOTP(size, qty);

        //String[] list1 = {"HDFC", "ICICI", "SBI", "HSBC", "Kotak", "IDFC", "Canara", "BOB", "Karnataka", "JPMorgan", "GoldmanSachs", "WellsFargo"};
        int[] list2 = {6, 4, 5, 8, 6, 6, 6, 6, 6, 6, 6, 6};
        List<Integer> list3 = new ArrayList<>();
        int[] list4 = {500, 500, 500, 235, 500, 500, 500, 500, 500, 500, 500, 500};
        List<Integer> list5 = new ArrayList<>();
        int[] base1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 100, 100, 100};

        for (int i = 0; i < list2.length; i++) {
            list3.add(base1[i] + list2[i]);
        }

        for (int i = 0; i < list3.size(); i++) {
            list5.add(list4[i] * list3.get(i));
        }

        double amt_day = list5.stream().mapToInt(Integer::intValue).sum() / 100.0;
        double amt_month = amt_day * 30;
        double amt_3months = amt_month * 3;

        System.out.println(list3);
        System.out.println(list5);
        System.out.println(amt_day);
        System.out.println(amt_month);
        System.out.println(amt_3months);
    }

    private static void generateOTP(int size, int qty) {
        Random random = new Random();
        for (int i = 0; i < qty; i++) {
            int otp = random.nextInt((int) Math.pow(10, size) - (int) Math.pow(10, size - 1)) + (int) Math.pow(10, size - 1);
            System.out.println(otp);
        }
    }
}
