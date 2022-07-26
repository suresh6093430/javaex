public class innerclass1 {

private String msg="Inner Classes";

void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
 }  
 
 Inner l=new Inner();  
 l.msg();  
}  


public static void main(String[] args) {
	innerclass1  ob=new innerclass1 ();  
	ob.display();  
	}
}


abstract class AnonymousInnerClass {
	   public abstract void display();
	}