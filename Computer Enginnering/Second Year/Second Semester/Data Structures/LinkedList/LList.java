public class LList {
    Node head;

    public LList(){
        head = null;
    }

    public void addfirst(int item){
        Node newnode = new Node(item);
        if(head == null)
            head = newnode;

        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void print(){
        Node s = head;
        while(s != null) {
            System.out.println(s.item);
            s = s.next;
        }
    }

    public void addlast(int item){
        Node newnode = new Node(item);
        Node s = head;
        while(s.next != null) {
        s = s.next;
        }
        s.next = newnode;
    }
}
