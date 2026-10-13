public class Date{
   private int day;
   private int month;
   private int year;
 
public Date(){
  this(07,10,2005);
}
public Date(int year){
  this(1,1,year);
}
public Date(int month,int year){
  this(1,month,year);
}
public Date(int day,int month,int year)
{
   setDay(day);
   setMonth(month);
   setYear(year);
  }

public void setDay(int day){
 if (day>=1&&day<=30)
    this.day=day;
 else 
    this.day=1;
}
public void setMonth(int month){
 if (month>=1&&month<=12)
    this.month=month;
 else 
    this.month=1;
}
public void setYear(int year){
 if (year>1)
    this.year=year;
 else 
    this.year=2005;
}

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; } 

    
    public void displayDate() {
        System.out.printf("%02d-%02d-%04d\n", day, month, year);
    }




}