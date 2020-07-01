package String;

import java.util.Scanner;

public class IntegerToRoman {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            System.out.println(intToRoman_1(scanner.nextInt()));
        }
        scanner.close();
    }

    public static String intToRoman_1(int num) {
        StringBuilder rr = new StringBuilder();
        int p1 = num % 10;
        int p2 = (num/10) % 10;
        int p3 = (num/100) % 10;
        int p4 = (num/1000) % 10;
        while(p4-- > 0) {
            rr.append("M");
        }
        if(p3 == 9) {
            rr.append("CM");
        } else if(p3 > 4) {
            rr.append("D");
            while((p3-- - 5) > 0) {
                rr.append("C");
            }
        } else if(p3 == 4) {
            rr.append("CD");
        } else if(p3 > 0) {
            while(p3-- > 0) {
                rr.append("C");
            }
        }
        if(p2 == 9) {
            rr.append("XC");
        } else if(p2 > 4) {
            rr.append("L");
            while((p2-- - 5) > 0) {
                rr.append("X");
            }
        } else if(p2 == 4) {
            rr.append("XL");
        } else if(p2 > 0) {
            while(p2-- > 0) {
                rr.append("X");
            }
        }
        if(p1 == 9) {
            rr.append("IX");
        } else if(p1 > 4) {
            rr.append("V");
            while((p1-- - 5) > 0) {
                rr.append("I");
            }
        } else if(p1 == 4) {
            rr.append("IV");
        } else if(p1 > 0) {
            while(p1-- > 0) {
                rr.append("I");
            }
        }
        return rr.toString();
    }
}