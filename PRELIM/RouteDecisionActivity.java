import java.util.Scanner;

public class RouteDecisionActivity {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
                 
      System.out.println("Route to MoalBoal\n");
        
      System.out.println("Default route:");
      System.out.println("Cebu City (Start)");
      System.out.println("Minglanilla (Route 1)");
      System.out.println("San Fernando (Route 2)");
      System.out.println("Carcar (Route 3)");
      System.out.println("Barili (Route 4.1)");
      System.out.println("Dumanjug (Route 4.1.1)");
      System.out.println("Alcantara (Route 4.1.2)");
      System.out.println("Moalboal (End)\n");
      
      System.out.print("Is Barili (Route4.1) obstructed? (Yes = 1 or No = 0): ");
      int BariliObstructed = scan.nextInt();
                 
      if (BariliObstructed == 0){
         System.out.println("Proceed to Default Route");
         System.out.println("Cebu City (Start)\n " + 
                            "Mingla(Route 1)\n" + 
                            "San Fernando(Route 2)\n" + 
                            "CarCar(Route 3)\n" + 
                            "Barili(4.1)\n" + 
                            "Dumanjug(4.1.1)\n" + 
                            "Alcantara(4.1.2)\n" + 
                            "You reached to Moalboal\n");
      }
        
      else{
         System.out.print("Is Sibonga (Route4.2) obstructed? (Yes = 1 or No = 0): ");
         int SibongaObstructed = scan.nextInt();
         System.out.println("\n");
         
            if (SibongaObstructed == 0){
               System.out.println("Proceed to this Recommended Route:");
               System.out.println("Cebu City (Start)\n" + 
                                  "Recommended Route:\n" + 
                                  "Minglanilla(Route 1)\n" + 
                                  "San Fernando(Route 2)\n" + 
                                  "Carcar(Route 3)\n" + 
                                  "Sibonga(Route 4.2)\n" + 
                                  "Dumanjug (Route 4.2.1)\n" + 
                                  "Alcantara(Route 4.2.2)\n" + 
                                  "You reached to Moalboal");
            }
            else{
               System.out.println("Proceed to this Recommended Route:");
               System.out.println("Cebu City (Start)" +
                                  "Minglanilla(Route1)\n" + 
                                  "San Fernando(Route2)\n" + 
                                  "Carcar(Route3)\n" + 
                                  "Sibonga(Route4.2)\n" + 
                                  "Argao (Route 5)\n" + 
                                  "Ronda(Route 5.1)\n" +
                                  "Alcantara(Route 5.2)\n" + 
                                  "You reached to Moalboal");
            }
       }                   
    }
}