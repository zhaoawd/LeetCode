package String;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        
    }

    public static boolean isValid(String s) {
        Map<String,Integer> kv = new HashMap<>();
        kv.put("(", -1);
        kv.put(")", 1);
        kv.put("{", -2);
        kv.put("}", 2);
        kv.put("[", -3);
        kv.put("]", 3);

        if( null == s) {
            return false;
        } else if(s.isEmpty()) {
            return true;
        }  else if ( s.length() % 2 != 0) {
            return false;
        } else {
            int sum = 0;
            int currentValue = 0;
            for (int i = 0; i < s.length(); i++) {
                currentValue = kv.get(String.valueOf(s.charAt(i))).intValue();
                sum += currentValue;
                if (currentValue > 0) {
                    
                }
            }
        }
        return true;
    }
}