import java.util.Scanner;

public class LinearSearchDemo {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int searchValue = sc.nextInt();
        int result = linearing(arr, searchValue);
        if(result==-1)
        {
            System.out.println("Element was not in the array");
        }else
        {
            System.out.println("Element found at "+result);
        }
    }

    public static int linearing(int arr[], int x)
    {
        int arrlength = arr.length;
        for(int i=0; i <=arrlength - 1; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
}
