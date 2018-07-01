import java.util.Arrays;

public class JewelsAndStones {
    /**
     * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
     * Each character in S is a type of stone you have.
     * You want to know how many of the stones you have are also jewels.
     *
     * The letters in J are guaranteed distinct, and all characters in J and S are letters.
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     *
     * Input: J = "z", S = "ZZ"
     * Output: 0
     *
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        char[] stones = S.toCharArray();
        char[] jewels = J.toCharArray();
        Arrays.sort(stones);
        Arrays.sort(jewels);
        int result = 0;
        int index = 0;
        for (int i = 0; i < jewels.length; i++) {
            while ((index<stones.length)&&(stones[index]<jewels[i])){
                index++;
            }
            while ((index<stones.length)&&(stones[index]==jewels[i])){
                index++;
                result++;
            }
        }
        return result;
    }

    private void sort(char[] chars){
        int length = chars.length;
        int h = 1;
        while (h < length/3) h = 3*h+1;
        while (h >= 1){
            for (int i = h; i < length; i++) {
                for (int j = i; (j >=h)&&(chars[j]<chars[j-h]); j-=h) {
                    char temp = chars[j];
                    chars[j] = chars[j-h];
                    chars[j-h] = temp;
                }
            }
            h = h/3;
        }
    }



    public static void main(String[] args){
        JewelsAndStones stones = new JewelsAndStones();
        System.out.println(stones.numJewelsInStones("bec","deea"));
    }
}

