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
