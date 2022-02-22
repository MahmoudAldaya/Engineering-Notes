public class LinkedList1 {public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);

    n1.next = n2;
    n2.next = n3;

    System.out.println(n1.item);
    System.out.println(n1.next.item);
    System.out.println(n2.next.item);
}
}
