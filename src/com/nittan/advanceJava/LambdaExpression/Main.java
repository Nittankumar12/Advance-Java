package com.nittan.advanceJava.LambdaExpression;


// we use lambda experssion with functional interfaces
@FunctionalInterface
interface A{
//    void show();
//    void show (int i,int j);
    int add(int i, int j);
}



public class Main {
    public static void main(String[] args) {


//        A obj = new A() {
//            @Override
//            public void show() {
//                System.out.println(" in show");
//            }
//        };
//        we can simplify this code by using lambda expression

//        A obj = () -> {
//            System.out.println(" in show by using lambda expression");
//        };

//        A obj = () -> System.out.println(" in show by using lambda expression");
//        obj.show();

//        A obj = new A() {
//            @Override
//            public void show(int i, int j) {
//                System.out.println("values are: " + i + " " + j);
//            }
//        };

//        A obj = (int i,int j) -> System.out.println("values are: " + i + " " + j);
//        A obj = ( i, j) -> System.out.println("values are: " + i + " " + j);
//        obj.show(5,6);


        // returning values
//        A obj = new A(){
//          public int add(int i, int j){
//              return i+j;
//          }
//        };

        // by using lambda expression
        A obj = (i,j) ->  i+j;
        System.out.println(obj.add(5,6));
    }
}
