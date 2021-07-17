package hu.tmx.shop.model;

public abstract class ForSale extends Product {

    private int price;

    public ForSale(String name) {
        super(name);
    }

    public int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected abstract void createPrice();

}
