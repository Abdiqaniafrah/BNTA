package com.bnta.week_one_fri;

public class Exercise3 {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end

         */
        String[] content = {"you", "are", "how", "hello"};
//        System.out.println(content.length);
//        System.out.println(content[3]);
//        System.out.println(content[content.length -1]);

//        for (int i = 0; i < content.length; i++) {
//            System.out.println(i + " index -> " + content[i]);
//        }

        System.out.println("reverse");

        String result = "";
        for (int j = content.length - 1; j >= 0; j--) {
            System.out.println(j + " index -> " + content[j]);
            result += content[j] + " ";
        }
        System.out.println(result.substring(0, result.length() -1) + "?");

    }
}