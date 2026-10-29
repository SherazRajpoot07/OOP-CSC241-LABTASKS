public class BarcodeLabel{
 private String barcodeNumber;
 private String shelfCode;
public BarcodeLabel(String barcodeNumber,String shelfCode){
 this.barcodeNumber=barcodeNumber;
 this.shelfCode=shelfCode;
 }
public String getBarcodeNumber(){return barcodeNumber;}
public String getShelfCode(){return shelfCode;}
public void setBarcodeNumber(String barcodeNumber){ this.barcodeNumber=barcodeNumber;}
public void setShelfCode(String shelfCode){ this.shelfCode=shelfCode;}
public void displayBarcodeLabel(){
 System.out.println("Barcode Number:"+barcodeNumber);
 System.out.println("Shelf Code:"+shelfCode);

 }
 
}