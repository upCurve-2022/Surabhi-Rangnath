import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class Write_data_file {
    public static void main(String[] arg)

        throws IOException
        {
            int i;
            FileOutputStream fout = new FileOutputStream("D:\\demo.txt",true);
            String st = "TATA";
            char ch[] = st.toCharArray();
            for(i=0;i<st.length();i++)
            {
                fout.write(ch[i]);
            }
            fout.close();

        }
    }
