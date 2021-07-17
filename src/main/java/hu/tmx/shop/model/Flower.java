package hu.tmx.shop.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Flower extends ForSale{

    private final int age;

    public Flower(String name, int age) {
        super(name);
        this.age = age;
        this.getUpkeep().setRequired(true);
        this.getUpkeep().setEvent("Öntözés");
        createPrice();
    }

    public int getAge() {
        return age;
    }

    @Override
    protected void createPrice() {
        setPrice(1000 + getAge() * 2);
    }

    @Override
    public String toString() {
        String kor;
        if(age < 4) kor = age + " hetes";
        else {
            DecimalFormat df = new DecimalFormat("#.#");
            df.setRoundingMode(RoundingMode.CEILING);
            double month = (double)age/4;
            kor =  df.format(month) + " hónapos";
        }
        return "Egy " + kor + " " + getName() + " - " + getPrice() + " Ft.";
    }

}
