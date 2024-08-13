public class Nested_Loops {
    public static void main(String args[]) {

        // example 1:

        for (int row = 0; row < 5; row++) {
            if (row == 1 || row == 3) {
                for (int col = 0; col < 10; col++) {
                    System.out.print(">");
                }
            } else {
                for (int col = 0; col < 10; col++) {
                    System.out.print("<");
                }
            }
            System.out.println(""); // adds a new line
        }

        // example 2:
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println(); // adds new line
        }

    }
}