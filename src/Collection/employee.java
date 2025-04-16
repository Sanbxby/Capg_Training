package Collection;

public class employee<T> implements Comparable<employee>
{
	private String name;
	private int id;
	private double salary;


	public employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return this.getName()+" "+this.getSalary()+" "+this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		employee e=(employee)obj;
		return this.name.equals(e.name) && this.id==e.id && this.salary==e.salary;
	}

	@Override
	public int compareTo(employee o) {
		return this.id=o.id;
		// TODO Auto-generated method stub

	}

	// TODO Auto-generated method stub

}



