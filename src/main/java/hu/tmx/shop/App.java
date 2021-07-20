package hu.tmx.shop;

import hu.tmx.shop.model.Flower;
import hu.tmx.shop.model.Product;
import hu.tmx.shop.model.Shoe;
import hu.tmx.shop.service.Supermarket;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        Supermarket supermarket = new Supermarket();
        Product shoe1 = new Shoe("Adidas", 44);
//        System.out.println(shoe1.toString());
        Product shoe2 = new Shoe("Reebok", 40.5);
//        System.out.println(shoe2.toString());
        Product shoe3 = new Shoe("Nike", 38);
//        System.out.println(shoe3.toString());
        Product flower1 = new Flower("Liliom", 8);
//        System.out.println(flower1.toString());
        Product flower2 = new Flower("Jácint", 1);
//        System.out.println(flower2.toString());
        supermarket.addProducts(Arrays.asList(shoe1, shoe2, shoe3, flower1, flower2));
        supermarket.displayAllPrices();


    }
}
