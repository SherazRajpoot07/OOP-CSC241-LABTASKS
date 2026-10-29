public class LibraryItem{
 private String itemId;
 private String title;
 private BarcodeLabel label;
 
 
public LibraryItem(String itemId,String title,String barcodeNumber, String shelfCode){
  this.itemId=itemId;
  this.title=title;
  this.label=new BarcodeLabel(barcodeNumber,shelfCode);
  

 }
public void displayInfo(){
 System.out.println("Item Id:"+itemId);
 System.out.println("Item Title:"+title);
 System.out.println("BarcodeLabel:");
 label.displayBarcodeLabel();
 
 


}




}


