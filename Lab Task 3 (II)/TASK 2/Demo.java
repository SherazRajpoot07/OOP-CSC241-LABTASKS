public class Demo{
static void increaseNumber(int n) { n += 3; }
static void updateObject(LabProgress p) { p.completeOne(); }
static void replaceLocal(LabProgress p) {
    p = new LabProgress();
    p.completeOne();
}

  public static void main(String args[]){
   int n=4;
   LabProgress progress =new LabProgress();
  
   System.out.println("Value of n before helper call="+n);
   System.out.println("Value of CompletedLabs before helper call="+progress.getCompletedLabs());
   increaseNumber(n);
   System.out.println("Value of n before helper call="+n);
   System.out.println("Value of CompletedLabs before helper call="+progress.getCompletedLabs());
   updateObject(progress);
   System.out.println("Value of n before helper call="+n);
   System.out.println("Value of CompletedLabs before helper call="+progress.getCompletedLabs());
   replaceLocal(progress);
   System.out.println("Value of n before helper call="+n);
   System.out.println("Value of CompletedLabs before helper call="+progress.getCompletedLabs());
 
  


}




}