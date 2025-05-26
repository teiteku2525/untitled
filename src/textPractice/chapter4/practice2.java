package textPractice.chapter4;

public class practice2 {
    public static void main(String[] args) {
        int[] moneyList = new int[] {121902,8302,55100};

        System.out.println("for文");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.print(moneyList[i] + " ");
        }
        System.out.println("\n拡張for文");
        for (int money : moneyList) {
            System.out.print(money + " ");
        }
    }
}
