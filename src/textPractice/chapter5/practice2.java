package textPractice.chapter5;

public class practice2 {
    public static void main(String[] args) {
        String title = "例の件";
        String address = "example.com";
        String text = "ご存じですか、マイクらの無敵時間は無視できます。";
        email(title, address, text);
    }
    private  static void email (String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }
}
