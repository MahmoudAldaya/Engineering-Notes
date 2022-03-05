import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class DLinkedlist {
    public static void main(String[] args) {
        DLlist d1 = new DLlist();
        d1.Addfirst(3);
        d1.Addfirst(4);
        d1.Addfirst(5);
        d1.Addfirst(6);
        // d1.removeFirst();
        // d1.Addlast(7);
        // d1.printForward();
        // System.out.println();
        // d1.AddBetween_position(2,2);

        // d1.printForward();
        // d1.removeLast();
        //  System.out.println();
        d1.printForward();
        // d1.printBackward();
         d1.search(3);
        // d1.search(4);
        // d1.search(5);
        // d1.search(6);
        // d1.search(7);
         d1.search(8);
    }
}

//Output:

6
5
4
3
found
not found
