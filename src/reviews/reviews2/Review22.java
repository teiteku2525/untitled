package reviews.reviews2;

public class Review22 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("結果:" + sum);
    }
}
