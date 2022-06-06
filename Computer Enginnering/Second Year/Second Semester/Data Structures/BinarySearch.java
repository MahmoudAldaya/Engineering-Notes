public class binarySearch {

    public static int binarySearch1 (int arr[], int value){ // Using loop to return index of an item
        int Low = 0, High = arr.length;
        while (Low <= High) {
            int Mid = (Low + High)/2;
            if (arr[Mid] == value)
                return Mid;
            else if (arr[Mid] < value)
                Low = Mid + 1;
            else if (arr[Mid] > value)
                High = Mid - 1;
        }
        return -1;
    }

    public static int binarySearch2 (int arr[], int value, int Low, int High){ // Using Recursion to return the index of an item
        int mid = (Low + High)/2;
        while (Low <= High) {
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value)
                return binarySearch2 (arr,value,mid + 1, High);
            else if (arr[mid] > value)
                return binarySearch2 (arr,value, Low,mid - 1);
        }
        return -1;
    }

  
    public static void main(String[] args) {
        int data [] = {2, 3, 10, 20, 70, 100};
        System.out.println(binarySearch1(data, 54));
        System.out.println(binarySearch2(data, 3, 0, 5));
    }
}

Output: 
-1
1
