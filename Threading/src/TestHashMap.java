import java.util.HashMap;

class Employee
{
	int id;
	public Employee(int id) {
		this.id=id;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return false;
	}
}

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Employee,Integer> hm = new HashMap();
		Employee e1 = new Employee(1);
		hm.put(e1,1);
		
		e1.id=100;
		
		//Employee e2 = new Employee(2);
		//hm.put(e2,2);
		
		System.out.println(hm.get(e1));
		
	}

}
