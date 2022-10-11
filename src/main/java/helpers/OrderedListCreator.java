package helpers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OrderedListCreator {
    private static List<Integer> orderedList;
    private static Integer start;
    private static Integer end;

    private OrderedListCreator() {
    }

    private static void createList() {
        if (start == null) {
            start = 1;
        }
        if (end == null) {
            end = 100;
        }
        orderedList = IntStream.rangeClosed(start, end)
                .boxed().collect(Collectors.toList());
    }

    public static List<Integer> getInstance() {
        if (orderedList == null) {
            createList();
        }
        return orderedList;
    }

    public static void setStart(Integer start) {
        OrderedListCreator.start = start;
    }

    public static void setEnd(Integer end) {
        OrderedListCreator.end = end;
    }
}
