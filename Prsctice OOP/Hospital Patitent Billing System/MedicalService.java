public class MedicalService{
 private int serviceId;
 private String name;
 private double fee;
 private ServiceCategory category;

public MedicalService(int serviceId,String name,double fee){
   this(serviceId,name,fee,ServiceCategory.CONSULTATION);
 }
public MedicalService(int serviceId,String name,double fee,ServiceCategory cateory){
 this.serviceId=serviceId;
 this.name=name;
 this.fee=fee;
 this.category=category;
  }
public int getServiceId(){return serviceId;}
public String getName(){return name;}
public double getFee(){return fee;}
public ServiceCategory getCategory(){return category;}

public void displayService(){
  System.out.println("Service Id:"+serviceId);
  System.out.println("Name:"+name);
  System.out.println("Fee:"+fee);
  System.out.println("Category:"+category);
 



 }







}