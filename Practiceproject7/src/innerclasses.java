public class innerclasses {

	 private String msg="Welcome Here and you can"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+" start work");}  
	 }  


	public static void main(String[] args) {

		innerclasses obj=new innerclasses();
		innerclasses.Inner in=obj.new Inner();  
		in.hello();  
	}
}