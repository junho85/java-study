//package cc.kevinlee.kevintvkr.ep06;
//
//import lombok.Data;
//
//import java.math.BigDecimal;
//import java.util.*;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//import static java.util.stream.Collectors.groupingBy;
//import static java.util.stream.Collectors.joining;
//
//public class StreamVsSql {
//    public static BigDecimal $(String value) {
//        return new BigDecimal(value);
//    }
//
//    public static void main(String[] args) {
//        final List<Coin> coinList = Arrays.asList(
//            new Coin("Won", $("20000")),
//            new Coin("Won", $("5000")),
//            new Coin("Won", $("340")),
//
//            new Coin("Yen", $("200")),
//            new Coin("Yen", $("3200")),
//
//            new Coin("Dollar", $("75.00")),
//            new Coin("Dollar", $("639")),
//            new Coin("Dollar", $("100")),
//
//            new Coin("Euro", $("800")),
//            new Coin("Euro", $("1111")),
//            new Coin("Euro", $("999"))
//        );
//
//        Map<String, List<Coin>> currencyToCoin = new HashMap<>();
//
//        for (final Coin coin : coinList) {
//            final List<Coin> coins;
//            if (currencyToCoin.containsKey(coin.getCurrencyName())) {
//                coins = currencyToCoin.get(coin.getCurrencyName());
//            } else {
//                coins = new ArrayList<>();
//                currencyToCoin.put(coin.getCurrencyName(), coins);
//            }
//            coins.add(coin);
//        }
//
//        System.out.println(
//                mapToString(currencyToCoin)
//        );
//
//        System.out.println("------------------------------------------------");
//
//        System.out.println(
//            mapToString(
//                coinList.stream()
//                        .collect(groupingBy(Coin::getCurrencyName))
//                )
//        );
//
//
//    }
//
//    private static <K, V> String mapToString(Map<K, V> map) {
//        return map.entrySet().stream()
//                .map(entry -> "(" + entry.getKey() + "=" + entry.getValue() + ")")
//                .collect(joining("\n"));
//    }
//
////    private static <K, E, V extends List<E>> String mapToStringWithBigDecimalSum(Map<K, V> map, BiFunction<E, E, E> adder) {
////        return map.entrySet().stream()
////                .map(entry -> "(" + entry.getKey() + "=" + entry.getValue()
////                        .stream()
////                        .reduce(adder)
////
////                        + ")")
////                .collect(joining("\n"));
////    }
//}
//
//@Data
//class Coin {
//    private final String currencyName;
//    private final BigDecimal amount;
//}