import java.util.*;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Route to MoalBoal\n");

        System.out.print("Is Barili (Route 4.1) obstructed? (Yes = 1 or No = 0): ");
        int isBariliObstructed = sc.nextInt();

        System.out.print("Is Dumanjug (Route 4.2.1) obstructed? (Yes = 1 or No = 0): ");
        int isDumanjugObstructed = sc.nextInt();
        System.out.println();

        if (isBariliObstructed == 0) {
            System.out.println("Proceed to Default Route");
            System.out.println("Default Route:\n" +
                    "Minglanilla(Route 1)\n" +
                    "San Fernando(Route 2)\n" +
                    "CarCar(Route 3)\n" +
                    "Barili(Route 4.1)\n" +
                    "Dumanjug(Route 4.1.1)\n" +
                    "Alcantara(Route 4.1.2)\n" +
                    "Moalboal...\n");
        } else if (isBariliObstructed == 1 && isDumanjugObstructed == 0) {
            System.out.println("Proceed to Recommended Route:\n");
            System.out.println("Recommended Route:\n" +
                    "Minglanilla(Route 1)\n" +
                    "San Fernando(Route 2)\n" +
                    "CarCar(Route 3)\n" +
                    "Sibonga(Route 4.2)\n" +
                    "Dumanjug (Route 4.2.1)\n" +
                    "Alcantara (Route 4.2.2)" +
                    "\nMoalboal..\n");
        } else {
            System.out.println("Proceed to Recommended Route:\n");
            System.out.println("Display: ");
            System.out.println("Recommended Route:\n" +
                    "Minglanilla(Route 1)\n" +
                    "San Fernando(Route 2)\n" +
                    "CarCar(Route 3)\n" +
                    "Sibonga(Route 4.2)\n" +
                    "Argao(Route 5)\n" +
                    "Ronda(Route 5.1)\n" +
                    "Alcantara (Route 5.2)" +
                    "\nMoalboal..\n");
        }

        System.out.print("Travel Ends");
    }
}