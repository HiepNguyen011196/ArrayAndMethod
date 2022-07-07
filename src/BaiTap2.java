import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input_number = scanner.nextInt();
        System.out.print("Enter the position:");
        int input_position = scanner.nextInt();

        if (input_position <= -1 || input_position > arr.length) {
            System.out.println("Position is not in the array");
        } else {
            arr[input_position] = input_number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
