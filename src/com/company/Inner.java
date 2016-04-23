package com.company;

/**
 * Created by Daniil Kornienko on 23.04.2016.
 */
public class Inner {
    public static void main(String[] args) {
        InnerNested a = new InnerNested();
        a.show();
        InnerNested.Mynested a1 = new InnerNested.Mynested();
        a1.nedtesShow();
        InnerNested.Myinner a2 = a.new Myinner();
        InnerNested.Myinner a3 = a.new Myinner();

    }
}
