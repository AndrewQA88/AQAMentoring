package exercises.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithList {

    public static void main(String[] args) {
        List<String> ngmp = new ArrayList<>();
        ngmp.add("A");
        ngmp.add("O");
        List<String> tw = new ArrayList<>();
        tw.add("I");
        tw.add("N");
        Map<String, List<String>> list = new HashMap<>();
        list.put("NGMP", ngmp);
        list.put("TW", tw);

        System.out.println(list);

    }
}

