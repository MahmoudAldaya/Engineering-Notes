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


    public  void removeLast(){ //last Homework 26/2
        Node s1 = head;
        while(s1.next.next != null){
            s1 = s1.next;}
     s1.next = null;

    }

    public void removeFirst(){ //last Homework
        head = head.next;
    }


    public void addBetween_Values(int item, int value){ //last Homework 26/2
        Node newnode = new Node(item);
      Node s = head;
      while(s.item != value)
          s = s.next;
      newnode.next = s.next;
      s.next = newnode;
    }

  
    public void addBetween_Position(int item, int position){ //last Homework, Quiz Question 26/2
        Node newnode = new Node(item);
        if(position == 0)
            addfirst(item);
        else {
            int i = 1;
            Node s = head;
            while(i < position) {
                s = s.next;
                i++;
            }
            newnode.next = s.next;
            s.next = newnode;
        }
    }

  
    public boolean isEmpty(){ //last lecture 26/2
        Node s = head;
        if(s == null)
            return true;
        else
            return false;

    }

  
    public int size(){ //last lecture 26/2
        int count = 0;
        Node s = head;
        while(s != null){
            s = s.next;
            count++;
        }
        return  count;
    }

}
