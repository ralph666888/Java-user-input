import javax.swing.*;
import java.util.*;
public class Test {
public static int sums(int i1,int i2){
    int a=0;
    for(int i=i1;i<i2;i++){
        a+=i;
    }
    return a;
}

    public static void main(String[] args) {
        System.out.println(sums(1,7));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.next(); //always put spaces

        System.out.print("Enter number of hours worked in a week:");
        int numberhour = input.nextInt();

        System.out.print("Enter hourly pay rate:");
        double hourrate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double without = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double withouthold = input.nextDouble();
        System.out.println("\n");
        System.out.println("Employee Name:" + name);
        System.out.println("Hours Worked:" + numberhour);
        System.out.println("Pay Rate:" + hourrate);

    }
}