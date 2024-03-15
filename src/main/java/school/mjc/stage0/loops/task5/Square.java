package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength <= 0) {
            System.out.println("Side length must be a positive integer.");
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            if (i == 0 || i == sideLength - 1) {

                for (int j = 0; j < sideLength; j++) {
                    System.out.print("8");
                }
            } else {

                System.out.print("8");
                for (int j = 0; j < sideLength - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Square square = new Square();
        square.printSquareFrom8s(5);
    }
}
