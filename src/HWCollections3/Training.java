package HWCollections3;

import java.util.HashMap;
import java.util.Map;

public class Training {
    private static Map <String, Integer> map = new HashMap();


    public static void main(String[] args) {

        map.put ("str1",6);
        map.put ("str1",8);
        map.put ("str2",7);



    }

    public static void addToMap (String str, Integer count) {
        if (map.containsKey (str) && map.get (str).equals (count)){
            throw new RuntimeException ("Нельзя добавить эту строчку");
        }
        map.put (str, count);
    }

}
