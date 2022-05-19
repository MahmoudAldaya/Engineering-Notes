
package javaapplication_dsproject;


public class LL_Stack {
    Node top;
    int size;
    
    public void push(int number, String name){
        Book b = new Book(number, name);
        Node newnode = new Node(b);
        newnode.next = top;
        top = newnode;
        size++;
    }
    
    public void pop(){
        if(isEmpty())
            System.out.println("the library is empty");
        else{
            System.out.println("Book Name: "+top.book.book_name + " Book Number: "+ top.book.book_num);
            top = top.next;
            size--;
        }
    }
    

    public boolean isEmpty(){
        return size == 0;
    }
   
    public void display(){
        Node pointer = top;
        
        if(isEmpty())
            System.out.println("the library is empty");
        else{
            while(pointer != null){
                System.out.println("Book Name: "+ pointer.book.book_name + " || Book Number: " + pointer.book.book_num);
                pointer = pointer.next;
            }
        }
    }  
    
    public void search (String name){
        Node s = top;
        int mark = 0;
        
        if(isEmpty())
            System.out.println("the library is empty");
        else{
            while(s != null){
                if(s.book.book_name.equalsIgnoreCase(name)){
                    mark = 1;
                }
                s  = s.next;
            }
        }
        if(mark == 1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
    
    public void sort(){
        if(isEmpty())
           System.out.println("the library is empty");
        else{
            Book temp;
            Node s = top;
            Node t;
            
            while(s != null){
                t = s.next;
                 while( t != null){
                     if(s.book.book_num > t.book.book_num){
                         temp = s.book;
                         s.book = t.book;
                         t.book = temp;
                     }
                       t  = t.next;  
                 }
                s = s.next;
            }
        }
                display();
    }
    
}
