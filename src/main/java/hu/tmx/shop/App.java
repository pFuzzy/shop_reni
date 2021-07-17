package hu.tmx.shop;

import hu.tmx.shop.model.Flower;
import hu.tmx.shop.model.Product;
import hu.tmx.shop.model.Shoe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Product shoe1 = new Shoe("Adidas", 44);
        System.out.println(shoe1.toString());
        Product shoe2 = new Shoe("Reebok", 40.5);
        System.out.println(shoe2.toString());
        Product shoe3 = new Shoe("Nike", 38);
        System.out.println(shoe3.toString());
        Product flower1 = new Flower("Liliom", 8);
        System.out.println(flower1.toString());
        Product flower2 = new Flower("Jácint", 1);
        System.out.println(flower2.toString());



    }
}
