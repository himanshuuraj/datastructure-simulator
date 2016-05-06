/*
 * Decompiled with CFR 0_114.
 */
package Conversion;

import java.io.PrintStream;

public class Check {
    public static void main(String[] args) {
        String[] arg = new String[]{"A", "+", "(", "B", "*", "C", "-", "(", "D", "/", "E", "^", "F", ")", "*", "G", ")", "*", "H", ")"};
        char[] ch = new char[arg.length];
        for (int i = 0; i < arg.length; ++i) {
            ch[i] = arg[i].charAt(0);
        }
        String s = "abc";
        System.out.println(s.substring(0, 1));
    }

    public static int check_element(char x) {
        switch (x) {
            case '(': 
            case ')': 
            case '*': 
            case '+': 
            case '/': 
            case '^': {
                return 1;
            }
        }
        return 0;
    }
}

