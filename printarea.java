abstract class shape{
abstract void area();
}
class triangle extends shape{
public void area(){
int base=5,height=10;
double area1=0.5*base*height;
System.out.println("triangle area "+area1);


}}
class circle extends shape{
public void area(){
int r=10;
double pi=3.14;
double area2=pi*r*r;
System.out.println("circle area "+area2);


}}
class rectangle extends shape{
public void area(){
int l=5, b=10;
float area3=l*b;
System.out.println("rectange area "+area3);


}}

class printarea
{
public static void main(String args[]){
circle c1=new circle();
c1.area();
triangle t1=new triangle();
t1.area();
rectangle r1=new rectangle();
r1.area();
}



}