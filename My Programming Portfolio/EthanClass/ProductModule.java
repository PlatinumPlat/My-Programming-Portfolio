package EthanClass;

import java.util.ArrayList;

public class ProductModule {
    static void addProduct(ArrayList<Product> products, int productID, String name, double price, int quantity) {
        Product newProduct = new Product(productID, name, price, quantity);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productID == productID) {
                products.get(i).name = name;
                products.get(i).price = price;
                products.get(i).quantity = quantity;
                break;
            }
        }
        products.add(newProduct);
}

    static void updateQuantity(ArrayList<Product> products, int productID, int amount) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productID == productID) {
                if (amount >= products.get(i).quantity) {
                    products.get(i).quantity = 0;
                } else {
                    products.get(i).quantity -= amount;
                }
            }
        }
    }

    static int searchProduct(ArrayList<Product> products, int productID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productID == productID) {
                return i;
            }
        }
        return -1;
    }

    static int searchProduct(ArrayList<Product> products, String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name == name) {
                return i;
            }
        }
        return -1;
    }

    static void display(ArrayList<Product> products, int productID) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).productID == productID) {
                System.out.println("EthanClass.Product ID: " + products.get(i).productID + "\nEthanClass.Product Name: " + products.get(i).name + "\nPrice: " + products.get(i).price + "\nQuantity: " + products.get(i).quantity);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> ProductList = new ArrayList<>();
        addProduct(ProductList, 1234, "Pencil Case", 12.99, 15);
        updateQuantity(ProductList, 1234, 10);
        System.out.println(searchProduct(ProductList, 1234));
        System.out.println(searchProduct(ProductList, "Pencil"));
        display(ProductList, 1234);
    }
}