package corejavapart2;
//with in class with in package (Private)---->Access
 class AccessSpec {
	private int data=40;
	private void msg()
	{
		System.out.println("HELLO JAVA");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AccessSpec obj=new AccessSpec();
         System.out.println(obj.data);
         obj.msg();
         
    }
}
 //with in package outside class is not access----(private)
/*class Ac {
	private int data=40;
	private void msg()
	{
		System.out.println("HELLO JAVA");
		
	}
}
class AccessSpec{
public static void main(String[] args) {
	// TODO Auto-generated method stub
     AccessSpec obj=new AccessSpec();
     System.out.println(obj.data);
     obj.msg();
}
}*/