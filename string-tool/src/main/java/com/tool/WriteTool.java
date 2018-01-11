package com.tool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteTool 
{
    public static int writeFile(String insertSql,String filepath){
    	FileOutputStream fop = null;
    	File file = new File(filepath);
	     // get the content in bytes
	    byte[] contentInBytes = insertSql.getBytes();
	    try {
			fop = new FileOutputStream(file,true);
		    file.createNewFile();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			return 1;
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		 }
    }
}
