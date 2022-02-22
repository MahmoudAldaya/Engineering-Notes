public class delete {
    public static void deleteValue(int arr[], int value) {
        int i; // هاد المتغير عشان احفظ  فيه index الرقم الي بدي احذفه

        for (i = 0; i < arr.length - 1; i++) { // من هان بحصل على ال index
            if (arr[i] == value)
                break;
        }
        for (int j = i; j < arr.length-1; j++) { // هاد عشان اعمل ازاحة للارقام عشان احافظ على المصفوفة مرتبة
            arr[j] = arr[j + 1];
        }
        arr[arr.length-1] = 0; // هان بحط بآخر index صفر بس
    }

    public static void main(String[] args) {
        int m[] = {1, 3, 4, 5, 6};

        deleteValue(m , 2);

        for (int i = 0; i < m.length; i++) { // عشان اطبع المصفوفة بس
            System.out.println(m[i]);
        }
    }
}

Output:

1
3
4
5
0

