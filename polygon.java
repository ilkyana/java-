
import java.lang.*;
class RegularPolygon{
private int n = 3;
private double side = 1;
private double x = 0 ;
private double y = 0;
RegularPolygon(){

}
RegularPolygon( int newn){
newx = 0 ; 
newy = 0 ;
x = newx;
y = newy;
n = newn;
}
RegularPolygon(int newn , int newx , int newy ){
newn = n ;
newy = y;
newx = x;
}
int getn(){
return n;
}
int getx(){
return x;
}
int gety(){
return y;
}
double getside(){
return side;
}
int setx(int newx){
x = xnew;
return x;
}
int setn(int newn){
n = nnew;
return n;
}
int sety(int newy){
y = ynew;
return y;
}
double setside(double newside){
side = newside;
return side;
}
double getPerimeter(){
return n * side;
}
double angle= Math.toRadians(180/n);
angle=Math.tan(angle); 
double getArea(){
return (n*side*side)/4*angle ; 

}
}
