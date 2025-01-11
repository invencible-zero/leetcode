package topics.heap;

import java.util.*;
//https://leetcode.com/problems/kth-largest-element-in-an-array/description/?envType=problem-list-v2&envId=sorting
public class KthLargestElementHeap {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        Integer min = 0;

        for (int num : nums) {
                maxpq.offer(num);
        }
        for (int i = 0; i < k; i++) {
            min = maxpq.poll();
        }
        return min;
    }



    public static void print(Object message) {
        if(print)
        System.out.println(message);
    }
    public static boolean print = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: comma-separated string for the array
        //System.out.print("Enter a comma-separated list of numbers: ");
        String input = scanner.nextLine();

        // Split the input string into an array of integers
        String[] inputArray = input.split(",");
        int[] nums = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i].trim()); // Convert to int and trim whitespace
        }

        // Input: value of k
        //System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Create an instance of KthLargestElementHeap and find the kth largest element
        KthLargestElementHeap kthLargestElement = new KthLargestElementHeap();
        int result = kthLargestElement.findKthLargest(nums, k);

        // Output the result
        System.out.println("The " + k + "th largest element is: " + result);

        scanner.close();
    }
}
