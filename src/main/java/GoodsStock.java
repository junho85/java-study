import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class GoodsStock {
    String goodsCode;

    int stockNum;

    GoodsStock(String code, int num) {
        goodsCode = code;
        stockNum = num;
    }

    void addStock(int amount) {
        stockNum += amount;
    }

    int subtractStock(int amount) {
        if(stockNum < amount)
            return 0;
        stockNum -= amount;
        return amount;
    }

    public static void main(String[] args) {
//        GoodsStock obj;
//        obj = new GoodsStock("52135", 200);
//        System.out.println("상품코드:" + obj.goodsCode);
//        System.out.println("재고수량:"+obj.stockNum);
//        int result = obj.subtractStock(300);
//        System.out.println("리턴값:" + result);
//        System.out.println("상품코드:" + obj.goodsCode);
//        System.out.println("재고수량:" + obj.stockNum);

        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("mail-smail-vm1.hanmail.net", 25), 1000);
            byte[] address = socket.getInetAddress().getAddress();
            System.out.println(socket.getInetAddress().getHostAddress());
            System.out.println(address.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}