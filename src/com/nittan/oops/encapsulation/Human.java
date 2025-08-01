package nittan.oops.encapsulation;

public class Human {
    private String name;
    private int age;

    public Human() {}
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(!isValidAge(age)){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    // this method is also encapsulation and cannot be directly accessible to the users
    private boolean isValidAge(int age) {
        if(age < 0 || age > 100){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
