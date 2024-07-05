import java.util.Random;

class Rand {
    public static void main(String[] args) {

        Random rand = new Random();

        int num = rand.nextInt(-10, 10 );

        System.out.println(num);
    }
}
