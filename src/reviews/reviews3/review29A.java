package reviews.reviews3;

public class review29A {
    public static void main(String[] args) {
        review29B KeyInput = new review29B();

        System.out.print("宛先を入力>");
        String to = KeyInput.readString();
        System.out.print("件名を入力>");
        String subject = KeyInput.readString();
        System.out.print("本文を入力>");
        String body = KeyInput.readString();

        System.out.println(to + "に以下のメールを送信しました。");
        System.out.println("件名: " + subject);
        System.out.println("本文: " + body);
    }
}
