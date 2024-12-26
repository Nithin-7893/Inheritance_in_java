class Animal 
{
String name="frog";
String type="aquatic";
void print()
{
System.out.println("Name & Type of animal is:");
}
}
class Bird extends Animal
{
String name="parrot";
String type="terrestrial";
void display()
{
System.out.println("Name & type of bird is: ");
System.out.println(name);
System.out.println(type);
super.print();
System.out.println(super.name);
System.out.println(super.type);
}
}
class Superkey
{
public static void main(String args[])
{
Bird b=new Bird();
b.display();
}
}



