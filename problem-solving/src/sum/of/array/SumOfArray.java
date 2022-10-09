package sum.of.array;

public class SumOfArray {
    public static void main(String[] args)
    {
        SumOfArray obj = new SumOfArray();
        int arr[] = {1,2,3,4,5};
        int result[] = runningSum(arr);
        for (int i=0 ; i<result.length;i++){
            System.out.println(result[i]);
        }

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] + sum;
            sum = nums[i];
        }
        return nums;
    }
}
