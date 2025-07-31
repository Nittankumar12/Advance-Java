package nittan.oops.innerClasses;

public class InnerClassExample {
    class InnerClass{
        int a;
        private int b;
        public static int c = 10;

        InnerClass(int a, int b){
            this.a = a;
            this.b = b;
        }
        public int getSum(){
            return a+b;
        }
        static void staticMethod(){
            System.out.println("staticMethod of inner class 1");
        }
        static{
            System.out.println("static block of inner class 2");
        }

    }
    static class InnerClass2{
        private int num1;
        public static int num2 = 16;

        public void getNum1(){
            System.out.println("got number");
        }
        static void getSum(){
//            System.out.println("sum is: " + (num1 + num2)); // we cannot access num1 because it is not static
            System.out.println("sum of a and c is: " + (num2 + InnerClass.c));
        }
        static void staticMethod(){
            System.out.println("staticMethod of inner class 2");
        }
    }
}

