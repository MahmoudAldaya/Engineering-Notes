public class InsertWithIndex {
    public static void InsertIndex(int arr[], int index, int value){
        for (int i = arr.length-1; i > index ; i--) { // هاد عشان اعمل ازاحة للارقام عشان احافظ على المصفوفة مرتبة
            arr[i]= arr[i -1];
        }
        arr[index]= value; // هان بحط الرقم الجديد بال index
    }

    public static void main(String[] args) {
        int m[] = {1, 3, 4, 5, 0};

        InsertIndex(m, 1, 2);

        for (int i = 0; i < m.length; i++) { // عشان اطبع المصفوفة بس
            System.out.println(m[i]);
        }
    }
}

Output:

1
2
3
4
5
