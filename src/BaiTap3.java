import java.sql.Array;
import java.util.Arrays;

public class BaiTap3 {
    public static void main(String[] args) {
        int [] arr1 = new int[4];
        int [] arr2 = new int[3];
        int [] arr3 = new int[arr1.length + arr2.length];
        int add1 = 1;
        int add2 = 2;
        //Add values to arr1
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += add1;
            add1 += 1;
        }
        //Add values to arr2
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] += add2;
            add2 += 2;
        }
        //Combines arr1 and arr2 to make arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr2.length + j + 1] = arr2[j];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
