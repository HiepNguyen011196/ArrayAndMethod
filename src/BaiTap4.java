import java.util.Arrays;
import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        int [][] arr = new int[3][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter value");
                arr[i][j] = scanner.nextInt();;
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(Arrays.deepToString(arr));
    }
}
