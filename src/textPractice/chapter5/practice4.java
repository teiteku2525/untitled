package textPractice.chapter5;

public class practice4 {
    public static void main(String[] args) {
        double bottom = 10.0;
        double height = 5.0;
        double triangle = calcTriangleArea(bottom, height);
        System.out.println("三角形の面積:" + triangle);

        double radius = 5.0;
        double circle = calcCircleArea(radius);
        System.out.println("円の面積:" + circle);

    }
    private static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2;
    }
    private static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
