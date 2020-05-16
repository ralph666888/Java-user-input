import com.sun.org.apache.xerces.internal.xinclude.XPointerElementHandler;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TestLocation {
    public static Location locateLargest(double[][] a) {
        int x=0;
        int y=0;
        double value = 0;
        Location current = new Location();
        current.Array = a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > value) {
                    value = a[i][j];
                    x=i;
                    y=j;

                }
            }
        }
        current.row = a.length;
        current.column = a[0].length;
        current.Maximun = value;
        current.i=x;
        current.j=y;

        return current;
    }

    public static void main(String[] args) {

        int row;
        int column;
        System.out.print("Enter the number of rows and columns in the array:");
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        column = input.nextInt();
        System.out.println("Enter the array:");
        double[][] TestArray = new double[row][column];
        for (int i = 0; i < TestArray.length; i++) {
            for (int j = 0; j < TestArray[i].length; j++) {
                TestArray[i][j] = input.nextDouble();


            }
        }
        System.out.println("The location of the largest element is "+ locateLargest(TestArray).Maximun +' '+ "at" +"(" +locateLargest(TestArray).i  + ", " + locateLargest(TestArray).j  + ")" );

    }
}
