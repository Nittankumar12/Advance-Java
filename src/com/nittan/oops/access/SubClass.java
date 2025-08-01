package nittan.oops.access;

public class SubClass extends A{

    private static int number = 15;

    public SubClass(int a, int b, int c, int d, int e) {
        super(a, b, c, d, e);
    }
//    public SubClass() {
//        super(); // we cannot call this constructor of A because it is private in  A (parent  class)
//    }

    public SubClass(int a){
        super(a);   // we can do this because this time it is protected in its parent class ( A )
        System.out.println("SubClass Constructor with parameter a");
    }



    public int gettA(){
        return getA();  // calling public method of its parent class
    }

     protected void protMethod(){
        System.out.println("it is protected method of SubClass class");
    }
    private void priMethod(){
        System.out.println("it is private method of Subclass class");
    }
    public void pubMethod(){
        System.out.println("it is public method of Subclass class");
    }

    @Override
    // we can't make it private because it should be less or equal restrictive than its parent class
    // we can make this public or protected but not default or private
    protected void protectedMethod(){
        System.out.println("it is protected method overriden in child class");
    }

    // private methods cannot be overriden
//    @Override
//    private void privateMethod(){
//        System.out.println("it is private method of A class");
//    }

    @Override
    // while overriding the methods make sure that current method are less restrictive or equal restrictive
    // after overriding
//    protected void publicMethod(){ // can't use this because it is public in its parent class
    public void publicMethod(){
        System.out.println("it is public method of subclass which is overriden in child class");
    }

    public static class InnerClass{
        static{
            System.out.println("Inner Class static block can access private of its outer class " + number);
        }
        public static void printNumber(){
            System.out.println(number);
        }
    }


}
