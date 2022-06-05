public class queue {
    private int front, rear, nElements, capacity;
    private int data[];

    public queue(int capacity) {
        this.front = 0;
        this.rear = -1;
        this.nElements = 0;
        this.capacity = capacity;
        this.data = new int [capacity];
    }

    public void enqueue (int item){ // اضافة قيمة للطابور
        if (isFull()){
            System.out.println("queue is full!");
        }
        else{
            rear++;
            data[rear] = item;
            nElements++; // هاد متغير بحفظ فيه عدد العناصر، فعند كل عملية اضافة بزوده بواحد، وعند كل عملية حذف بنقصه بواحد
        }
    }

    public int dequeue() { // حذف قيمة من الطابور
        int temp = -1;
        if (isEmpty()) // اذا كان الطابور فارغ
            System.out.println("the queue is empty!");
        else if (rear == front) { // اذا كان الطابور يحتوي على عنصر واحد فقط
            temp = data[front];
            rear = -1;
            front = 0;
            nElements--;
        }
        else { // اذا كان الطابور يحتوي على عدة عناصر
            temp = data[front];
            front++;
            nElements--;
        }
        return temp;
    }

    public boolean isFull(){ //  بترجع قيمة true اذا كان الطابور full
        return rear == capacity-1;
    }

    public boolean isEmpty(){ // بترجع قيمة true اذا كان الطابور فارغ تماما
        return rear == -1;
    }

    public int size(){ // بيترجعلي حجم الطابور
        return nElements;
    }
//_______________________________Main method________________________________
    public static void main(String[] args) {
        queue q = new queue(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // هان المفروض يطبعلي انو الطابور مليان لانو زدت عن حجم الطابور الي هو 3
        System.out.println(q.dequeue()); // بيطبع 10
        System.out.println(q.dequeue()); // بيطبع 20
        System.out.println(q.dequeue()); // بيطبع 30
        System.out.println(q.dequeue()); // بيطبعلي انو الطابور صار فارغ
    }
}
