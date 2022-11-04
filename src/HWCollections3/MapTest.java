package HWCollections3;

import java.util.*;

public class MapTest {
    public static final Map <String, List<Integer>> mapFrom = new HashMap <>();
    public static final Map <String, Integer> mapTo = new HashMap <>();


    public static void main(String[] args) {
        Random random = new Random ();
        var listOne  = new ArrayList<> (List.of(1,4,5,6,18));
        for (int i = 0; i < 4; i++) {
            listOne.add(random.nextInt (10));
            
        }
        var listTwo  = new ArrayList<> (List.of (1, 4, 5, 6, 18));
        for (int i = 0; i < 4; i++) {
            listTwo.add(random.nextInt (10));

        }
        var listThree  = new ArrayList<> (List.of(1,4,5,6,18));
        for (int i = 0; i < 4; i++) {
            listThree.add(random.nextInt (10));

        }
        mapFrom.put ("List1", listOne);
        mapFrom.put ("List2", listTwo);
        mapFrom.put ("List3", listThree);

        System.out.println (mapFrom);

        for (var entry : mapFrom.entrySet ()) {
            Integer sum = 0;
            List <Integer> templist = entry.getValue();
            for (Integer integerSum : templist){
                sum += integerSum ;
            }

            mapTo.put (entry.getKey (), sum);
        }
        System.out.println (mapTo);
    }
}
