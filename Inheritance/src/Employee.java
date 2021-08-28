
public class Employee {
	private String name;
	private String department;
	private int salary;
	
	public Employee (String name,String department,int salary){
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	public void showInfos(){
		System.out.println("Bilgiler...");
		System.out.println("Ýsim: "+this.name);
		System.out.println("Departman: "+this.department);
		System.out.println("Maaþ: "+this.salary );
	}

}
