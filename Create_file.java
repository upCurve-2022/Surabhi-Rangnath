import java.io.*;

public class Create_file {
    public static void main(String[] args)
    {

        File file = new File("D:\\demo.txt");
        boolean result;
        try
        {
            result = file.createNewFile();
            if(result)
            {
                System.out.println("The file is created " + file.getCanonicalPath());
            }
            else
            {
                System.out.println("file already exists.");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
