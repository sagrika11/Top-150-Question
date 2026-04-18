import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesII {
    public static void main(String[]args){
        int[]arr = {1,1,1,2,2,3};
        int [] ans = removeDuplicated2(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] removeDuplicated2(int[]arr, int n){
        int count=2;
        for(int i =2;i<n;i++){
            if(arr[i]!=arr[count-2]){
                arr[count++]=arr[i];
            }
        }
        return arr;
    }
}
