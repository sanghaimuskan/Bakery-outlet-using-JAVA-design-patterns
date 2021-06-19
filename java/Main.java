import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BakeryFactory bakeryFactory = new BakeryFactory();
        Scanner scan = new Scanner(System.in);
        String input = "";
        Bakery bakery = null;
        String bakeryName = null;
        boolean cont = true;
        double price = 0.0;
        while (cont) {
            System.out.println("Please select a bakery item\n" + "[c: Cake| r: Cupcakes | s: Cookies]");
            String choice = scan.next();
            bakery = bakeryFactory.create(choice);
            if (bakery instanceof Cakes) {
                System.out.println("Enter pounds: ");
                int pounds = scan.nextInt();
		int quantity = scan.nextInt();
                ((Cakes) bakery).setProperty(pounds, quantity);
                price = ((Cakes) bakery).getPrice();
                bakeryName = "Cakes";
                cont = false;
            } else if (bakery instanceof Cupcakes) {
                System.out.println("Enter quantity: ");
                int quantity = scan.nextInt();
                ((Cupcakes) bakery).setProperty(quantity);
                price = ((Cupcakes) bakery).getPrice();
                bakeryName = "Cupcakes";
                cont = false;
            } else if (bakery instanceof Cookies) {
                System.out.println("Enter quantity: ");
                int quantity = scan.nextInt();
                ((Cookies) bakery).setProperty(quantity);
                price = ((Cookies) bakery).getPrice();
                bakeryName = "Cookies";
                cont = false;
            } else {
                System.out.println("Invalid input. Try again:");
            }
        }

        while (!input.equals("q")) {
            System.out.println("Please select for");
            System.out.println("[i : Bakery Info | l : Add toppings (String) | clr : Add frosting(String) | cnt : Add candles (int) | q : quit");
            input = scan.next();
            if (input.equalsIgnoreCase("i")) {
                System.out.println(bakery.getDetails());
            } else if (input.equalsIgnoreCase("l")) {
                System.out.println("Enter toppings:");
                String value = scan.next();
                bakery = new Toppings(bakery);
                ((Toppings) bakery).setProperty(value);
            } else if (input.equalsIgnoreCase("clr")) {
                System.out.println("Enter frosting flavour:");
                String value = scan.next();
                bakery = new Frosting(bakery);
                ((Frosting) bakery).setProperty(value);
            } else if (input.equalsIgnoreCase("cnt")) {
                System.out.println("Enter number of candles:");
                int value = scan.nextInt();
                bakery = new Candles(bakery);
                ((Candles) bakery).setProperty(value);
            }
        }

        input = "";
        while (!input.equals("q")) {
            System.out.println("Please select the material of bakery: ");
            System.out.println("[i : Bakery Info | cu : Chocolate | fe : Vanilla | au : Butterscoth | st : Strawberry |rv : RedVelvet ");
            input = scan.next();
            DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
            if (input.equalsIgnoreCase("cu")){
                System.out.println("Price for Chocolate" + bakeryName + " = " + df.format(price * Materials.Chocolate));
		System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
		}
            else if (input.equalsIgnoreCase("fe")){
                System.out.println("Price for Vanilla " + bakeryName + " = " + df.format(price * Materials.Vanilla));
        	System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
	}    
	   else if (input.equalsIgnoreCase("au")){
                System.out.println("Price for Butterscoth " + bakeryName + " = " + df.format(price * Materials.Butterscoth ));
		System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
	}
	    else if (input.equalsIgnoreCase("st")){
                System.out.println("Price for Strawberry  " + bakeryName + " = " + df.format(price * Materials.Strawberry ));
		System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
	}
	    else if (input.equalsIgnoreCase("rv")){
                System.out.println("Price for RedVelvet  " + bakeryName + " = " + df.format(price * Materials.RedVelvet ));
		System.out.println(bakery.getDetails());
		System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
}
            else if (input.equalsIgnoreCase("i")){
                System.out.println(bakery.getDetails());
		System.out.println("*********************************");
		System.out.println(" ");
                System.out.println("Thank you for shopping!");
                System.exit(1);
}
            else {
                System.out.println("Invalid input. Try again:");
                input = "continue";
            }
        }
    }
}