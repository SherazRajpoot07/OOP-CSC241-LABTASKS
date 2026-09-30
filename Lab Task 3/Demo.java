class Demo{
 public static void main(String[]args){
    Rectangle r1=new Rectangle();
    r1.length=10.0;
    r1.width=21.0;
    double area=r1.calArea();
    System.out.println("Area:"+area);
}
}