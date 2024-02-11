package de.telran.fixmaster.global;

import de.telran.fixmaster.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {

    public static List<Product> cart;
    static {
        cart = new ArrayList<>();
    }

}
