package HW2task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Numbers {


    public static boolean numbersSet;
    static Set<Integer> numbers= new HashSet<> ();
    private static Set<Integer> setNumbers;


    public static void fillSetRandomNumber(){
        int counter = 0;
        Random ran = new Random ();
        while (counter<20) {
            numbers.add (ran.nextInt (1001));
            counter++;
        }
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    public static Set<Integer> getNumbers() {
        return numbers;
    }

    public static void setNumbers(Set<Integer> numbers) {
        Numbers.numbers = numbers;
    }


    public static Set<Integer> getSetNumbers() {
        return setNumbers;
    }



}
