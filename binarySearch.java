// Java implementation of recursive Binary Search
class BinarySearch
{
    //updated by kamrul
    int variableName = 48
    
    int binarySearch(int arr[], int x)
    {
 	//this is a edit from kamrul
        int l = 0, r = arr.length - 1;
 
        // Checking element in whole array
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller,
            // element is on left side
            // so ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here,
        // element is not present
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
