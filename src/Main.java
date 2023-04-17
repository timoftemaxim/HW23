import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("one", 1);
        linkedHashMap.put("two", 2);
        linkedHashMap.put("three", 3);
        linkedHashMap.put("four", 4);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(linkedHashMap.values());

        for (Integer value : linkedHashSet) {
            System.out.println("Value: " + value);
        }

        LinkedList<String> linkedList = new LinkedList<>(linkedHashMap.keySet());

        for (String key : linkedList) {
            System.out.println("Key: " + key);
        }
    }

}
