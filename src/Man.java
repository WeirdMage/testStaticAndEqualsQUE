public class Man {

    private String name;
    private int age;

    public Man (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Man(Man man) {
        this.name = man.name;
        this.age = man.age;
    }
    public String getAsString(){
        return "Man{"  +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean myEquals(Man man) {
        return age == man.age && name.equals(man.name);
    }
}
