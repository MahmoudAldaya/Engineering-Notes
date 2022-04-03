public class myStack {
        int [] arr;
        int top;
        int capacity;

    public myStack(int size) {
        arr = new int[size];
        top = -1;
        capacity = 0;
    }

    public void push(int item) { // اضافة قيمة جديدة للستاك
        if (!IsFull()) {
            top++;
            arr[top] = item;
            capacity++;
        } else
            System.out.println("The stack is full!!");
    }

    public boolean IsEmpty(){ // لفحص هل الستاك فارغ ام لا
        return (top == -1);

    }

    public boolean IsFull(){ // لفحص هل الستاك ممتلئ ام لا
        return capacity == arr.length;
    }

    public int pop(){ // تحذف آخر قيمة اضيفت للستاك
     int item = 0;
     if (IsEmpty())
         System.out.println("stack is empty");
     else{
         item = arr[top--];
     }
         return item;
    }

    public void top(){ // بترجع آخر قيمة أضيفت للستاك
        System.out.println(top);
    }

    public int size(){ // حجم الستاك
        return capacity;
    }

    public void print(){ // لطباعة قيم الستاك
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
