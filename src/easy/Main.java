package easy;

public class Main {

    public static void main(String[] args) {
        int[] A = {0,1,2,0};
        PeakIndex indexer = new PeakIndex();
        int index = indexer.peakIndexInMountainArray(A);
        System.out.println(index);
    }
}
