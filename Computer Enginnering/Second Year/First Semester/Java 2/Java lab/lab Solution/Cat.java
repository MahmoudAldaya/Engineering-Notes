public  class Cat extends Animal implements Pet {
private String catName;
public Cat(){
this("");
}
public Cat(String name){
super(4);
catName=name;
}
@Override
public void eat() {
System.out.println("Cat eat fishes");
}
public String getName() {
return catName;
}
public void setName(String name) {
catName=name;
}
public void play() {
throw new UnsupportedOperationException("Not supported yet.");
}
}
