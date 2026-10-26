public class Car{
 private String model;
 private String registrationNo;
 private Engine engine;
public Car(String model,String registrationNo){
 this(model,registrationNo,new Engine());
}
public Car(String model,String registrationNo,Engine engine){
 this.model=model;
 this.registrationNo=registrationNo;
 this.engine=engine;
 }

public void displayCar(){
 System.out.println("Model:"+model);
 System.out.println("Registration No:"+registrationNo);
 engine.displayEngine();

}
}

