package nittan.oops.staticExample;

public final class FinalExample {
    int a;
    static int b;
    public static final int c = 10;
    public FinalExample(int a, int b, int c) {
        this.a = a;
        FinalExample.b = b;
    }

    public final  int getA(){
        System.out.println("called final method and getting a");
        return a;
    }

}

// cannot inherit from final class because final methods dont overriden as well as no final class can be inhetited
//class FinalExample1 extends  FinalExample{
//
//}
