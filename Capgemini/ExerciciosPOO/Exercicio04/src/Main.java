import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice("Mousepad", 1, -10, 50.0f);

        System.out.println("Valor total = " + inv.getInvoiceAmount());
    }
}