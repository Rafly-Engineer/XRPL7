package persewaan;
//subclass
public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 0;
        name = "To Let A Good Thing Die";
        quantity = 0;
        price = 0.0;
        artist = "Bruno Major";
        totalSong = 0;
        label = ""; 
    }
    
    public void print() {
        System.out.println("Number ;" +number);
        System.out.println("Film Name: " +name);
        System.out.println("Quantity: " +quantity);
        System.out.println("Price: " +price);
        System.out.println("Artist: " +artist);
        System.out.println("Total Song: " +totalSong);
        System.out.println("Label: " +label);

    }
    
}
