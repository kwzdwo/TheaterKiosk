import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter your age: ");
        age = console.nextInt();

        if (age >= 21) {
            System.out.println("You get a wristband!!");
        } else {
            System.out.println("No wristband, sorry. Leave. Age entered: " + age);
        }
    }
}
