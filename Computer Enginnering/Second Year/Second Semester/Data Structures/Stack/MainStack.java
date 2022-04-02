public class MainStack {
    public static void main(String[] args) {
        myStack m1 = new myStack(5);
        m1.push(2);
        m1.push(3);
        m1.push(4);
        m1.push(5);
        m1.push(6);
        
        m1.print();
    }
}

output will be: 
6
5
4
3
2
