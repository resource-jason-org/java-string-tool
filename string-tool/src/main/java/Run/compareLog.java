package Run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tool.RederTool;

public class compareLog {

	public static void main(String[] args) {
		   
		   String fileName = "C:\\Users\\buzhidao\\Desktop\\24klog\\24k88\\24k88db1.logfiles\\var\\www\\24k88\\Global.debug.xml";
		 //  C:\Users\buzhidao\Desktop\24klog\24k88\24k88db1.logfiles\var\www\24k88\Global.debug.xml
		   String str=RederTool.readFileByLines(fileName);
		    //System.out.println(str);
		   // System.exit(0);
		    Pattern p = Pattern.compile("REQUEST Trance(.*?)REQUEST Trance END",Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		        Matcher m = p.matcher(str);
		        ArrayList<String> strs = new ArrayList<String>();
		        //System.out.println(m.find());
		        while (m.find()) {
//		        	System.out.println("=========================");
//		        	System.out.println(m.group(1));
//		        	System.out.println("=========================");
		            strs.add(m.group(1));            
		        } 
		        Map<String,String> map=new HashMap<String,String>();  
		        Map<String,String> mapju=new HashMap<String,String>();  
		        for (String s : strs){
		        	if(s.indexOf("'m' => 'Moneyout',")!=-1 && (s.indexOf("'a' => 'operate',") !=-1 
		        			//|| s.indexOf("'a' => 'operate',") !=-1
		        			)){  
		        		
		        		Matcher z=Pattern.compile("\\'id=(.*?)&check=1\\'").matcher(s);
		        		if(z.find()){
		        			//System.out.println(z.group(1));
		        			//System.out.println("operate ============");
		        			//System.out.println(z.group(1));
		        			map.put(z.group(1),"1");
		        		}
		        		//System.out.println(Pattern.compile("'id=(.*?)'").matcher(s).group(1));
			        	//System.out.println("=========================");
			        	//System.out.println(s);
			        	//System.out.println("=========================");
		        	}
		        } 
		      
		      for (String s : strs){
		      	if(s.indexOf("'m' => 'Moneyout',")!=-1 && (s.indexOf("'a' => 'ju',") !=-1 
		      			//|| s.indexOf("'a' => 'operate',") !=-1
		      			)){  
		      		Matcher z=Pattern.compile("\\'id=(.*?)&check=1\\'").matcher(s);
		      		if(z.find()){
		      			//System.out.println(z.group(1));
		      			//System.out.println(z.group(1));
		      			//map.put(z.group(1),"1");
		        			//System.out.println("ju ============");
		        			///System.out.println(z.group(1));
		        			mapju.put(z.group(1),"1");
		      		}
		      		//System.out.println(Pattern.compile("'id=(.*?)'").matcher(s).group(1));
			        //System.out.println("=========================");
			        //System.out.println(s);
			        //System.out.println("=========================");
		      	}
		      } 
      
		        for (String s : strs){
		        	if(s.indexOf("'m' => 'Moneyout',")!=-1 && (s.indexOf("'a' => 'shen',") !=-1 
		        			//|| s.indexOf("'a' => 'operate',") !=-1
		        			)){  
		        		Matcher z=Pattern.compile("\\'id=(.*?)&check=1\\'").matcher(s);
		        		if(z.find()){
		        			//System.out.println("shen ============");
		        			//System.out.println(z.group(1));
		        			//map.put(z.group(1),"1");
		        		 	if(!map.containsKey(z.group(1)) && !mapju.containsKey(z.group(1))){
		        				System.out.println(z.group(1));
		        			}
		        		}
		        		//System.out.println(Pattern.compile("'id=(.*?)'").matcher(s).group(1));
			        //	System.out.println("=========================");
			        	//System.out.println(s);
			        	//System.out.println("=========================");
		        	}
		        } 
	}
}
