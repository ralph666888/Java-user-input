import java.util.*;
public class MyRectangle2D {
   private double x;
   private double y;
   private double width = 1; ///not how you do default values
   private double height = 1;
   public MyRectangle2D(){}; //search up default contructor
   public MyRectangle2D(double x, double y,double width,double height){
       this.x = x;
       this.y = y; //this.x isn't the same variable as x
       this.width = width;
       this.height = height;
   }

   public MyRectangle2D(double width, double height){
       this(1, 1, width, height);
   }
   public void setX(double x2){
       this.x=x2;
   }
   public double getX(){
       return x;
   }
   public void setY(double y2){
        this.y=y2;
   }
   public double getY(){
        return y;
   }
    public void setWidth(double width2){
        this.width=width2;
   }
    public double getWidth(){
        return width;
   }
    public void setHeight(double height2){
        this.height=height2;
   }
    public double getHeight(){
        return height;
   }
   public double getArea(){
       return width*height;
   }
   public double getPerimeter(){
       return 2*(width+height);
   }
   public boolean contains(double x3, double y3){
       if(Math.abs(x3-x)<=0.5*width && Math.abs(y3-y)<=0.5*height)
           return true;
       else
           return false;
   }
   public boolean contains(MyRectangle2D r){
       if(Math.abs(r.getX()-x)+0.5*r.getWidth()<=0.5*width && Math.abs(r.getY()-y)+0.5*r.getHeight()<=0.5*height)
           return true;
       else
           return false;
   }
   public boolean overlaps(MyRectangle2D r){
       if(Math.abs(r.x-x)>0.5*(r.width+width)||Math.abs(r.y-y)>0.5*(r.height+height)){
           return false;
       } //keep brackets consistant
       else{
           return true;
       }

   }
   public static void main(String[]args){
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println(r1.getPerimeter());
        System.out.println((r1.getArea()));
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5,
               3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
        r1.setX(44);
       System.out.println(r1.x);
   }



}
