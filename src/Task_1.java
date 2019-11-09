import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        byte age = Byte.parseByte(input.nextLine());
        float grade = Float.parseFloat(input.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
                                             }
                    }
