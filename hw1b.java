import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hw1b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  FileReader f = new FileReader(args[0]);
	      BufferedReader br = new BufferedReader(f);

	        
	        String line;
	        List<String> list= new ArrayList<String>();

	        while ((line = br.readLine()) != null) {
	        	list.add(line);        	
	        }
	        
	        for(int i=list.size()-1;i>=0;i--){
	        	
	        	System.out.print(list.get(i)+"\n");
	        }

	}

}
