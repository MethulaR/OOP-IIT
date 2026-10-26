package lk.ac.iit.products_api;

// A PhysicalProduct IS-A Product because it is still a sellable catalogue item with an id, name and price; it just also ships in a box.
// A ShoppingCart would NOT pass this test: a cart HAS products (composition), it is not itself something the shop sells.

public class PhysicalProduct extends Product implements Discountable
{

    private double weightKg;
    private String dimensions;

    // no-arg constructor for Jackson
    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical:" + getName()
                + "| Weight:" + getWeightKg();
    }
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate){

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}