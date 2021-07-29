package immutableclass;

import java.util.HashMap;
import java.util.Map;

public class ImmClass {
    final int id;
    final String name;
    private final Map<Integer, String> map;
    ImmClass(Map<Integer, String> map) {

        this.name = "Abcd";
        this.id = 1;
        this.map = map;
        this.map.put(1, "Dhiraj");
    }
//no setter methods provided

    Map<Integer, String> getMap() {
        //return a new list when requested
        return new HashMap<>(map);
    }

}
