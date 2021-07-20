package hu.tmx.shop.model;


public class Shoe extends Product {

    private static final String name = "Shoe";
    private final String brandName;
    private final double size;
    private final int largeSizePrice = 15000;
    private final int smallSizePrice = 14000;
    private final double smallSize = 40;

    public Shoe(String brandName, double size) {
        super(name);
        this.brandName = brandName;
        this.size = size;
    }

//    @Override
//    protected void createPrice() {
//        setPrice((size > 40) ? 15000 : 14000);
//    }
//
//    @Override
//    public int returnPrice(int daysAfterBuy){
//        if(daysAfterBuy == 0){
//            return getPrice();
//        }else if(daysAfterBuy <= 50){
//            return getPrice()/2;
//        }else{
//            return 0;
//        }
//    }

    @Override
    public String toString() {
        return "Egy " + size + " méretű " + brandName + " " + getName() + " - " + calculatePrice() + " Ft.";
    }

    @Override
    public int calculatePrice() {
        return size > smallSize ? largeSizePrice : smallSizePrice;
    }

}
