import java.util.HashMap;
import java.util.Scanner;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give String to find duplicates in it");
        String str = sc.nextLine();
        HashMap<Character, Integer> charCountMap = countCharacters(str);

        System.out.println("Duplicate characters and their counts:");
        for (char ch : charCountMap.keySet()) {
            int count = charCountMap.get(ch);
            if (count > 1 && ch != ' ') {
                System.out.println(ch + ": " + count);
            }
        }
    }

    public static HashMap<Character, Integer> countCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] characters = str.toCharArray();


        for (char ch : characters) {

            if (ch != ' ') {
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1);
                } else {
                    charCountMap.put(ch, 1);
                }
            }
        }

        return charCountMap;
    }
}
