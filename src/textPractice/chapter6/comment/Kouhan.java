package textPractice.chapter6.comment;
import static textPractice.chapter6.comment.Zenhan.*;
import java.lang.Thread;
public class Kouhan {

    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }
    public static void showMondokoro() throws InterruptedException {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(3000);
        doTogame();
    }
}
