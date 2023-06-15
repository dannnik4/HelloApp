public class ConsoleInOut {
    public static void main(String args[]) {
        System.out.println("Hello world!");
        System.out.println("Bye world...");

        System.out.print("Hello world!");
        System.out.print("Bye world...");

        System.out.print("\nHello world\n");

        int x = 5;
        int y = 6;
        System.out.println("x=" + x + "; y=" + y);

        System.out.printf("x=%d; y=%d \n", x, y);

        String name = "Tom";
        int age = 30;
        float height = 1.7f;

        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
    }
}
