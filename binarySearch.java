// Java implementation of recursive Binary Search
class BinarySearch
{
    //TODO: implement binarySearch function
   int binarySearch(int my_arr[], int left, int right, int x){
      if (right >= left){
         int mid = left + (right - left) / 2;
         if (my_arr[mid] == x)
         return mid;
         if (my_arr[mid] > x)
         return rec_bin_search(my_arr, left, mid - 1, x);
         return rec_bin_search(my_arr, mid + 1, right, x);
      }
      return -1;
   }
  
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                                                 result);
    }
}
