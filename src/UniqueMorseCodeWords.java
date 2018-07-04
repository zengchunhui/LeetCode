import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> result = new HashSet<>();
        for (String word:words) {
            StringBuffer code = new StringBuffer();
            for (char c:word.toCharArray()) {
                code.append(codes[c-'a']);
            }
            result.add(code.toString());
        }
        return result.size();
    }

    public static void main(String[] args){
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        String[] data = {"gin", "zen", "gig", "msg"};
        int num = uniqueMorseCodeWords.uniqueMorseRepresentations(data);
        System.out.println(num);
    }
}
