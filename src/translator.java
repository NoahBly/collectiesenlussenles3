import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class translator {


    HashMap<Integer,String> numericAlpha = new HashMap<>();


    public translator (int[] numeric, String[] alphabetic) {
        for(int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i],alphabetic[i]);
        }
    }

    public String translate (Integer number) {
       return numericAlpha.get(number);


    }
}
