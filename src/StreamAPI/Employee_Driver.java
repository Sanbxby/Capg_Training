package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_Driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		empList.forEach(System.out::println);
		Map<String,List<Employee>> map=empList.stream().collect(Collectors.groupingBy(Employee :: getCity));
		System.out.println(map);
		
		for(String city:map.keySet()) {
			System.out.println(city+" "+map.get(city));
		}
		System.out.println("=================================================================================================");
		Map<Integer,List<Employee>> map2=empList.stream().collect(Collectors.groupingBy(Employee :: getAge));
		for(Integer age:map2.keySet()) {
			System.out.println(age+" "+map2.get(age));
	}
		List<String> list=empList.stream().map(s -> s.getDeptName()).distinct().toList();
		System.out.println("Department names::"+list);
		//else
		// empList.stream().map(Employe :: getDeptName.distinct().tolist();
		System.out.println("===================================================================================================");
		List<Employee>list2=empList.stream().filter(i -> i.getAge()>20).toList();
		list2.forEach(System.out::println);
		//System.out.println("age > 20:"+list2);
		
		System.out.println("====================================================================================================");
		Employee maxAge=empList.stream().max((e1,e2) -> e1.getAge() - e2.getAge()).get();
		System.out.println("Max age is: "+maxAge);

		
		
		System.out.println("=====================================================================================================");
		Employee e=empList.stream().filter(i -> i.getGender()=="F").min((e1,e2) -> e1.getAge() - e2.getAge()).get();
		System.out.println("Youngest Female employee:"+e);
		
		//Q1. Find the emp whose age is > 25 and < 30
		//Q2. Find all emp from Hr dept
		//Q3. Find all emp who lives in blr sort them by their name and then print the name of emp
		//Q4. Get total number of emp in the org // use count method
		//Q5. Sort the emp based on the age
		//Q7. find the highest exp emp in the org
		//Q8. Find the highest salary in the org
		
	}
}
