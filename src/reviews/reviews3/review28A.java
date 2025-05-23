package reviews.reviews3;
import java.io.*;
public class review28A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("宛先を入力>");
        String to = br.readLine();
        System.out.print("件名を入力>");
        String subject = br.readLine();
        System.out.print("本文を入力>");
        String body = br.readLine();

        review28B review28B = new review28B();
        if (subject.isEmpty()) {
            review28B.send(to, body);
        }else {
            review28B.send(to, subject, body);
        }

    }
}


