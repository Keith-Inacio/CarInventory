import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

public class jparser {
	
	public static void main(String[] args) {
          
          Gson gson = new Gson();
          BufferedReader read = null;
          
          try {
          read=new BufferedReader(new FileReader("cars.json"));
          parsemethod tires = gson.fromJson(read, parsemethod.class);

          if(tires!=null)
        	  for(parsemethod sport : tires.getCars()) {
        		  System.out.println(sport.getId());
        		  System.out.println(sport.getMake());
        		  System.out.println(sport.getModel());
        		  System.out.println(sport.getYear());
        	  }
          
      }
      catch (IOException e) 
      {  
          e.printStackTrace();  
      } 
}
}


