package com.nittan.oops.classesAndObjects;

import java.sql.Wrapper;

public class WrapperExample {
    int a;

    Integer num;

    WrapperExample(int a){
        System.out.println("Called primitive one");
        this.a = a;
    }
    WrapperExample(Integer a){
        System.out.println("Called wrapper constructor");
        this.a = a;
    }
    WrapperExample(){
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
        super.finalize();
    }
}
