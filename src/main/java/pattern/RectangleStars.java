package pattern;

public class RectangleStars {
    public static void main(String[] args) {
        int row = 4;
        int column = 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
