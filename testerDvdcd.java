package persewaan;

import java.util.Scanner;

public class testerDvdcd {
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        String choice = "";
        CD cd = new CD();
        DVD dvd = new DVD();

        System.out.println("Anda Ingin Membeli CD/DVD? ");
        choice = S.nextLine();
    
        if (choice.equalsIgnoreCase("CD")) {
            cd.print();
        } else if (choice.equalsIgnoreCase("DVD")) {
            dvd.print();
            
        }

        
    }
}
