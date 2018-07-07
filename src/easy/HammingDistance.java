package easy;

public class HammingDistance {
    /**
     * HammingDistance
     * @param args
     */

    public static void main(String[] args) {
        Codec coder = new Codec();
        System.out.println(coder.decode(coder.encode("https://leetcode.com/problems/design-tinyurl")));
    }
    public int hammingDistance(int x, int y) {
        int i = 0;
        int distance = 0;
        while (i < 32){
            if((x%2) != (y%2)){
                distance++;
            }
            x = x >> 1;
            y = y >> 1;
            i++;
        }
        return distance;
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] chars = moves.toCharArray();
        for (char c: chars) {
            switch (c){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }

        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }
}
