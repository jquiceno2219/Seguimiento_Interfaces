package Facturas;

import java.util.ArrayList;
import java.util.List;
public class Receipt {
    private Client client;
    private List<Product> productName;

    public Receipt(Client client) {
        this.client = client;
        productName = new ArrayList<>();
    }

    public void addProducts(Product product) {
        productName.add(product);
    }

    public double sumTotal() {
        double total = 0;
        for (Product producto : productName) {
            total += producto.getTotal();
        }
        return total;
    }

    public void showReceipt() {

        System.out.println("For" + client.getName());
        System.out.println("Address: " + client.getAddress());
        System.out.println("Phone number: +57" + client.getPhone());
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");

        for (Product producto : productName) {
            System.out.println(producto.getProductName() + " x" + producto.getQuantity() + ": $" + producto.getPrice());
        }

        System.out.println("");
        System.out.println("Total: $" + sumTotal());
    }
}