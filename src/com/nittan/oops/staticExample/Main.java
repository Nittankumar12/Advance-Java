package nittan.oops.staticExample;

// we can also directly import it or we can use class name to call it.
import static nittan.oops.staticExample.StaticExample.text;

public class Main {
    public static void main(String[] args) {
        System.out.println("I got into the class");
//        int a = 10;
//        int b = 6;
//        System.out.println(a+b);
//        StaticExample obj = new StaticExample();
        // when this above obj created the assignment to text is done "nittan"
        // one string stored in string pool

        // we dont need object to call the static varaiables
//        System.out.println("Going to acces the static variable");
        // when ever it goes to access something from class, static block intialized
//        System.out.println(StaticExample.num);
//
//        text= "Rahul";
        // when text is assign rahul, "rahul" is checked in string pool
        // if "rahul" is in string pool, then it directly point to it else new
        // string "rahul" is created in string pool
//        System.out.println(text);

        // call static method
//        int num = StaticExample.num;
//        System.out.println(StaticExample.getText());
//
//        // getting name which is final and static as well
//        System.out.println(StaticExample.name);
//
//        StaticExample finalExample = new StaticExample(10,29);
//        System.out.println(StaticExample.b + " " +  finalExample.b);

//        FinalExample f1 = new FinalExample(12,2,23);
//        System.out.println(f1.a +  " " + f1.b + " " + FinalExample.b + " " + FinalExample.c);
//
//        System.out.println(f1.getA());

    }
}
