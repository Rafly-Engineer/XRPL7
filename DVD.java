package persewaan;

import java.util.Scanner;

//subclass
public class DVD extends Product {
    protected int length;
    protected String rating;
    protected String studio;

    public DVD() {
        number = 10;
        name = "Fight Club";
        quantity = 0;
        price = 0.0;
        length = 0;
        rating = "NC-21";
        studio = "American Idiot";

    }

    public void print() {
        System.out.println("Number ;"+number);
        System.out.println("Film Name: "+name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("Length: "+length);
        System.out.println("Film Rating: "+rating);
        System.out.println("Studio: "+studio);
}
}