public class BinarySearchDemo {

    public static void main(String[] args) {

        int[] arr={3,6,9,12,15};
        int key = 12;
        int arrlength=arr.length;
        binarySearch(arr,0,key, arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length)
    {
        int midValue = (start+length)/2;
        while(start<=length)
        {
            if(arr[midValue] < key) // Go to right half of the array
            {
                start = midValue + 1;
            }else if(arr[midValue]==key) // Match the element with key
            {
                System.out.println("Element  is found at index: "+midValue);
                break;
            }else // Go to Left half of the array
            {
                length = midValue-1;
            }
            midValue=(start+length)/2;
        }
        if(start > length)
            System.out.println("Element not found!");
    }
}
