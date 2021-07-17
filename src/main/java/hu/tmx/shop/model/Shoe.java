package hu.tmx.shop.model;

import hu.tmx.shop.service.ToReturn;

public class Shoe extends ForSale implements ToReturn {

    private final double size;

    public Shoe(String name, double size) {
        super(name + " Cipő");
        this.size = size;
        createPrice();
    }

    @Override
    protected void createPrice() {
        setPrice((size > 40) ? 15000 : 14000);
    }

    @Override
    public int returnPrice(int daysAfterBuy){
        if(daysAfterBuy == 0){
            return getPrice();
        }else if(daysAfterBuy <= 50){
            return getPrice()/2;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Egy " + size + " méretű " + getName() + " - " + getPrice() + " Ft.";
    }
}
