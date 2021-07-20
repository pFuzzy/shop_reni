package hu.tmx.shop.model;

import hu.tmx.shop.type.Maintainable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

import static java.time.temporal.ChronoUnit.WEEKS;


public class Flower extends Product implements Maintainable {

    private final int age;
    private final int basePrice = 1000;
    private final int priceMultiplier = 2;
    private final int weeksPerYear = 52;
    private final int yearsOfNeededMaintenance = 3;
    private final LocalDate flowerPlanted;
    private LocalDate lastMaintenance;

    public Flower(String name, int age) {
        super(name);
        this.age = age;
        this.flowerPlanted = LocalDate.now().minus(Period.ofWeeks(age));
        this.getUpkeep().setRequired(true);
        this.getUpkeep().setEvent("Öntözés");
    }

    public int getAge() {
        return age;
    }

//    @Override
//    protected void createPrice() {
//        setPrice(1000 + getAge() * 2);
//    }

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
        return "Egy " + kor + " " + getName() + " - " + calculatePrice() + " Ft.";
    }

    @Override
    public int calculatePrice() {
        return basePrice + age * priceMultiplier;
    }

    @Override
    public boolean needMaintenance() {
        if(lastMaintenance != null){
            return (WEEKS.between(lastMaintenance, LocalDate.now()) / (weeksPerYear * yearsOfNeededMaintenance)) >= 1;
        }
        return (age / (weeksPerYear * yearsOfNeededMaintenance)) >= 1;
    }

    @Override
    public void maintain() {
        lastMaintenance = LocalDate.now();
        System.out.println("Virág megöntözve!");
    }
}
