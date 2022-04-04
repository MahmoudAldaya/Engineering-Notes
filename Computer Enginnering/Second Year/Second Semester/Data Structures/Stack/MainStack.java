public class MainStack {
    public static void main(String[] args) {
        myStack s = new myStack(5);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s.pop());
        System.out.println(s.pop());
        
    }
}

Output:
 6
 5
