package Exam;

public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            for (int j = 5 - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}