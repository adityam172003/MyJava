




public class test1{


static int a=20;
test1()
{

a++;
}

void m1()
{
a++;
System.out.println("a = "+a);

}

public static void main(String args[])
{
test1 o = new test1();
test1 o2 = new test1();
test1 o3 = new test1();
o3.m1();



}
}
