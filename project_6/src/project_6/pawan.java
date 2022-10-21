package project_6;

public class pawan 
{
 public void method()
 {
	 System.out.println("pawan");
	 this.method1();
	 System.out.println("default method");
 }
 public void method1()
 {
	 this.method2();
	 System.out.println("one parameterized method");
 }
 public void method2()
 {
	 this.method3();
	 System.out.println("two parameterized method");
 }
 public void method3()
 {
	 this.method4();
	 System.out.println("three parameterized method");
 }
 public void method4()
 {
	 System.out.println("four parameterized method");
 }
 public static void main(String[] args) 
 {
	pawan obj=new pawan();
	obj.method();
}
 
}
