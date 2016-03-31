import java.net.IDN;

public class PunyCodeTest {
    public static void main(String[] args) {
        System.out.println(IDN.toASCII("한글코딩")); // xn--bj0bv9kgwxoqf
        System.out.println(IDN.toASCII("daum")); // daum

        System.out.println(IDN.toUnicode("daum")); // daum
        System.out.println(IDN.toUnicode("한글코딩")); // 한글코딩
        System.out.println(IDN.toUnicode("xn--bj0bv9kgwxoqf")); // 한글코딩
    }
}
