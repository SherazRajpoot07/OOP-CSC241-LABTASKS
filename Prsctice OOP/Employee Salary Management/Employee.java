public class Employee{
 private int id;
 private String name;
 private Department department;
 private double[]salaries;

public Employee(int id,String name){
  this(id,name,Department.IT,new double[]{0,0,0});
 }
public Employee(int id,String name,Department department,double[]salaries){
  this.id=id;
  this.name=name;
  this.department=department;
  this.salaries=salaries;

  }
public int getID(){return id;}
public String getName(){return name;}
public Department getDepartment(){return department;}
public double calculateTotal(){
 double total=0;
 for(int i=0;i<salaries.length;i++){
    total+=salaries[i];
 }  
 return total;

}
public double calculateAverage(){
 double average=calculateTotal()/salaries.length;
 return average;
}
public double findHighestSalary(){
 double highest=salaries[0];
for(int i=0;i<salaries.length;i++){
  if(salaries[i]>highest){
    highest=salaries[i];
 }
 }
return highest;
}

 public boolean qualifiesForBonus() {
    return calculateAverage() >= 50000;
}
public void displayDetails(){
   System.out.println("ID:"+id);
   System.out.println("Name:"+name);
   System.out.println("Department:"+department);
   System.out.println("Total Salary:"+calculateTotal());
   System.out.println("Average Salary:"+calculateAverage());
   System.out.println("Highest Salary:"+findHighestSalary());
   System.out.println("Bonus Eligibe:"+qualifiesForBonus());
   

 }




}










 