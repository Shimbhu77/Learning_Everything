import java.util.Map;
import java.util.HashMap;

public class HashMapImpl {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Shimbhu Kumawat", 22);
        map.put("Payal Kumawat", 22);
        map.put("Pooja Kumawat", 21);

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println("key: "+entry.getKey()+" , value: "+entry.getValue());
        }

        // another of iterating 

        for(String key : map.keySet())
        {
            System.out.println("key : "+key+" , value :  "+map.get(key));
        }

        
    }
}