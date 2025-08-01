package nittan.oops.abstraction;

public class Girl extends Human {

    public Girl(){
    }
    Girl(int a) {
        super(a);
    }

    @Override
    void career(){
        System.out.println("career of girl");
    }

    @Override
    void goal() {
        System.out.println("goal of girl");
    }

    void normalMethod(){
        System.out.println("normalMethod of girl");
    }
    static void normalStaticMethod(){
        System.out.println("normalStaticMethod of girl");
    }
}
