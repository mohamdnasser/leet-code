package removeDuplications;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args){

        int arr[] = { 0,0,1,1,1,2,2,3,3,4} ;
        removeDuplicates(arr);

        for (int a: arr){
            System.out.println(a);
        }
    }
        static int removeDuplicates(int nums[]) {
            int index=1;
            for(int i=0; i < nums.length -1 ;i++)
                if(nums[i] != nums[i+1])
                    nums[index++]= nums[i+1];

            return index;

        }
    }



