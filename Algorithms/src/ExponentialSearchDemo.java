import java.util.Arrays;

public class ExponentialSearchDemo {
    public static void main(String[] args) {

        int arr[]={6,12,18,24,32};
        int length = arr.length;
        int value = 4154;
        int result = exponentialSearch(arr, length, value);
        if(result < 0)
        {
            System.out.println("Element was not in the array");
        }else
        {
            System.out.println("Element found at "+result);
        }
    }

    public static int exponentialSearch(int[] arr, int length, int value)
    {
        if(arr[0]==value)
        {
            return 0;
        }
        int i=1;
        while(i< length && arr[i]<=value)
        {
            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value); // 1 to 2-> 2 to 4-> 4 to 8->8 to 16->
        // 16 to 16
    }
}
