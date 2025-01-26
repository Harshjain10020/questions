
public class arrays {
//second largest 
    // public int getSecondLargest(int[] arr) {
    //     // Code Here
    //     int n = arr.length;
    //     int large = Integer.MIN_VALUE;
    //     int slarge = Integer.MIN_VALUE;
        
    //     if(n<2) return -1;
        
    //     for(int i = 0; i < n; i++){
    //         if(arr[i] > large){
    //             slarge = large;
    //             large = arr[i];
    //         }else if(arr[i]< large && slarge < arr[i]){
    //             slarge = arr[i];
    //         }
            
    //     }
    //     if(slarge == Integer.MIN_VALUE) return -1;
    //     return slarge;
    // }


    // // Move All Zeroes to End
    // void pushZerosToEnd(int[] arr) {
    //     // code here
    //     int n = arr.length;
    //     int j = 0;
        
    //     for(int i = 0; i < n ; i++){
    //         if(arr[i]!=0){
    //             arr[j] = arr[i];
    //             j++;
    //         }
    //     }
        
    //     while(j < n){
    //         arr[j] = 0;
    //         j++;
    //     }
    // }

    // //Reverse an Array

    // public void reverseArray(int arr[]) {
    //     // code here
    //     int i = 0;
    //     int n = arr.length;
    //     int j = n-1;
        
    //     while(i<j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
    //     }
    // }

    // //rotate arr by d 
    // static void rotateArr(int[] arr, int d) {
    //     int n = arr.length;

    //     // Handle case when d > n
    //     d %= n;
        
    //     // Storing rotated version of array
    //     int[] temp = new int[n];

    //     // Copy last n - d elements to the front of temp
    //     for (int i = 0; i < n - d; i++)
    //         temp[i] = arr[d + i];

    //     // Copy the first d elements to the back of temp
    //     for (int i = 0; i < d; i++)
    //         temp[n - d + i] = arr[i];

    //     // Copying the elements of temp in arr
    //     // to get the final rotated array
    //     for (int i = 0; i < n; i++)
    //         arr[i] = temp[i];
    // }
    // //or 
    // static void rotateArr(int[] arr, int d) {
    //     int n = arr.length;

    //     // Handle the case where d > size of array
    //     d %= n;

    //     // Reverse the first d elements
    //     reverse(arr, 0, d - 1);

    //     // Reverse the remaining n-d elements
    //     reverse(arr, d, n - 1);

    //     // Reverse the entire array
    //     reverse(arr, 0, n - 1);
    // }

}