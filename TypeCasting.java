class TypeCasting{
public static void main(String args[]){
int num=10;
double dub = 11.8;
System.out.println("integer value is "+num);
System.out.println("double value is "+dub);
System.out.println();
System.out.println();


System.out.println("implicity type casting");
dub= num;
System.out.println("double value is "+dub);
System.out.println();

//num=dub;
//error we get to solve this use below method;
num = (int)dub;
System.out.println("Explicity Type Casting");
System.out.println("num value is "+num);
}
}