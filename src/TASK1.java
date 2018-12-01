import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";

        StringBuilder h = new StringBuilder();
        h.append(first).reverse();

        StringBuilder w = new StringBuilder();
        w.append(second).reverse();

        System.out.print(h+ " ");
        System.out.print(w);


    }
}
