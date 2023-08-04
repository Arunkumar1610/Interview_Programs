package interview_Programs;

public class L_M_value_in_arr {


    // Naive solution to find the minimum and maximum number in an array
    public static void findMinAndMax(int[] nums)
    {
        // initialize minimum and maximum element with the first element
        int max = nums[0];
        int min = nums[0];
 
        // do for each array element
        for (int i = 0; i < nums.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (nums[i] > max) {
                max = nums[i];
            }
 
            // if the current element is smaller than the minimum found so far
            else if (nums[i] < min) {
                min = nums[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
 
    public static void main(String[] args)
    {
        int[] nums = { 9,5, 7, 2, 4, 6 ,10,1};
        
        System.out.println(nums[1]);
 
        // find the minimum and maximum element, respectively
        findMinAndMax(nums);
    }

}
