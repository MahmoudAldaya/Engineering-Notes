public void insertValue(int[] arr, int value, int index){
for(int i = arr.length -1 ; i > index ; i--)
arr[i] = arr[i-1]
arr[index] = value;
