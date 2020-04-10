package design;

public abstract class EmployeeProfile implements Employee {

    public static String companyName = "walmart";
    public int id;

    public String name ="adnan";
    public String dept;
    public static final int grossSalary = 65000;

    public EmployeeProfile(){}
    public EmployeeProfile(String name){
        this.name = name;
    }

    public int totalChildrenAge(int a){
        int total =a;
        return total;
    }
    public int totalChildrenAge(int a, int b){
        int total =a + b;
        return total;
    }
    public int totalChildrenAge(int a, int b, int c){
        int total =a + b + c;
        return total;
    }
    public int totalChildrenAge(int a, int b, int c, int d){
        int total =a + b + c + d;
        return total;
    }
    public abstract void employeeMood();

    public int employeeId() {
        return this.id;
    }


    public String employeeName() {
        return this.name;
    }


    public void assignDepartment(){
        System.out.println("they all are in retail department");
    }


    public int calculateSalary() {
        return this.grossSalary ;
    }


    public void benefitLayout() {
        System.out.println("Dental,Medical,pensions,401k");
    }
}


