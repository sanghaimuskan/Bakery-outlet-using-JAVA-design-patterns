public class Frosting extends BakeryDecorator {

    private String flavour;
    private Bakery bakery;
   
    Frosting(Bakery bakery) {
        this.bakery = bakery;
    }

    void setProperty(String flavour) {
        this.flavour = flavour;
    }

    public String getDetails() {
        return bakery.getDetails() + " Flavour: " + flavour;
    }
}