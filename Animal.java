public class Animal {

    private String name;
    private int age;

    private String a;

    public void printName() {
        System.out.println("Name: " + name);
    }

    public Animal() {
        name = "Placeholder";
        age = 1;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(Animal myAnimal) {
        // this is called a copy constructor!
        name = myAnimal.name;
        age = myAnimal.age;
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
        this.age = age;
    }
}