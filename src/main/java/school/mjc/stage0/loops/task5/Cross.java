package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength <= 0) {
            System.out.println("Side length must be a positive integer.");
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || i + j == sideLength - 1) {
                    System.out.print("8"); // Print '8' at the intersection of diagonals
                } else {
                    System.out.print(" "); // Print space elsewhere
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Cross cross = new Cross();
        cross.printCross(5); // Example usage: Prints a cross with side length of 5
    }
}
