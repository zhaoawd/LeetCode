package String;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            // System.out.println(convert_1(scanner.nextLine()));
            System.out.println(convert_2(scanner.nextLine()));
        }
        scanner.close();
    }

    // 原始思路，一个一个判断求和
    public static int convert_1(String s) {
        // (M/CM)?(D/CD)?(C/XC)?(L/XL)?(X/IX)?(V/IV)?(I)?
        int result = 0;
        String[] ns = s.split("");
        for (int i = 0; i < ns.length; i++) {
            if("M".equals(ns[i])){
                result += 1000;
            } else if("C".equals(ns[i])) {
                if(i < ns.length - 1 && "M".equals(ns[i+1])) {
                    result += 900;
                    i++;
                } else if (i < ns.length - 1 && "D".equals(ns[i+1])) {
                    result += 400;
                    i++;
                } else {
                    result += 100;
                }
            } else if("D".equals(ns[i])) {
                result += 500;
            } else if("X".equals(ns[i])) {
                if(i < ns.length - 1 && "C".equals(ns[i+1])) {
                    result += 90;
                    i++;
                } else if (i < ns.length - 1 && "L".equals(ns[i+1])) {
                    result += 40;
                    i++;
                } else {
                    result += 10;
                }
            } else if("L".equals(ns[i])) {
                result += 50;
            } else if("I".equals(ns[i])) {
                if(i < ns.length - 1 && "X".equals(ns[i+1])) {
                    result += 9;
                    i++;
                } else if(i < ns.length - 1 && "V".equals(ns[i+1])) {
                    result += 4;
                    i++;
                } else {
                    result += 1;
                }
            } else if("V".equals(ns[i])) {
                result += 5;
            }
        }
        return result;
    }

    // 罗马数字特点，4和9都是小值在大值左边
    private static int convert_2(String s) {
        HashMap<String,Integer> dict = new HashMap<>();
        dict.put("I" , 1);
        dict.put("V" , 5);
        dict.put("X" , 10);
        dict.put("L" , 50);
        dict.put("C" , 100);
        dict.put("D" , 500);
        dict.put("M" , 1000);
        int result = 0;
        for (int j = 0; j < s.length(); j++) {
            int currentIntValue = dict.get(String.valueOf(s.charAt(j)));
            if(j< s.length() -1) {
                int nextIntValue = dict.get(String.valueOf(s.charAt(j+1)));
                if( currentIntValue >= nextIntValue) {
                    result += currentIntValue;
                } else {
                    result += (nextIntValue - currentIntValue);
                    j++;
                }
            } else {
                result += currentIntValue;
            }
        }

        return result;
    }
}