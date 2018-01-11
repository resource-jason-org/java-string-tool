package Run;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class compareLine 
{
    public static void main( String[] args )
    {
    	    String fileName="C:\\Users\\buzhidao\\Desktop\\24klog\\24k88\\24k88db1.logfiles\\var\\log\\messages";
    	    
    	    
       	    fileName.replaceAll("\\\\", "\\\\\\\\");
            File file = new File(fileName);
            BufferedReader reader = null;
            StringBuilder temp=new StringBuilder(); 
            try {
                reader = new BufferedReader(new FileReader(file));
                String tempString = null;
                int line = 1;
                // 一次读入一行，直到读入null为文件结束
                while ((tempString = reader.readLine()) != null) {
                    // 显示行号
                   // System.out.println("line " + line + ": " + tempString);
                	if(tempString.indexOf("start auto mail") !=-1){
	                    temp.append(tempString);
	                    temp.append("\n");
	                    line++;
                	}
                    
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e1) {
                    }
                }
            }
    	
           String S= temp.toString();
    	System.out.println(S);
    	
    	
    	
    }
    
    
}
