//========== PART 1 ===========//

import java.util.Scanner;

public class RunQuad {
    private static final String RECTANGLE = "R";
    private static final String SQUARE = "S";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press R for Rectangle or S for Square: ");
        
        String choice = scanner.nextLine().toUpperCase().trim();

        switch (choice) {
            case RECTANGLE:
                System.out.println("A rectangle:");
                new Rectangle().showDescription();
                break;
            case SQUARE:
                System.out.println("A square:");
                new Square().showDescription();
                break;
            default:
                System.out.println("Invalid choice. Select a valid option (R or S).");
                break;
        }

        scanner.close();
    }
}