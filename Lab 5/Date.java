public class Date {
    private int day;   // 1-31
    private int month; // 1-12 
    private int year;  // > 0

 
    public Date() {
        this.day = 1;
        this.month = 10;
        this.year = 2026;
    }

  
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

  
    public Date(int month, int year) {
        this(1, month, year);
    }

 
    public Date(int year) {
        this(1, 1, year);
    }

 
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1; 
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2026; 
        }
    }

    
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; } 

    
    public void displayDate() {
        System.out.printf("%02d-%02d-%04d\n", day, month, year);
    }
}