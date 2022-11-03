package HW2task2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class MultiplicationTable {

    private static Set<String> setTasks = new HashSet<> ();
    static final int COUNT_PUPIL = 15;

    public MultiplicationTable (){
    }

    public static String generatePairNumber (){
        int x;
        int y;
        Random ran = new Random ();

        x = ran.nextInt (10);
        y = ran.nextInt (10);
        return x +"*" + y;
    }

    public static void main(String[] args) {
        int count = 0;

        while (count <15){
            String pairNumber = generatePairNumber ();
           String inverseNumber = String.valueOf (pairNumber.charAt (2) + pairNumber.charAt (0));
            if(!setTasks.contains (pairNumber) && !setTasks.contains (inverseNumber)){
                setTasks.add (pairNumber);
                count++;
            }

        }
        System.out.println (setTasks);
    }

    public static boolean checkTask (String pairNumber) {
        String invertedPairNumber = String.valueOf (pairNumber.charAt (2) + pairNumber.charAt (0));
        for (String task : setTasks){
            if (pairNumber.equals (task) || invertedPairNumber.equals (task)){
            return true;
            }
        }
        return false;
    }

    public static void generateTasks (){
        setTasks.add (generatePairNumber ());
        while (setTasks.size ()< COUNT_PUPIL){
            String pairNumber = generatePairNumber ();
            while (checkTask (pairNumber)){
                pairNumber = generatePairNumber ();
            }
            setTasks.add (pairNumber);
        }
    }

    public static Set<String> getSetTasks() {return setTasks;}
}
