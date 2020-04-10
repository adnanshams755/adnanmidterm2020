package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		System.out.println(EmployeeInfo.calculateEmployeePension());

		EmployeeInfo f1 = new EmployeeInfo(100);
		System.out.println(f1.employeeId);
		EmployeeInfo f2 = new EmployeeInfo("john", 200);
		System.out.println(f2.name +" "+f2.employeeId);
		EmployeeInfo f3 = new EmployeeInfo();
		f3.setCountryName("Bangladesh");


		System.out.println(EmployeeInfo.calculateEmployeeBonus(4));


		System.out.println(f3.getCountryName());
		System.out.println(f3.totalChildrenAge(5));
		System.out.println(f3.totalChildrenAge(5,10));
		System.out.println(f3.totalChildrenAge(5,10,15));
		System.out.println(f3.totalChildrenAge(2,3,6,8));
		System.out.println(f3.employeeName());


	}

}
