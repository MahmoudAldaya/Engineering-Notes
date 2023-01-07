
package javaapplication_dsproject;

import java.util.Scanner;

public class JavaApplication_DSproject {

    
    public static void main(String[] args) {
        LL_Stack l = new LL_Stack();
        Scanner in = new Scanner(System.in);
            
        do{
            System.out.println("Main Menu \n"
                    + "--------------- \n"
                    + "1. Add book \n"
                    + "2. Show all books \n"
                    + "3. delete book \n"
                    + "4. search about book \n"
                    + "5. sort all books \n"
                    + "6. Exit" );
            int op = in.nextInt();
            switch(op){
                case 1: System.out.println("Enter book number: ");
                int num = in.nextInt();
                    System.out.println("Enter book name: ");
                String name = in.next();
                l.push(num, name);
                break;
                case 2: l.display();
                break;
                case 3: l.pop();
                break;
                case 4:
                    System.out.println("Enter a name to search about: ");
                    String m = in.next();
                    l.search(m);
                    break;
                case 5: l.sort();
                break;
                case 6: System.exit(0);
                break;
                default: System.out.println("Choose a valid operation!!");
                
            }
        }while(true);
    }  
}
