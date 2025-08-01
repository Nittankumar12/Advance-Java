package nittan.oops.inheritance;

public class Beings {
    int id;
    private String livingName;
    protected boolean canEat;

//
    public Beings(int id, String livingName,boolean canEat) {
        this.id = id;
        this.livingName = livingName;
        this.canEat = canEat;
        System.out.println("LivingBeings all args constructor and it is public");
    }
    protected Beings() {
        System.out.println(" protected: LivingBeings No args constructor");
    }
    private Beings(String livingName) {
        this.livingName = livingName;
        System.out.println("private: LivingBeings livingname constructor");
    }

    private void privateMethod(){
        System.out.println("private: private method of Livingbeings");
    }
    public void publicMethod(){
        System.out.println("public: public method of Livingbeings");
    }
    protected void protectedMethod(){
        System.out.println("protected: protected method of Livingbeings");
    }
    protected void protectedMethodBeing(){
        System.out.println("protected method of Beings");
    }

    public static void staticFinalMethod(){
        System.out.println("static final: of living beings");
    }
    public void greeting(){
        System.out.println("greeting");
    }

     class Birds extends Beings{
        int population;
        public void pop(){
            System.out.println("their total population");
        }
//        Beings beings = new Beings();
//        beings.publicMethod();
        @Override
        public void publicMethod(){
            System.out.println("public method is overriden in inner class bird");
        }
        @Override
        protected void protectedMethod(){
            System.out.println("protected method is overrident in inner class bird");
        }
    }
}
