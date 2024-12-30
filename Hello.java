import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        // Main list to hold all categories
        ArrayList<ArrayList<String>> buyings = new ArrayList<>();

        // Fruits list
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Vegetables list
        ArrayList<String> veg = new ArrayList<>();
        veg.add("onion");
        veg.add("tomato"); // Fixed spelling
        veg.add("radish"); // Fixed spelling

        // Non-vegetarian items list
        ArrayList<String> nveg = new ArrayList<>();
        nveg.add("chicken");
        nveg.add("beef");
        nveg.add("mutton"); // Fixed spelling

        // Add all categories to the buyings list
        buyings.add(fruits);
        buyings.add(veg);
        buyings.add(nveg);

        // Debugging: Print each sublist to verify its content
        System.out.println("Fruits: " + fruits);
        System.out.println("Vegetables: " + veg);
        System.out.println("Non-Vegetarian: " + nveg);

        // Printing the entire buyings list
        System.out.println("\nBuyings:");
        for (ArrayList<String> category : buyings) {
            System.out.println(category);
        }
    }
}
