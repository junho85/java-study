import com.google.common.collect.Lists;

import java.util.List;

public class Cell {
    public static void main(String[] args) throws InterruptedException {
        List<String> cells = Lists.newArrayList();
        cells.add("o");

        int i=1;
        do {
            System.out.println("round=" + i);

            print(cells);
            round(cells);

            System.out.println("");
            Thread.sleep(1000);
            i++;
        } while (true);

    }



    private static void round(List<String> cells) {
        int size = cells.size();
        for (int i=0; i<size; i++) {
            if ("o".equals(cells.get(i))) {
                cells.set(i, "O");
            } else if ("O".equals(cells.get(i))) {
                cells.set(i, "8");
            } else if ("8".equals(cells.get(i))) {
                cells.set(i, "o");
                cells.add("o");
            }
        }
    }

    private static void print(List<String> cells) {
        for (String cell : cells) {
            System.out.print(cell);
        }

    }
}
