import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// import javax.swing.JOptionPane;
public class Hello {

    public static void main(String args[]) {
       ArrayList<String> fruits = new ArrayList<>();
       fruits.add("apple");
       fruits.add("banana");
       fruits.add("orange");
       for (String string : fruits) {
        System.out.print(string +' ');
       }
    }
} 
