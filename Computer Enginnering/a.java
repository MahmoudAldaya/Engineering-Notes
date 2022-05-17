
package data_structures_project;

import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.*;



public class Data_Structures_Project {

   
    public static void main(String[] args) { 
        try{
        ImageIcon i = new ImageIcon("D:\\image.jpg");   
        JOptionPane.showMessageDialog(null, null, "MAHMOUD M. ALDAYA", JOptionPane.PLAIN_MESSAGE, i);
        }catch(Exception e){
            System.out.println("Image path not found!");
        }
           List_Stack l = new List_Stack();


       // UIManager.put("OptionPane.minimumSize",new Dimension(500,500));
        
        do{
     try{
        Scanner in = new Scanner (System.in);
        
//        l.push(100 , "math");
//        l.push(200 , "science");
//        l.push(50 , "english");
//        
//        l.show(l);
//        System.out.println("--------------------");
//        l.sortBooks(l);

           do {
                String choose1 = JOptionPane.showInputDialog("Main Menu: \n" + //// choose 1
                        "1- Add new book \n" +
                        "2- Show all books \n" +
                        "3- Delete the latest book \n" +
                        "4- Search book \n" +
                        "5- Sort books \n" +
                        "6- Exit");

                switch (Integer.parseInt(choose1)) {
                    case 1:
                        //System.out.println("Enter Book Number: ");
                        String book_id = JOptionPane.showInputDialog("Enter Book Number: ");
                        //int book_id = in.nextInt();
                        // System.out.println("Enter Book Name: ");
                        String book_name = JOptionPane.showInputDialog("Enter Book Name: ");
                        //String book_name = in.next();
                        l.push(Integer.parseInt(book_id), book_name);
                        break;
                    case 2:
                        System.out.println("Library Contains: ");
                        l.show(l);
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        l.pop();
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        String choose2 = JOptionPane.showInputDialog("Do you want to search by book name or book number? \n" + //// choose 2

                                // System.out.println("Do you want to search by book name or book number? \n" +
                                "1- By number \n" +
                                "2- By name");
                        //int number = in.nextInt();
                        switch (Integer.parseInt(choose2)) {
                            case 1:
                                // System.out.println("Enter book Number to search about: ");
                                String book_num = JOptionPane.showInputDialog("Enter book Number to search about: ");
                                l.searchByNumber(Integer.parseInt(book_num));
                                System.out.println("--------------------------------------------");

                                break;
                            case 2:
                                // System.out.println("Enter book name to search about: ");
                                // l.searchByName(in.next());
                                String bookName = JOptionPane.showInputDialog("Enter book Name to search about: ");
                                l.searchByName(bookName);
                                System.out.println("--------------------------------------------");
 
                                break;
                        }
                        break;
                        
                    case 5:
                        l.sortBooks(l);
                        System.out.println("----------------------------------------");
                        break;

                    case 6:
                        System.out.println("Programe Exited!");
                        System.exit(0);
                        break;
                    default:
                        //System.out.println("Please enter a valid option");
                        JOptionPane.showMessageDialog(null, "Please enter a valid option");

                }
//            System.out.println();
//            System.out.println("Another operation? \n" +
//                    "1--> YES \n" +
//                    "0 --> NO");
//            n = in.nextInt();
            } while (true);
       
     }catch(Exception ex){
         // System.out.println("Invalid Input!");
         try{
                        do {
                String choose1 = JOptionPane.showInputDialog("Main Menu: \n" + //// choose 1
                        "1- Add new book \n" +
                        "2- Show all books \n" +
                        "3- Delete the latest book \n" +
                        "4- Search book \n" +
                        "5- Sort books \n" +
                        "6- Exit");

                switch (Integer.parseInt(choose1)) {
                    case 1:
                        //System.out.println("Enter Book Number: ");
                        String book_id = JOptionPane.showInputDialog("Enter Book Number: ");
                        //int book_id = in.nextInt();
                        // System.out.println("Enter Book Name: ");
                        String book_name = JOptionPane.showInputDialog("Enter Book Name: ");
                        //String book_name = in.next();
                        l.push(Integer.parseInt(book_id), book_name);
                        break;
                    case 2:
                        System.out.println("Library Contains: ");
                        l.show(l);
                        System.out.println("--------------------------------------------");
                        break;
                    case 3:
                        l.pop();
                        System.out.println("--------------------------------------------");
                        break;
                    case 4:
                        String choose2 = JOptionPane.showInputDialog("Do you want to search by book name or book number? \n" + //// choose 2

                                // System.out.println("Do you want to search by book name or book number? \n" +
                                "1- By number \n" +
                                "2- By name");
                        //int number = in.nextInt();
                        switch (Integer.parseInt(choose2)) {
                            case 1:
                                // System.out.println("Enter book Number to search about: ");
                                String book_num = JOptionPane.showInputDialog("Enter book Number to search about: ");
                                l.searchByNumber(l, Integer.parseInt(book_num));
                                System.out.println("--------------------------------------------");

                                break;
                            case 2:
                                // System.out.println("Enter book name to search about: ");
                                // l.searchByName(in.next());
                                String bookName = JOptionPane.showInputDialog("Enter book Name to search about: ");
                                l.searchByName(l, bookName);
                                System.out.println("--------------------------------------------");
 
                                break;
                        }
                        break;
                        
                    case 5:
                        l.sortBooks(l);
                        System.out.println("----------------------------------------");
                        break;

                    case 6:
                        System.out.println("Programe Exited!");
                        System.exit(0);
                        break;
                    default:
                        //System.out.println("Please enter a valid option");
                        JOptionPane.showMessageDialog(null, "Please enter a valid option");

                }
//            System.out.println();
//            System.out.println("Another operation? \n" +
//                    "1--> YES \n" +
//                    "0 --> NO");
//            n = in.nextInt();
            } while (true);
         }catch(Exception ex1){
             JOptionPane.showMessageDialog(null, "Enter 6 to Exit");
         }
     }
    }while(true);
    }
}
