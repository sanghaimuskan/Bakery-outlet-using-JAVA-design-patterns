public class Candles extends BakeryDecorator {

    private int quantity;
    private Bakery bakery;

    Candles(Bakery bakery) {
        this.bakery = bakery;
    }

    void setProperty(int quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return bakery.getDetails() + " Candles: " +quantity;
    }
}