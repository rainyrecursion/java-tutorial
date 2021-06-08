import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Random int: " + r.nextInt());
        System.out.println("Random int from 0 to 9: " + r.nextInt(10));
        // nextInt(bound) excludes bound; above line will never output 10
        System.out.println("Random int from 5 to 15: " + (r.nextInt(11) + 5));
        System.out.println("Random float: " + r.nextFloat());
        System.out.println("Random double: " + r.nextDouble());
        System.out.println("Random boolean: " + r.nextBoolean());
    }

}
