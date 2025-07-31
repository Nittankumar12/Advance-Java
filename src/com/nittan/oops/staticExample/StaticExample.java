package nittan.oops.staticExample;

public class StaticExample {
    static int num;
    static String text;
    public static final String name = "Nittan Kumar";
    private static final int a = 11;
    public static int b;

    StaticExample(int a, int b) {
//        StaticExample.a = a;  // we cannot assign it, but if want more info check final class example
        StaticExample.b = b;
    }


//    StaticExample(String name){

    /// /        StaticExample.name = name; // we cannot assign anything because this variable is final
//    }

    StaticExample() {
//        this.num = 1;  // although it will work, but we should not write this because
        // static have no connection with the object and this operator is used for the objects
        StaticExample.num = 1;
        StaticExample.text = "Nittan";
    }

    static {
        System.out.println("Static Example Initialized");
        System.out.println(StaticExample.getText());
    }
//
//    private static String getText(){
//        // this can only be used by this Static EXample class only
//        return StaticExample.text;
//    }

    public static String getText() {
        // this method runs through class because its access modifier is public and can be accessed through class
        return StaticExample.text;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
