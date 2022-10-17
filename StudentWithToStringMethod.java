class StudentWithToStringMethod{  
 int rollno;  
 String name;  
 String city;  
  
 StudentWithToStringMethod(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   StudentWithToStringMethod s1=new StudentWithToStringMethod(101,"Raj","lucknow");  
   StudentWithToStringMethod s2=new StudentWithToStringMethod(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  