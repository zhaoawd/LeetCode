package String;

import javax.lang.model.element.Element;

public class ImplementstrStr {
    public static void main(String[] args) {
        
    }

    public static int strStr(String haystack, String needle) {
        if(null == needle) {
            return -1;
        } else if (needle.isEmpty()) {
            return 0;
        } else {
            return haystack.indexOf(needle);
        }
    }
}