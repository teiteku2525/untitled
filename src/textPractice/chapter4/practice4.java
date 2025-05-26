package textPractice.chapter4;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[] {3,4,9};
        System.out.print("1桁の数字を入力してください>");
        int input = sc.nextInt();

        for (int number : numbers) {
            if (number == input) {
                System.out.println("アタリ！");
                return;
            }
        }
        System.out.println("ハズレ");
    }
}
