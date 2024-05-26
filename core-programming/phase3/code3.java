package phase3;
import java.util.HashMap;
public class code3 {
    public static void main(String args[]){
        // key value pair
        HashMap <String, Integer> score = new HashMap <String, Integer> ();

        // putting into HashMap
        score.put("Chem", 95);
        score.put("Math", 100);
        score.put("Phy", 71);
        score.put("Astrology", 70);

        // printing HashMap
        System.out.println(score.toString());
        // the order in which the elements are printed above is random

        // getting the value for a key
        System.out.println(score.get("Phy"));

        // puts a {key, value} pair only if the key is absent in the HashMap
        score.putIfAbsent("Eng", 85);
        score.putIfAbsent("Math", 85);
        System.out.println(score.toString());

        // replacing a value of the existing key
        score.replace("Eng", 100);
        score.replace("Bio", 100);
        System.out.println(score.toString());

        // Getting a different value other than null when the key is not present in the HashMap
        System.out.println(score.get("Bio"));              // prints null as Bio is not present in the HashMap
        System.out.println(score.getOrDefault("Bio", -1)); // prints -1 as Bio is not present in the HashMap

        // removing an item in a HashMap
        score.remove("Phy");
        score.remove("zoology");
        System.out.println(score.toString());

        // checking the existence of the key
        System.out.println(score.containsValue(100));
        System.out.println(score.containsValue(99));
        System.out.println(score.containsValue(Integer.valueOf(100)));

        // looping through the elements in HashMap
        score.forEach((key, value) ->{
            System.out.println(key + " -> " + value);
        });

        // updating the elements in the HashMap
        score.forEach((key, value) ->{
            score.replace(key, value - 10);
        });
        System.out.println(score.toString());

        // clearing the HashMap
        score.clear();
        System.out.println(score.size());
    }
}
