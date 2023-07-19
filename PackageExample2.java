package pack1;
import pack2.PackageExample;
public class PackageExample2{
	public static void main(String[] args) {
		PackageExample obj=new PackageExample();
		obj.setRollno(70);
		obj.setName("Vivek");
		System.out.println("Roll No: "+obj.getRollno());
		System.out.println("Name: "+obj.getName());	
	}
}