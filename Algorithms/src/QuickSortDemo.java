public class QuickSortDemo {

    public static void main(String[] args) {
        int arr[]={10,7,8,9,1,5,2,3,99};
        int n=arr.length;

        QuickSortDemo ob = new QuickSortDemo();
        ob.sort(arr,0,n-1);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void sort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low, high);

            sort(arr, low,pi-1);
            sort(arr, pi+1, high);
            printArray(arr);
        }
    }

    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; //Last Element in the array as Pivot
        int i=(low-1);
        for(int j=low;j < high; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;

                //Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //Swap arr[i+1] and arr[high]/Pivot
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=temp;

        return i+1;
    }
}
