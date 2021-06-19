import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Cookies implements Bakery {

    private int quantity;

    void setProperty(int quantity) {
        this.quantity = quantity;
    }

    double getPrice() {
        return Double.parseDouble(new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US)).format(quantity * 0.08));
    }

    public String getDetails() {
        return "Cookies... " + " Quantities: " + quantity + " Total Price: " + getPrice() + " ";
    }
}