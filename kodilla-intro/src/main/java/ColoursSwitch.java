import java.util.Scanner;
public class ColoursSwitch {
    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the color?: ");
            String letter = scanner.nextLine().trim();
            if (letter.length() == 1) {
                return letter;
            }
            System.out.println("Enter only one letter.");
        }
    }

    public static String getUserselection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select first letter of the colour (B-blue, P-pink, G-green, Y-yellow):");
            String col = scanner.nextLine().trim().toUpperCase();
            switch (col) {
                case "B":
                    return "Blue";
                case "P":
                    return "Pink";
                case "G":
                    return "Green";
                case "Y":
                    return "Yellow";
                default:
                    System.out.println("there is no color with such a first letter. Try again;");
            }
        }
    }
    public static String getLetter() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter first letter:");
        String letter = String.valueOf(scanner.nextInt());
        return letter;
    }
}

