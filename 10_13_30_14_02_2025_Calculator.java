import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Name:");
        String name = input.next();
        System.out.print("Matric Number");
        String matricNumber = input.next();
        System.out.print("Age: ");
        String age = input.next();
        System.out.print("Department: ");
        String department = input.next();
        System.out.print("Height");
        double height = input.nextDouble();

        System.out.print("Name: " + name +  "Matric Number: " + matricNumber  + "Age: " + age  +"Department: " + department);
    }
}