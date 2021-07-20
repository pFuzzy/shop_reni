package hu.tmx.shop.model;

import hu.tmx.shop.service.UpKeep;
import hu.tmx.shop.type.Sellable;

public abstract class Product implements Sellable {

    private final String name;
    private final UpKeep upkeep = new UpKeep();

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UpKeep getUpkeep() {
        return upkeep;
    }
}
