package Practice;

/* This function searches for item from an array
   returns the index of item if found ,
   returns -1 if item is not found.*/
public class BinarySearchUsingRecursion {
    public int binarySearch(int[] arr, int l, int h, int key){
        if (l > h){
            return -1;
        }
        int mid = (l + h) / 2;

        if(key == arr[mid]){
            return mid;
        }
        else if(key > arr[mid]){
            return binarySearch(arr, mid + 1, h, key);
        }
        else{
            return binarySearch(arr, l, mid - 1, key);
        }
    }

    public static void main(String[] args) {
        int[] array = {21, 34, 56, 44, 67, 89, 91};

        BinarySearchUsingRecursion search = new BinarySearchUsingRecursion();

        System.out.println(search.binarySearch(array, 0, 6, 89 ));
    }
}
