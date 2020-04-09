import java.util.Scanner;
public class FindMaxElementInTwoDimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of rows: ");
        int row = scanner.nextInt();
        while (row < 1) {
            System.out.print("Try to enter proper amount of rows again: ");
            row = scanner.nextInt();
        }
        System.out.print("Enter amount of colums: ");
        int colum = scanner.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Supposing element [i][j] has the greatest value in the matrix");
        System.out.print("Enter i: ");
        int i = scanner.nextInt();
        System.out.print("Enter j: ");
        int j = scanner.nextInt();
        int initialElement = array[i][j];
        int maxElement=initialElement;
        System.out.println("The value of the initial element is " + maxElement);
        int k=0;
        for (int[] E : array) {
            for (int e : E) {
                if (e > initialElement) {
                    k++;
                    System.out.println("value "+e + " in the matrix is greater than or equal to initial value");
                }
                if(e>maxElement){
                    maxElement=e;
                }
            }
        }
        System.out.println("So, there are " + k+" value(s) in the matrix is greater than or equal to initial element");
        System.out.println("The greatest value in the matrix is " + maxElement);
    }

}
