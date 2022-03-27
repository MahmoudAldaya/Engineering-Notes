public class DLlist { // إنشاء الكلاس وتعريف المتغيرات
    Node3 head;
    Node3 tail;

    public DLlist() { // إنشاء كونستركتور فارغ
        this.head = null;
        this.tail = null;
    }

    public boolean IsEmpty() { // لفحص ال doubly linkedlist ترجع true اذا كانت فارغة
        return head == null;
    }

    public void Addfirst(int item) { //دالة اضافة عنصر في اول الdoubly linkedlist
        Node3 newnode = new Node3(item);
        if (IsEmpty()) {
            tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
    }

    public void Addlast(int item) { // دالة لاضافة عنصر في نهاية ال doubly linkedlist
        Node3 newnode = new Node3(item);
        if (IsEmpty())
            Addfirst(item);
        else
            newnode.prev = tail;
        tail.next = newnode;
        tail = newnode;
    }

    public void printForward() { // هنا يمكن الطباعة بدلالة ال tail  وبدلالة ال head، فيكون هنالك خيارين للطباعة هذا احدها
        Node3 s = head;
        if (IsEmpty())
            System.out.println("The linkedlist is already empty!");
        while (s != null) {
            System.out.println(s.item);
            s = s.next;
        }
    }

    public void printBackward() { //وهذا الخيار الآخر
        Node3 s = tail;
        if (IsEmpty())
            System.out.println("The linkedlist is already empty!");
        while (s != null) {
            System.out.println(s.item);
            s = s.prev;
        }
    }

    public void removeFirst() {// حذف العنصر الأول
        if (head.next == null)
            tail = null;
        else {
            head.next = null;
            head = head.next;
        }
    }
    public void removeLast (){// حذف العنصر الأخير
        if (head.next == null)
            tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void AddBetween_position(int item, int position) { // إضافة عنصر في موقع محدد
        Node3 newnode = new Node3(item);
        Node3 s = head;
        if (position == 0)
            Addfirst(item);
        else {
            for (int i = 0; i < position - 1; i++) {
                s = s.next;
            }
            newnode.next = s.next;
            newnode.prev = s;
            s.next = newnode;
            s.next.prev = newnode;
        }
    }

    public void search(int item) { // دالة للبحث عن عنصر ما
        Node3 s = head;
        boolean flag = false;
        if (head == null)
            System.out.println("List is Empty!");
        else
            while (s != null) {
                if (s.item == item) {
                    flag = true;
                    break;}
                    s = s.next;
                }
              if (flag)
                  System.out.println("found");
              else
        System.out.println("not found");
            }
        }


