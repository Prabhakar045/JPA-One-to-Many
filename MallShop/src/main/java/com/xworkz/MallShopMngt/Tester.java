package com.xworkz.MallShopMngt;

import com.xworkz.MallShopMngt.Service.MallService;
import com.xworkz.MallShopMngt.Service.impl.MallServiceImpl;
import com.xworkz.MallShopMngt.dto.MallDTO;
import com.xworkz.MallShopMngt.dto.ShopDTO;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        MallDTO mall = new MallDTO();
        mall.setMallName("Orion Mall");

        List<ShopDTO> shops = new ArrayList<>(); // Create and initialize the list

        ShopDTO shop1 = new ShopDTO();
        shop1.setShopName("Dominos");

        ShopDTO shop2 = new ShopDTO();
        shop2.setShopName("PizzaHut");

        ShopDTO shop3 = new ShopDTO();
        shop3.setShopName("BurgerKing");

        ShopDTO shop4 = new ShopDTO();
        shop4.setShopName("Zudio");

        shops.add(shop1);
        shops.add(shop2);
        shops.add(shop3);
        shops.add(shop4);

        mall.setShops(shops); // Set the list in the MallDTO

        MallService mallService = new MallServiceImpl();
        if (mallService.validateAndAddMall(mall)) {
            System.out.println("Mall and Shops added successfully.");
        } else {
            System.out.println("Failed to add Mall and Shops.");
        }
    }
}
