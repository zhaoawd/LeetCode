package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] ss = {"flower","flow","flight"};
        String sss = longesString(ss);
        System.out.println(sss);
        System.out.println("flow".indexOf("flower"));
        System.out.println("flower".indexOf("flow"));
    }

    private static String longesString(String[] strs) {
        if(strs.length == 0) {
            return "";
        } else if(strs.length == 1) {
            return strs[0];
        } else {
            int minLength = strs[0].length();
            for (String ss : strs) {
                if(ss.length() == 0) {
                    return "";
                }
                if(ss.length() < minLength){
                    minLength = ss.length();
                }
            }
            int length = 0;
            boolean on = true;
            for (; length < minLength && on; ) {
                for(int i = 1; i < strs.length && on; i++) {
                    if(!(strs[0].charAt(length) == strs[i].charAt(length))){
                        on = false;
                    }
                }
                if(on){
                    length++;
                }
            }
            if( length > 0) {
                return strs[0].substring(0,length);
            } else {
                return "";
            }
        }
    }

    // 水平扫描
    public static String longestCommonPrefixHorizontal(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    
    // 垂直扫描
    public String longestCommonPrefixVertical(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }

    // 分而治之
    public static String longestCommonPrefixDivideAndConquer(String[] strs) {
        if (strs == null || strs.length == 0) return "";    
            return longestCommonPrefix(strs, 0 , strs.length - 1);
    }
    
    private static String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix(strs, l , mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
       }
    }
    
    static String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());       
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
}