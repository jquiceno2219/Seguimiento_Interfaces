package Facturas;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(" Yo Mum", "Calle 13", " 310 696 9696");

        Receipt receipt = new Receipt(client);

        Product product = new Product("iPhone 14", 23894, 3);
        receipt.addProducts(product);

        receipt.showReceipt();
    }
}