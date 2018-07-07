package easy;

public class FlipAndInvertImage {
    /**
     * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
     *
     * To flip an image horizontally means that each row of the image is reversed.
     * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
     *
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
     * For example, inverting [0, 1, 1] results in [1, 0, 0].
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int[][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int index = (len*2-1-j)%len;
                result[i][j] = inventNum(A[i][index]);
            }
        }
        return result;
    }

    public int inventNum(int num){
        if(num==0){
            return 1;
        }
        return 0;
    }
}
