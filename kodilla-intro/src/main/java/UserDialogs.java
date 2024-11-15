import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);      // [1]

        while (true) {                                  // [2]

            System.out.println("Enter your name:");    // [3]

            String name = scanner.nextLine().trim();    // [4]

            if (name.length() >= 2) {                    // [5]

                return name;                            // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-substract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();    // [1]
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
}