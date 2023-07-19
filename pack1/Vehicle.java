package pack1;
public class Vehicle{
	private String name;
	private String model;
	public void setdetails(String name,String model){
		this.name=name;
		this.model=model;
	}
	public void getdetails(){
		System.out.println("Name: "+this.name);
		System.out.println("Adress: "+this.model);
	}
}