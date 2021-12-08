public class Fish extends Animal implements Pet {
public Fish() {
super(0);
}
private String fishName;
@Override
public void eat() {
System.out.println("Fish eat plants");
}
public String getName() {
return fishName;
}
public void setName(String name) {
fishName = name;
}
public void play() {
throw new UnsupportedOperationException("Not supported yet.");
}
@Override
public void walk(){
System.out.println("Fish has no legs.");
}
}
