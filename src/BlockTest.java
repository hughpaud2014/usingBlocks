/*
Credit: Oracle: Java The Complete Reference Eleventh Edition
Created by: Paul Hughes

Demonstrate a block of code

Call this file "BlockTest.java"
 */

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        // The target of this loop is a block
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y = y - 2;

        }

    }
    
}
