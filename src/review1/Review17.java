package review1;

public class Review17 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("結果:" + sum);
    }
}
