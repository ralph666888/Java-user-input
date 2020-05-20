import java.util.*;
public class MyRectangle2D {
   private double x;
   private double y;
   private double width; 
   private double height;
  
   public MyRectangle2D(double x, double y,double width,double height){
       this.x = x;
       this.y = y; //this.x isn't the same variable as x
       this.width = width;
       this.height = height;
   }

   public MyRectangle2D(double width, double height){
       this(1, 1, width, height);
   }
   public void setX(double x){
       this.x = x;
   }
   public double getX(){
       return x;
   }
   public void setY(double y){
        this.y = y;
   }
   public double getY(){
        return y;
   }
    public void setWidth(double width){
        this.width = width;
   }
    public double getWidth(){
        return width;
   }
    public void setHeight(double height){
        this.height = height;
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
   public boolean contains(double x, double y){
       if(Math.abs(this.x-x) <= 0.5*width && Math.abs(this.y-y) <= 0.5*height)
           return true;
       else
           return false;
   }
   public boolean contains(MyRectangle2D r){
       if(Math.abs(r.getX()-x)+0.5*r.getWidth() <= 0.5*width && Math.abs(r.getY()-y)+0.5*r.getHeight() <= 0.5*height)
           return true;
       else
           return false;
   }
   public boolean overlaps(MyRectangle2D r){
       if(Math.abs(r.x-x)>0.5*(r.width+width)||Math.abs(r.y-y)>0.5*(r.height+height))
           return false;
        //keep brackets consistant
       else
           return true;
       

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
