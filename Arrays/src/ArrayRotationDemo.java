class RotateArray
{
    public void rotate(int[] nums, int k)
    {
        if(k > nums.length)
            k=k%nums.length; // nums - 5 and k -7 ==> 7%5 = 2; K's Value is 2 instead of 7
        int[] result = new int[nums.length];
        for(int i=0; i <k ;i++)
        {
            result[i]=nums[nums.length-k+i]; // result[0]=nums[7-5+0]=3 / result[1]=nums[7-5+1]=4
            //Data for result[0], result[1], result[2], result[3], result[4]
        }
        int j=0;
        for(int i=k; i<nums.length;i++)
        {
            result[i]=nums[j];
            j++;
            //Data for result[5] and result[6]
        }
        System.arraycopy(result,0,nums,0,nums.length);
    }
}
public class ArrayRotationDemo {
    //Input Array: nums={1,2,3,4,5,6,7}; k=5
    //Input Array: nums={1,2,3,4,5,6,7,8,9,10}; k=9 ==> result={2,3,4,5,6,7,8,9,10,1}
    //Input Array: nums={1,2,3,4,5,6,7,8,9,10}; k=7 ==> result={4,5,6,7,8,9,10,1,2,3}
    //Input Array: nums={1,2,3,4,5,6,7,8,9,10}; k=3 ==> result={8,9,10,1,2,3,4,5,6,7}
    //Output Array: {3,4,5,6,7,1,2,}
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        r.rotate(arr, 3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
