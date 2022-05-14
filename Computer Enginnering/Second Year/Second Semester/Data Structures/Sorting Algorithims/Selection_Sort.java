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
