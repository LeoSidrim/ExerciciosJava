import java.util.*;
import java.io.*;

class Test{ //interesting Strings functions
    public static void main(String []argh){

        String original = "abc DFG hIJ KLm ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2,9);
        String s5 = original.replace('a','x');
        String s6 = original.replace("abc","leo");
        int i = original.indexOf("bc");

        System.out.println("Original: -"+original+"-");
        System.out.println("toLowerCase: -"+s1+"-");
        System.out.println("toUpperCase: -"+s2+"-");
        System.out.println("trim: -"+s3+"-");
        System.out.println("subString(2,9): -"+s4+"-");
        System.out.println("replace('a','x'): -"+s5+"-");
        System.out.println("replace('abc'','leo'): -"+s6+"-");
        System.out.println("indexOf('bc'): -"+i+"-");

    }
}
