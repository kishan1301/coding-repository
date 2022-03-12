package com.photon;

import java.util.Stack;

public class StringRepetition {
    public static void main(String[] args) {
        /*
        *   Given a String printing it's repetive and subsequent values
        *   for eg. VVVXXTTRRRRJJVV
        *   o/p: 3V2X2T4R2J2V
        */
        String string = "VVVXXTTRRRRJJVV";

        Stack<Integer> values = new Stack<>();
        char prevChar = string.charAt(0);
        int counter = 1;
        for (int i = 1; i < string.length(); i++) {
            char curr = string.charAt(i);
            if (curr == prevChar) {
                counter++;
                continue;
            }
            System.out.print(counter + String.valueOf(prevChar));
            counter = 1;
            prevChar = curr;

        }
        System.out.println(counter + String.valueOf(prevChar));
    }
}

/***
 p
 VVVXXTTRRRRJJVV

 prev = X
 counter = 2
 curr = T

 op:
 3VX2t
 ***/