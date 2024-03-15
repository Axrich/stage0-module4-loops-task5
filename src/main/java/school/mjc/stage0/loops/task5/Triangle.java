package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength <= 0) {
            System.out.println("Cathetus length must be a positive integer.");
            return;
        }

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(5);
    }
}
