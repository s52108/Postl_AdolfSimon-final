package products;

import java.util.HashMap;

public class DemoStackApp {
    public static void main(String[] args) {

        Product p1 = new Product("Chair", 199.0, 1, "black");
        Product p2 = new Product("Table", 379.9, 1, "brown");
        Product p3 = new Product("T-Shirt", 19.9, 2, "yellow");
        Product p4 = new Product("Jeans", 99.9, 2, "blue");
        Product p5 = new Product("Tennisball", 9.9, 3, "yellow");
        Product p6 = new Product("Skier", 689.9, 3, "white");
        Product p7 = new Product("Apples", 2.99, 4, "red");
        Product p8 = new Product("Orange", 3.49, 4, "orange");
        Product p9 = new Product("Game", 12.99, 5, "white");
 /*
        StackGeneric<Product> productsStack = new StackGeneric<>(new Product[10]);
        productsStack.push(p1);
        productsStack.push(p2);
        productsStack.push(p3);
        productsStack.push(p4);
        productsStack.push(p5);
        productsStack.push(p6);
        productsStack.push(p7);
        productsStack.push(p8);
        productsStack.push(p9);

        System.out.println(productsStack);

        System.out.println("countItemsByCategoryName(productsStack) = " + countItemsByCategoryName(productsStack));
*/
    }

    public static String getCategoryName(int categoryID) {
        switch (categoryID) {
            case 1:
                return "Möbel";
            case 2:
                return "Kleidung";
            case 3:
                return "Sportartikel";
            case 4:
                return "Nahrungsmittel";
            default:
                return "Divers";
        }
    }

    public static HashMap<String, Integer> countItemsByCategoryName(StackGeneric<Product> products) {
        HashMap<String, Integer> items = new HashMap<>();
        while (!products.isEmpty()) {
            Product p = products.pop();
            String categoryName = getCategoryName(p.getCategoryID());

            if (items.containsKey(categoryName)) {
                items.put(categoryName, items.get(categoryName) + 1);
            } else items.put(categoryName, 1);


        }
        return items;
    }


}