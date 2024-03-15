package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0 || height % 2 == 0) {
            System.out.println("Height must be a positive odd integer.");
            return;
        }

        for (int i = 0; i < height / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = height / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - 2 * i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hourglass = new Hourglass();
        hourglass.printHourglassOfGivenSize(5);
    }
}
