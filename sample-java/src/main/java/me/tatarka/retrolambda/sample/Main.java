package me.tatarka.retrolambda.sample;

/**
 * Created by evan on 3/29/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getHello().run());

        Function mFunction=  getHello();
        System.out.println(mFunction);
        System.out.println(mFunction.run());
    }


//    省去new的过程 直接返回
    public static Function getHello() {
        return () -> "Hello, retrolambda!";
    }


}
