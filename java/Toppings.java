public class Toppings extends BakeryDecorator {

    private String topping;
    private Bakery bakery;

    Toppings(Bakery bakery) {
        this.bakery = bakery;
    }

    void setProperty(String topping) {
        this.topping = topping;
    }

    public String getDetails() {
        return bakery.getDetails() + " Toppings: " + topping;
    }
}