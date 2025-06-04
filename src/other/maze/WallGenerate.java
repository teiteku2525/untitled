package other.maze;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WallGenerate {
    public void mainControl(String[] args) {

    }
    public void moveCheck(int x, int y) {//xとyは現在の座標を表す
        int count = 0;
        Integer[] preOrder = {0, 1, 2, 3};
        List<Integer> order = Arrays.asList(preOrder);
        Collections.shuffle(order); //これ使えない 使えた
        do {
            int checkX = x;
            int checkY = y;
            int way = order.get(count);

            switch (way) {
                case 0://北
                    checkY+= 2;
                    count++;
                    break;
                case 1://東
                    checkX+= 2;
                    count++;
                    break;
                case 2://南
                    checkY-= 2;
                    count++;
                    break;
                case 3://西
                    checkX-= 2;
                    count++;
                    break;
            }
        } while (count < 4);
    }
}
