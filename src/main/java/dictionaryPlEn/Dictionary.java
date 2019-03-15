package dictionaryPlEn;

import java.util.HashMap;

public class Dictionary {
    private static HashMap<String, String> dictionary = new HashMap<String, String>();
    private static Post post = new Post();

    public static void addPosition (Post post){
        dictionary.put(post.getPolishWord(), post.getEnglishWord());
    }
    public static String findATranslate (String polishWord){
        return dictionary.get(polishWord);
    }
    public static void deletePosition (String polishWord){
        dictionary.remove(polishWord);
        System.out.println("Position "+ polishWord + " successfuly removed.");
    }
}
