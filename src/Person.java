//Inheritance Tree starting from a generic Person
public abstract class Person {
    // You cannot create the objects of abstract class
    //the objects can be distinguished through the help of 'THIS' keyword
    private String name;
    private int age;
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() { return age;}
    public void setAge(int age) {
        this.age = age;
    }
}