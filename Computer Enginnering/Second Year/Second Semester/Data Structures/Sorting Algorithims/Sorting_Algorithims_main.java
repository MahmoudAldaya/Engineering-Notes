public class Sorting_Algorithims {

    public static void main(String[] args) {
        int arr [] = {100, 5, 10, 20, 47, 60, 50, 200};
        
        
      int b [] =  bubble_sort(arr);
      int i [] =  insertion_sort(arr);
      int s [] =  selection_sort(arr);
      
        
        System.out.println("---------------------bubble sort-----------------------");
        print_array(b);
        System.out.println("---------------------insertion sort--------------------");
        print_array(i);
        System.out.println("---------------------selection sort--------------------");
        print_array(s);
   
    }

    public static int[] bubble_sort(int arr[]){
        int temp =0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j < arr.length-i ; j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int[] selection_sort(int arr[]){
        for(int i =0; i< (arr.length)-1; i++){
            int min = i;
            for(int j=i+1; j< arr.length; j++){
                min = j;
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    
    public static int[] insertion_sort (int arr[]){
        for(int i = 1; i < arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    
    
    public static void print_array (int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

Output:
run:
---------------------bubble sort-----------------------
200
100
60
50
47
20
10
5
---------------------insertion sort--------------------
200
100
60
50
47
20
10
5
---------------------selection sort--------------------
200
100
60
50
47
20
10
5
BUILD SUCCESSFUL (total time: 0 seconds)
