public class deleteIndex {
    public static void deleteIndex(int arr[], int index){

        for (int i = index; i < arr.length-1; i++) { // هاد عشان اعمل ازاحة للارقام عشان احافظ على المصفوفة مرتبة
          arr[i]= arr[i + 1];
        }
        arr[arr.length-1] = 0; // هان بحط بآخر index صفر بس
    }

    public static void main(String[] args) {
        int m[] = {1, 3, 4, 5, 6};

        deleteIndex(m , 2);

        for (int i = 0; i < m.length; i++) { // عشان اطبع المصفوفة بس
            System.out.println(m[i]);
        }
    }

}

Output:

1
3
5
6
0
