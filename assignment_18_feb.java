
import java.util.Arrays;

//1.) Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
//    Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student

class Student {
    public String name;
    public int roll_no;
    public String address;
    public long phoneNumber;
    //parametrised constructore

    public Student(String name, int roll_no,String address,long phoneNumber){
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }
    public String getname() {
        return name;
    }
    public int getroll_no() {
        return roll_no;
    }
    public String getaddress(){
        return address;
    }
    public long getnumber(){return phoneNumber;}
    
    public String getdetail() {
        return getname()+" "+getroll_no()+" "+getaddress()+" "+getnumber();
    }

//2.)Assign and print the roll number, phone number and address of two students having names "Sam" 
//   and "John" respectively by creating two objects of class 'Student'. 


    public static void main(String[] args) {
        // 1 student 
        Student s=new Student("John",2,"firozabad",1965874563l);
        String detail=s.getdetail();
        System.out.println(detail);   

        // 2 student 
        Student s1=new Student("sam",3,"Agra", 8965476546l);
        String detail1=s1.getdetail();
        System.out.println(detail1);
    }
}


// 3.) Create a class 'Employee' with String variable 'name' and integer variable 'employee id'. 
// Create 4 Employee objects and store in array and display

class Employee{
    String name;
    int employee_id;
    

    public Employee(String name, int employee_id) {
        this.name = name;
        this.employee_id = employee_id;
    }


    public static void main(String[] args) {
        Employee E1=new Employee("aman",1);
        Employee E2=new Employee("raman",2);
        Employee E3=new Employee("deepak",3);
        Employee E4=new Employee("akt",4);
        
        Employee arr[]=new Employee[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=E1;
            arr[i]=E2;
            arr[i]=E3;
            arr[i]=E4;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr));
        }
        
    }
}