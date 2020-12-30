package stream;

import model.Product;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;

public class SumTest {
    @Test
    void test() {
        List<Product> products = List.of(
                Product.builder().price(1000).build(),
                Product.builder().build(),
                Product.builder().price(2000).build()
        );

        int sum = products.stream()
                .map(Product::getPrice)
                .filter(Objects::nonNull)
                .mapToInt(e -> e)
                .sum();
        System.out.println(sum);


    }

}
