import java.util.Scanner;
public class SecondLargest {

        static Scanner sc = new Scanner(System.in);
        
        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i]= sc.nextInt();
                }
                return arr;
        }

        public static void secondLargest(int[] arr){
                int large1=Integer.MIN_VALUE;
                int large2=Integer.MIN_VALUE;
                for(int i=0; i<arr.length; i++){
                        if(arr[i] > large1){
                                large2 = large1;
                                large1 = arr[i];
                        }
                        else if(arr[i] > large2 /*&& arr[i] != large1*/){
                                large2 = arr[i];
                        }
                }
                System.out.println(large2);
        }
        // TODO: Read N
        // TODO: Read array elements
        // TODO: Find and print the second largest element
        // Hint: You can do this in a single pass or two passes without sorting.
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] arr = arrInput(n);
                secondLargest(arr);
        }
}
