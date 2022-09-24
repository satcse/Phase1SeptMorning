public class ArraysDemo {

    public static void main(String[] args) {
        //Single-Dimensional Array
        int[] a={10,20,30,40,50};
        for(int i=0;i<5;i++)
        {
            System.out.println("Elements of array: "+a[i]);
        }

        //Multi-Dimensional Array
        int[][] b={
                {2,4,6,8},
                {3,6,9}};
            System.out.println("Length of Row 1: "+b[0].length);
            System.out.println("Length of Row 2: "+b[1].length);
            System.out.println("Data in b[1][2] is: "+b[1][2]);
        }
    }

