class Animal
{
String name,type;
Animal(String a,String b)
{
name=a;
type=b;
}
void print()
{
System.out.println("NAME="+name);
System.out.println("TYPE="+type);
}
}
class Birds extends Animal
{
String colour;
Birds(String a,String b,String c)
{
super(a,b);
colour=c;
}
void display()
{
System.out.println("COLOUR="+colour);
}
}
class Mammals extends Birds
{
String mammal;
Mammals(String a,String b,String c,String d)
{
super(a,b,c);
mammal=d;
}
void show()
{
System.out.println("MAMMAL="+mammal);
}
}
class MultiInherit
{
public static void main(String args[])
{
Mammals m=new Mammals("parrot","flying","green","not mammal");
m.print();
m.display();
m.show();
}
}
