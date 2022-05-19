import java.util.TreeMap;

public class MyApp {
    public static void main(String[] args) {
        String word = args[0].toLowerCase();
        TreeMap<Character, Integer> counted = countLetters(MyApp.class.getName().toLowerCase(), word);
        System.out.println(counted);
    }

    public static TreeMap<Character, Integer> countLetters(String className, String word){
        TreeMap<Character, Integer> result = new TreeMap<>();
        for (int i=0; i<word.length(); i++){
            Character c = word.charAt(i);
            if (result.containsKey(c)){
                result.put(c, result.get(c)+1);
            }else{
                result.put(c, 1);
            }
        }
        /*
        To match example results I have to add string "MyApp"/class name
         */
        for (int i=0; i<className.length(); i++){
            Character c = className.charAt(i);
            if (result.containsKey(c)){
                result.put(c, result.get(c)+1);
            }else{
                result.put(c, 1);
            }
        }
        return result;
    }
}
