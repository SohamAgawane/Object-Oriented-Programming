package com.soham.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        // Wrapper Classes -
        // Wrapper classes are classes that convert primitive data types into objects.

        /*
        Primitive → Wrapper (Object):
            int → Integer
            float → Float
            double → Double
            char → Character
            boolean → Boolean
         */

        int a = 10;

        Integer b = a;  // autoboxing -> primitive to object

        int c = b;  // unboxing -> object to primitve
    }
}

