package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length <= 0 || height <= 0) {
            System.out.println("Length and height must be positive integers.");
            return;
        }

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {

                for (int j = 0; j < length; j++) {
                    System.out.print("8");
                }
            } else {
                System.out.print("8");
                for (int j = 0; j < length - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printRectangleFrom8s(6, 4);
    }
}
