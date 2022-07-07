import java.util.Scanner;

public class BaiTap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int input = scanner.nextInt();
        int [] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter values of array");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}

