package solution;

import fizzbuzz.FizzBuzz;
import helpers.OrderedListCreator;

public class Solution {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(OrderedListCreator.getInstance());
        fizzBuzz.print();
    }
}
