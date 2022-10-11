package fizzbuzz;

import helpers.OrderedListCreator;

import java.util.List;

public class FizzBuzz {
    private List<Integer> integerList;

    public FizzBuzz(List<Integer> input) {
        integerList = input;
    }

    public void print() {
        for (int i :
                integerList) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
