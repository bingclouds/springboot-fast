package cn.tongdun.mybatis.utils;

public class NumToNormal {

    public static String getNormalNum(String num) {
        String[] numSplit = getNumSplit(num);
        StringBuffer sb = new StringBuffer();
        StringBuffer normalNum = sb.append("K").append(numSplit[0]).append("+").append(fillZeroString(3, numSplit[1]));
        System.out.println("num: " + num + "\t normalNum: " + normalNum);
        return normalNum.toString();
    }

    private static String[] getNumSplit(String stringNum) {
        if (stringNum.contains(".")) {
            String[] split = stringNum.split("\\.");
            return split;
        }
        return new String[]{stringNum, ""};
    }

    /**
     * @param n   总位数
     * @param num 字符串数字
     * @return
     */
    private static String fillZeroString(int n, String num) {
        String fillZero = num + String.format("%1$0" + (n - num.length()) + "d", 0);
        return fillZero;
    }


    public static void main(String[] args) {
        getNormalNum("236.4");
        getNormalNum("236.4");
        getNormalNum("203.2");
        getNormalNum("0");
        getNormalNum("0.1");
    }
}
