import java.net.IDN;

public class PunyCodeTest {
    public static void main(String[] args) {
        System.out.println(IDN.toASCII("한글코딩"));
    }
}
