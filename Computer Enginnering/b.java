
package data_structures_project;


public class List_Stack {
    Node top;
    int size;
    
    public void push (int x, String y){
        Book b = new Book(x, y);
        Node newnode = new Node(b);
        newnode.next = top;
        top = newnode;
        size++;
    }
    
    public int pop (){
        Book b = null;
        
        if(isEmpty())
            System.out.println("The library is Empty");
            
        else{
            b = top.book;
            top = top.next;
            size--;
        }
         System.out.println("Book Name: " + b.book_name + " --> Book Number: " + b.book_id);
        return b.book_id;  
    }
    
    public boolean isEmpty (){
       return (size == 0);
    }
    
    public void show(List_Stack s){   
        if(s.isEmpty()){
            System.out.println("End Of Components");
            //return;
        }
         else {
            int x = s.top.book.book_id;
            String y = s.top.book.book_name;

            s.pop();
           
            show(s);
            
            s.push(x , y);   
        }
    }
    
    public void searchByNumber (int bookNum){
        boolean flag = false;
        Node temp = top;
        if(isEmpty())
            //return;
            System.out.println("The stack is empty");
        else {
          while(temp != null){
            if(temp.book.book_id == bookNum){
                flag = true;
          break;
            }
            temp = temp.next;
          }
        }     
        if(flag == true)
            System.out.println(bookNum +" Is Existed");
        else 
            System.out.println(bookNum + " Is Not Existed");
    }
    
   public void searchByName (String bookName){
       boolean flag = false;
       Node temp = top;
       
       if(isEmpty())
           System.out.println("The library is empty");
       else
           while(temp != null){
               if(temp.book.book_name.equalsIgnoreCase(bookName)){
                   flag = true;
               break; 
           }
               
       temp = temp.next;
           }
       String s = flag ? " Is Existed" : " Is Not Existed";
        System.out.println(bookName + s); 
   }
   
   public void sortBooks (List_Stack l){
       if(isEmpty())
           System.out.println("The library is empty");
       
       else{
            Book temp;
            Node s = top, t;
            while (s != null) {
                t = s.next;
                while (t != null) {
                    if (s.book.book_id > t.book.book_id) {
                        temp = s.book;
                        s.book = t.book;
                        t.book = temp;
                    }
                    t = t.next;
                }
                s = s.next;
            }
            show(l);
        }
           
       }
   
   
   public Book peek(){
       if(isEmpty())
           System.out.println("The library is empty");
       
       return top.book;
   }
   
}
