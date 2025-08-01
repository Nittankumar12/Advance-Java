package nittan.oops.access;

public class A {

    private int a;
    public int b;
    public static int c;
    public static final int SIZE = 13;

    int d;
    protected int e;

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }

    public A(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        A.c = c;
        this.d = d;
        this.e = e;
    }
    private A(){

    }
    protected void protectedMethod(){
        System.out.println("it is protected method of A class");
    }
    private void privateMethod(){
        System.out.println("it is private method of A class");
    }
    public void publicMethod(){
        System.out.println("it is public method of A class");
    }
    protected A(int a){
        this.a = a;
        System.out.println("parent class constructor with param a ");
    }

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }
    public int getE(){
        return e;
    }
}
