public class TestAnimals {
  
public static void main(String[] args) {
  
Fish d = new Fish();
Cat c = new Cat("Fluffy");
Animal a = new Fish();
Animal e = new Spider();
Pet p = new Cat();
  
d.setName(" ");//Enter cat name
d.eat();
System.out.println("This fish's name is"+d.getName());
d.walk();
  
c.eat();
System.out.println("This cat's name is"+c.getName());
c.walk();
  
((Fish)a).setName(" ");//Enter fish name
((Fish)a).eat();
System.out.println("This fish's name is"+((Fish)a).getName());
((Fish)a).walk();
  
((Spider)e).eat();
((Spider)e).walk();
  
((Cat)p).setName(" ");//Enter cat name
((Cat)p).eat(); 
System.out.println("This Cat's name is"+((Cat)p).getName());
((Cat)p).walk();
  
}
  
}
