package Run;

/**
 * Hello world!
 *
 */
public class App 
{
	String pass="";
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        new App().md5Pass(1);
    }
    
    
    
   
    public String md5Pass(int count){
    	String p="";
    	
    	  for(int i=(int)'a';i<'a'+26;i++)
    	  {
    		  System.out.println(" "+(char)i);
   	       
   	       if(count > 0 ){
   	    	   p+=this.md5Pass(count-1);   
   	       }
   	 	  
    	  }	
    
    	  
    	return p;
    }
    
    
    public String md5Passp(int count){
    	String p="";
    	
    	p=" "+(char)count;
    	
    	return p;
    } 
}
