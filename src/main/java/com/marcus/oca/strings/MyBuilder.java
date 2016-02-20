package com.marcus.oca.strings;

/**
 * @author marcus
 */
public class MyBuilder {

    public static void main(String[] args) {


        // methods likely to come up on exam

        StringBuilder sb = new StringBuilder();
        System.out.println("Initial capacity - " + sb.capacity());
        sb.append("This is my String!");
        print(sb);
        sb.delete(sb.length() - 1, sb.length());
        print(sb);
        sb.deleteCharAt(0);
        print(sb);
        sb.replace(0,2,"Ha");
        print(sb);
        sb.insert(sb.length(), "extra");
        print(sb);

        sb.insert(sb.length() - 1, "!");
        print(sb);
        sb.reverse();
        print(sb);
        try {
            sb.charAt(sb.length() + 1);
        } catch (RuntimeException e) {  // StringIndexOutOfBoundsExeption
            System.out.println(e.getClass());
        }
        sb.setLength(0); // clear stringbuilder
        print(sb);

    }

    static void print(StringBuilder sb) {
        System.out.println("String is now : " + sb.toString() + " with length " + sb.length());
        System.out.println(" with capacity " + sb.capacity());


    }
}
