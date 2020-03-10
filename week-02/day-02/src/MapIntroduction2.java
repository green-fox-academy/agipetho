import javax.lang.model.type.MirroredTypeException;
import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String>mySecondHashMap = new HashMap<>();
        mySecondHashMap.put("978-1-60309-452-8", "A Letter to Jo");
        mySecondHashMap.put("978-1-60309-459-7", "Lupus");
        mySecondHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        mySecondHashMap.put("978-1-60309-461-0", "The Lab");

        System.out.println(mySecondHashMap);

        for (Map.Entry<String, String> item : mySecondHashMap.entrySet()){
            System.out.println(item.getValue() + " ISBN: " + item.getKey());
        }
        mySecondHashMap.remove("978-1-60309-444-3");
        System.out.println(mySecondHashMap);

        mySecondHashMap.remove("978-1-60309-461-0", "The Lab");
        System.out.println(mySecondHashMap);
    }
}
