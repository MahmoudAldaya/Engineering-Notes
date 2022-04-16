public class mainTree {
public static void main(String[] args) {
        Node4 n1 = new Node4(5);
        Node4 n2 = new Node4(8);
        Node4 n3 = new Node4(10);
        Node4 n4 = new Node4(3);
        Node4 n5 = new Node4(2);

        n3.left = n2;
        n3.right = n1;
        n2.left = n4;
        n2.right = n5;

        MyBinaryTree tree = new MyBinaryTree(n3);
        tree.preorder(n3);
        System.out.println();
        tree.postorder(n3);
        System.out.println();
        tree.inorder(n3);

    }
}

Output:
10 8 3 2 5 
3 2 8 5 10 
3 8 2 10 5
