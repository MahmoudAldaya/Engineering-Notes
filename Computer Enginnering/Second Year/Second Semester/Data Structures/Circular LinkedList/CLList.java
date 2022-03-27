public class CLList {
    Node2 tail;

    public CLList() {
        this.tail = null;

    }

    public void Addfirst(String item){
        Node2 newnode = new Node2(item);
        if (tail == null) {
            tail = newnode;
        } else {
             newnode.next = tail.next;
        }
        tail.next = newnode;
    }

    public void print() {
        Node2 s = tail.next;
        if (IsEmpty())
            System.out.println("The linkedlist is empty!");
        else {
            while (s != tail) {
                System.out.println(s.item);
                s = s.next;
            }
            System.out.println(tail.item);
        }
    }

    public void getItem(CLList o){
        System.out.println(o.tail.item);
    }

    public void Addlast(String item){
        Node2 newnode = new Node2(item);
        if(tail == null)
            tail = newnode;
        else
            newnode.next = tail.next;
            tail.next = newnode;
            tail = newnode;
    }

    public void Removefirst(){
        if(IsEmpty())
            System.out.println("The Linkedlist is already Empty!!");
        else
            tail.next = tail.next.next;
    }

    public void Removelast(){
        Node2 s = tail.next;
        if(IsEmpty())
            System.out.println("The Linkedlist is already Empty!! ");
        else{
            while (s.next != tail)
                s= s.next;
            s.next = tail.next;
            tail = s;
        }
    }

    public int size(){
        Node2 s = tail.next;
        int counter = 1;
        while(s!= tail) {
            s = s.next;
            counter++;
        }
        return counter;
    }

    public boolean IsEmpty(){
        if (tail == null)
            return true;
            else
                return false;
    }

    public void AddBetween(String item, int position){
        Node2 s = tail.next;
        Node2 newnode = new Node2(item);
        if (position == 0)
            Addfirst(item);
        for (int i = 0; i < position-1; i++) {
            s = s.next;
        }
        newnode.next = s.next;
        s.next= newnode;
    }

    public void Removebetween(int position){
        Node2 s = tail.next;
        for (int i = 0; i < position-1; i++) {
            s = s.next;
        }
        s.next = s.next.next;
    }
}
