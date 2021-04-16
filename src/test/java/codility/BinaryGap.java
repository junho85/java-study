package codility;

import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap b = new BinaryGap();
        System.out.println(b.solution(32));
    }

    public int solution(int N) {
        return Arrays.stream(Integer.toBinaryString(N).replaceAll("0*$", "")
                .split("1"))
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);
    }
}
