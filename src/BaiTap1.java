import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input_number = scanner.nextInt();

        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input_number) {
                System.out.println("Position of the number " + input_number + "in the array is: " + i);
                isExist = true;
                int index = i;
                for (; index < arr.length - 1; index++) {
                    int middle = arr[index];
                    arr[index] = arr[index + 1];
                    arr[arr.length - 1] = 0;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        if (!isExist) {
            System.out.println(input_number + " is not in the array");
        }
    }
}
