package other.maze;

public class generateMaze {
    public static void main(String[] args) {
        int height = 7;
        int width = 7;
        int[][] maze = new int[height][width];
        int[][] startPoint = new int[][] {{(int)(Math.random()*height),(int)(Math.random()*width)},};
        //int[][] historyPoint = new int [][]


    }
    public void moveCheck(int x, int y) {//xとyは現在の座標を表す
        int count = 0;
        int[] order = new int [] {0,1,2,3};
        //Collections.shuffle(); これ使えない
        do {
            int way = (int) (Math.random() * 4);

            switch (way) {
                case 0://北
                    y++;
                    count++;
                    break;
                case 1://東
                    x++;
                    count++;
                    break;
                case 2://南
                    y--;
                    count++;
                    break;
                case 3://西
                    x--;
                    count++;
                    break;
            }
        }while(count < 4);
    }

    public int[] shuffle(int[] data) {
        


    }

}
/*
■■■■■■■■■■■
■○△○△○△○△○■
■△■△■△■△■△■
■○△○△○△○△○■
■△■△■△■△■△■
■○△○△○△○△○■
■△■△■△■△■△■
■○△○△○△○△○■
■△■△■△■△■△■
■○△○△○△○△○■
■■■■■■■■■■■
 */