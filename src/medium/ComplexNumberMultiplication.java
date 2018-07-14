package medium;

/**
 * @description: 复数相乘
 * @author: zengchunhui
 * @create: 2018-07-11 19:44
 *
 * Given two strings representing two complex numbers.
 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition
 *
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 *
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 *
 * The input strings will not have extra blank.
 * The input strings will be given in the form of a+bi,
 * where the integer a and b will both belong to the range of [-100, 100].
 * And the output should be also in this form.
 **/
public class ComplexNumberMultiplication {

    public String complexNumberMultiply(String a, String b) {
        int[] aParam = getParam(a);
        int[] bParam = getParam(b);
        int aResult = aParam[0]*bParam[0]-aParam[1]*bParam[1];
        int bResult = aParam[0]*bParam[1]+aParam[1]*bParam[0];
        StringBuilder builder = new StringBuilder();
        builder.append(aResult);
        builder.append("+");
        builder.append(bResult);
        builder.append("i");
        return builder.toString();

    }

    private int[] getParam(String number){
        int[] params = new int[2];
        String[] paramString = number.split("\\+");
        params[0] = Integer.valueOf(paramString[0]);
        params[1] = Integer.valueOf(paramString[1].substring(0,paramString[1].length()-1));
        return params;
    }
}
