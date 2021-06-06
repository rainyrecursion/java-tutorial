public class PetShop {
    public static void main(String[] args) {
        /* ---- Constructors ---- */
        Animal defaultAnimal = new Animal();
        Animal myGoldfish = new Animal("Timmy the Goldfish", 3);
        Animal yourGoldfish = new Animal(myGoldfish);

        // System.out.println(defaultAnimal.name);  // has error, because name is private
        System.out.println(defaultAnimal.getName());  // outputs "Placeholder"
        defaultAnimal.setName("Timmy the Goldfish");
        System.out.println(defaultAnimal.getName());  // outputs "Timmy the Goldfish"

        /* ---- Getters and Setters ---- */
        Animal dogA = new Animal("Doggy", 5);
        Animal dogB = new Animal(dogA);
        Animal dogC = dogA;

        System.out.println(dogA.getAge());  // 5
        System.out.println(dogB.getAge());  // 5
        System.out.println(dogC.getAge());  // 5

        dogA.setAge(100);
        System.out.println(dogA.getAge());  // 100
        System.out.println(dogB.getAge());  // 5
        System.out.println(dogC.getAge());  // 100
    }
}
