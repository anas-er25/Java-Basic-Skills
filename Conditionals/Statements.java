public class Statements {
    public static void main(String[] args) {
        // if else statements
        boolean windy = true;
        boolean cold = false;
        boolean rainy = true;
        if (windy) {
            System.out.print("Wear a rain jacket.");
        } else {
            if (cold) {
                System.out.print("You might need a coat.");
            } else {
                if (rainy) {
                    System.out.print("Bring an umbrella!");
                } else {
                    System.out.print("Enjoy your day!");
                }
            }
        }

        // switch case statement
        int dayOfWeek = 3;

        switch (dayOfWeek) {

            case 1:
                System.out.print("Sunday"); // only prints if dayOfWeek == 1
                break;
            case 2:
                System.out.print("Monday"); // only prints if dayOfWeek == 2
                break;
            case 3:
                System.out.print("Tuesday"); // only prints if dayOfWeek == 3
                break;
            case 4:
                System.out.print("Wednesday"); // only prints if dayOfWeek == 4
                break;
            case 5:
                System.out.print("Thursday"); // only prints if dayOfWeek == 5
                break;
            case 6:
                System.out.print("Friday"); // only prints if dayOfWeek == 6
                break;
            case 7:
                System.out.print("Saturday"); // only prints if dayOfWeek == 7
                break;
            default:
                System.out.print("Invalid"); // only prints if none of the above are true

        }

    }
}
