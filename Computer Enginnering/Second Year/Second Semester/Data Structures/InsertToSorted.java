public class insertToSorted {
    static void insert(int arr[], int element) {

        int i; // هاد المتغير عشان احفظ  فيه index الرقم الي بدي احذفه
        for (i = 0; i < arr.length; i++) { // من هان بحصل على ال index
            if (arr[i] > element)
                break;
        }
        for (int j = arr.length - 1; j > i;  j--) { // هاد عشان اعمل ازاحة للارقام عشان احافظ على المصفوفة مرتبة
            arr[j] = arr[j - 1];
        }
        arr[i] = element; // هان بحط الرقم الجديد بال index
    }

    public static void main(String[] args) {
        int m[] = {1, 3, 4, 5, 0};

        insert(m , 2);

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
