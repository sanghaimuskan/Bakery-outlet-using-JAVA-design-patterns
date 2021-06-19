class BakeryFactory {

    Bakery create(String items) {
        if (items == null)
            return null;
        if (items.equalsIgnoreCase("c"))
            return new Cakes();
        else if (items.equalsIgnoreCase("s"))
            return new Cookies();
        else if (items.equalsIgnoreCase("r"))
            return new Cupcakes();

        return null;
    }
}