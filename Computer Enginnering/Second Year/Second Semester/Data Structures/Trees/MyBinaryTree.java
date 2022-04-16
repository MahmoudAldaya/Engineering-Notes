public class MyBinaryTree {
    Node4 root;

    public MyBinaryTree(Node4 root) {
        this.root = root;
    }
    public void visit(Node4 n){
        System.out.print(n.data + " ");
    }
    public void preorder(Node4 n){
        if(n != null){
            visit(n);
            preorder(n.left);
            preorder(n.right);
        }
    }

    public void postorder (Node4 n){
        if(n != null){
            postorder(n.left);
            postorder(n.right);
            visit(n);
        }
    }

    public void inorder (Node4 n){
        if(n != null){
            inorder(n.left);
            visit(n);
            inorder(n.right);
        }
    }
}
