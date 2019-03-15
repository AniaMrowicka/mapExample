package dictionaryPlEn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Post one = new Post("pies", "dog");
        Post two = new Post("dom", "house");
        Post three = new Post("kot", "cat");
        Post four = new Post("zabawka", "toy");
        Post five = new Post("kaczka", "duck");

        dictionary.addPosition(one);
        dictionary.addPosition(two);
        dictionary.addPosition(three);
        dictionary.addPosition(four);
        dictionary.addPosition(five);


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj słowo");
        String inputWord = scanner.nextLine();
        System.out.println("tłumaczenie: " + dictionary.findATranslate(inputWord));
    }
}
