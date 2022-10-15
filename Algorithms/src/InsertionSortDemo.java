public class InsertionSortDemo {

    public static void main(String[] args) {

        int[] arr = {25,20,15,5,10};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int[] arr)
    {
        int len = arr.length;
        for(int j=1;j<len;j++)
        {
            int key=arr[j];
            int i=j-1;
            while((i>-1) && (arr[i]>key))
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
            for(int it=0;it<arr.length;it++)
            {
                System.out.print(arr[it]+" ");
            }
            System.out.println();

        }
    }
}
