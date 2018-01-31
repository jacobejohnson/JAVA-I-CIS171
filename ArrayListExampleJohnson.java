// Jacob Johnson
import java.util.ArrayList;

public class ArrayListExampleJohnson
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       names.add("Andy");
       names.add("Angela");
       names.add("Dwight");
       names.add("Erin");
       names.add("Jim");
       names.add("Michael");
       names.add("Pam");
       names.add("Toby");
       System.out.println("Below is the array.");
       System.out.println(names);
       System.out.println("");
       System.out.println("Below are all the names in the array list via .get method.");
       for(int i = 0; i < names.size(); i++) {
    	   System.out.println(names.get(i));
       }
       System.out.println("");
       System.out.println("There are " + names.size() + " names in the array list.");
       
       System.out.println(" ");
       names.set(0, "Andy Bernard");
       System.out.println("Below will print out the names with Andy changed to Andy Bernard.");
       System.out.println(names);
       
       System.out.println("");
       names.add(5, "Kelly");
       System.out.println("Below will print out the names with Kelly inserted after Jim.");
       System.out.println(names);
       
       System.out.println("");
       System.out.println("Below will print out the names using an enhanced for loop.");
       for(String i : names) {
    	   System.out.println(i);
       }
       System.out.println("");
       ArrayList names2 = new ArrayList();
       names2.addAll(names);
       System.out.println("Below is the array names2.");
       System.out.println(names2);
       System.out.println("");
       names.remove(0);
       System.out.println("Below will print out names without Andy Bernard and names2 with Andy Bernard.");
       System.out.println(names);
       System.out.println(names2);
       
   }
} 