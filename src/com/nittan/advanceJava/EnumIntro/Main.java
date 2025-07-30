package com.nittan.advanceJava.EnumIntro;

enum Status{
    Running,Doing,Going,Compiling;
}
public class Main {
    public static void main(String[] args) {

        Status s = Status.Compiling;
        System.out.println(s);

        Status s2 = Status.Doing;
        System.out.println(s2);
        int index = s2.ordinal();
        System.out.println(index);

        for(Status status: Status.values()){
            System.out.println(status.ordinal() + " " + status);
        }

        // enum if and switch

        if(s == Status.Running){
            System.out.println("its running");
        }
        else if(s == Status.Doing){
            System.out.println("its doing");
        }
        else if(s == Status.Going){
            System.out.println("its going");
        }
        else if(s == Status.Compiling){
            System.out.println("its compiling");
        }
        else System.out.println("done");

        switch(s){
            case Running:
                System.out.println("running");
                break;
            case Doing:
                System.out.println("doing");
                break;
            default:
                System.out.println("no idea");
        }
    }
}
