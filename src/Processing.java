import java.io.*;
import java.lang.*;
public class Processing {
	
	// function for reading the text file
	private void readFile(String filePath) {
		try
        {
            String encoding = "GBK"; // text file encoding format
            File file = new File(filePath);
            if (file.isFile() && file.exists())
            { // check if the file exists
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                while ((lineTxt = bufferedReader.readLine()) != null)
                {
                	//processing after reading each line
                	split(lineTxt);
                }
                bufferedReader.close();
                read.close();
            }
            else
            {
                System.out.println("Can not find the file"); //can not find file message
            }
        }
        catch (Exception e)
        {
            System.out.println("Errors while reading the file"); //error message
            e.printStackTrace();
        }
	}
	
	//function to split each line into data elements
	private void split(String line) {
		String[] Array = line.split("\\,") ;
		for(String s : Array){
			
		}
	}
}
