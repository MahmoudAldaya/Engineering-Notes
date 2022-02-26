public class LinkedList2 {
    public static void main(String[] args) {
        LList l1 = new LList();
        LList l2 = new LList();
        
        l1.addfirst(10);
        l1.addfirst(20);
        l1.addfirst(30);
        l1.addlast(5);
        l1.addlast(1);

        // Homeworks && 26/2 Lecture: removeLast, removeFirst, addBetween_Values, addBetween_Positions, Size, IsEmpty;

         l1.removeLast();
         l1.removeFirst();

         l1.addBetween_Position(15,2);
         l1.addBetween_Values(20, 5);

         System.out.println("Is l2 Empty? "+l2.isEmpty()); // Note That L2 is already Empty.
         System.out.println("Is l1 Empty? "+l1.isEmpty()); // Note That L2 is already NOT Empty.
         System.out.println("l1 Size: "+l1.size());

         l1.print();

    }
}
