package com.company;

/**
 * Created by Daniil Kornienko on 23.04.2016.
 */
public class InnerNested {
    public String testField = "(testField)";

    public static class Mynested // Вложенный класс
    {
        public String nested = "(Nested)";

        public void nedtesShow() {
            System.out.println("Hello I'm nested" + nested);
        }

    }

    public class Myinner //внутрений
    {
        public String inner = "(inner)";

        public void innerShow() {
            System.out.println("Hello I'm inner" + inner);
        }
    }

    public void show() {
        System.out.println("I'm simple clss" + testField);
    }
}
