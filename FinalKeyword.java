//______________________________________________Example of Final Variable_______________________________
// class Example{
// 	private final int x=5;       //final instance variable
// 	private final static int y=10;      //final static variable
// 	public void f1(){
// 		final int z=15;    //final local variable
// 		System.out.println("X="+x);      
// 		System.out.println("Y="+y);    
// 		System.out.println("Z="+z);  
// 	}
// }
// class FinalKeyword{
// 	public static void main(String[] args) {
// 		Example e1=new Example();
// 		e1.f1();
// 	}
// }

//______________________________________________Example of Final Method_______________________________
// class Example1{
// 	public final void f1(){    //final method cannot be overridden 
// 		System.out.println("Final Method");
// 	}
// }
// class Example2 extends Example1
// {
// 	public void f1(){     //error          
// 		System.out.println("Overridden Method");
// 	}
// }
// class FinalKeyword{
// 	public static void main(String[] args) {
// 		Example2 e2=new Example2();
// 		e2.f1();
// 	}
// }

//______________________________________________Example of Final Class_______________________________
final class Example1{        //final class cannot be extended
	public void f1(){     
		System.out.println("Example1");
	}
}
class Example2 extends Example1     //error
{
	public void f1(){               
		System.out.println("Example2");
	}
}
class FinalKeyword{
	public static void main(String[] args) {
		Example2 e2=new Example2();
		e2.f1();
	}
}