package oops_exceptions;

public class Throw_excep3 {
	
	String content ;
	public void driving(String c) 
 {
	  this.content=c;
	if (content.isEmpty())
	{
	  throw new NullPointerException("content is empty");
	}
	else 
	{
	  System.out.println("content=="+content);
	}
 }
	public static void main(String[] args) {
		Throw_excep3 dr = new Throw_excep3();
		dr.driving("");
	}

}
