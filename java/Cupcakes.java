import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Cupcakes implements Bakery {

    private int quantity;

    void setProperty(int quantity) {
        this.quantity= quantity;
    }

    double getPrice() {
        return Double.parseDouble(new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US)).format(quantity*0.1));
    }

    public String getDetails() {
        return "Cupcakes... " + "quantity: " + quantity + "Total price: " + getPrice() + " ";
    }
}