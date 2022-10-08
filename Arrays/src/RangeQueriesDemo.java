public class RangeQueriesDemo {

    private static void rangequerycalc(int input[], int rangeStart, int rangeEnd) {

        int result=0;
        if(rangeStart >= input.length || rangeEnd>=input.length)
            throw new ArrayIndexOutOfBoundsException("Range is Out of Array Bounds!");

        for(int i=rangeStart; i <=rangeEnd; i++)
        {
            result=result+input[i]; // 0=> 0+5=5 ==> 5+8=13 ==> 13+9=22
        }
        System.out.println("The Range Query Ouput is: "+result);
    }

    public static void main(String[] args) {
        int input[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int rangeStart = 2, rangeEnd = 5;
        rangequerycalc(input, rangeStart, rangeEnd);
    }


    //Input: arr={3,7,2,5,8,9}; Output=(0,5)==> 3+7+2+5+8+9=34
    //Input: arr={3,7,2,5,8,9}; Output=(3,5)==> 5+8+9=22
    //Input: arr={3,7,2,5,8,9}; Output=(2,4)==> 2+5+8=15
    //Input: arr={3,7,2,5,8,9}; Output=(1,3)==> 7+2+5=14
}
