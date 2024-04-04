import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a sentence to count word");
        String sentence = sc.nextLine();
        HashMap<String, Integer> wordCountMap = countWords(sentence);

        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.print(word + "=" + wordCountMap.get(word)+", ");
        }
    }

    public static HashMap<String, Integer> countWords(String sentence) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
