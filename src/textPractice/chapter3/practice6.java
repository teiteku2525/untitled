package textPractice.chapter3;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("【数あてゲーム】");
        int ans = (int)(Math.random()*10);
        for (int i = 0; i < 5; i++) {
            System.out.print("0～9の数字を入力してください>");
            int num = sc.nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
                break;
            }else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
