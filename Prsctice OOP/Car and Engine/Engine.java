public class Engine{
  private String type;
  private int housepower;
public Engine(){this("Default",0);}
public Engine(String type,int housepower){
 this.type=type;
 this.housepower=housepower;
}
public void displayEngine(){
 System.out.println("Engine Type:"+type);
 System.out.println("Housepower:"+housepower);
 

}







}