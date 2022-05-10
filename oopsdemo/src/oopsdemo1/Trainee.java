package oopsdemo1;

public class Trainee {
	private int id ;
	private String name , tech;
	private double stipend;
	
	public Trainee()
	{
		System.out.println("implicit constructor");
		this.id = 111;
		this.name = "james";
		this.tech = "java";
		this.stipend = 5000;
	}
	
	public Trainee(int id, String name, String tech, double stipend) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
	}
	
	
}
