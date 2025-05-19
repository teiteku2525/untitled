package review1;

public class Review12 {
    public static void main(String[] args) {
        int age = -8;
        if (age >= 0) {
            if (age >= 65) {
                System.out.println("高齢者");
            }else if(age >= 18) {
                System.out.println("成人");
            }else {
                System.out.println("未成年");
            }
        }else {
            System.out.println("無効な年齢です。");
        }
    }
}
