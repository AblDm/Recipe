package HWCollections3;


import java.util.Map;
import java.util.LinkedHashMap;
public class LinkedM {
  private static final  Map<Integer, String> map = new LinkedHashMap<> ();

    public static void main(String[] args) {

      map.put (1,"Один");
      map.put (24,"Двадцать четыре");
      map.put (5,"Пять");
      map.put (613,"Шестьсот тринадцать");
      map.put (11,"Одинадцать");
      map.put (111,"Сто одиннадцать");
      map.put (55,"Пятьдесят пять");
      map.put (15,"Пятнадцать");

      System.out.println (map);

    }


}
