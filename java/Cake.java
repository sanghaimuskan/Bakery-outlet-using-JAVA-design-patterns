import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Cakes implements Bakery {

    private int pounds;
    private int quantity;

    void setPounds(int pounds, int quantity) {
        this.pounds = pounds;
	this.quantity = quantity;
     
    }

    double getPrice() {
        return Double.parseDouble(new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US)).format(pounds*quantity*250));
    }

    public String getDetails() {
        return "Cake... " + " Pounds: " + pounds + " Total Price: " + getPrice(pounds, quantity) + " ";
    }
}