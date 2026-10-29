public class Magzine extends LibraryItem{
 private int issueNumber;
public Magzine(String itemId,String title,String barcodeNumber, String shelfCode,int issueNumber){
 super(itemId,title,barcodeNumber,shelfCode);
 this.issueNumber=issueNumber;
 }
@Override
public void displayInfo(){
 super.displayInfo();
 System.out.println("Issue Number:"+issueNumber);

}





}