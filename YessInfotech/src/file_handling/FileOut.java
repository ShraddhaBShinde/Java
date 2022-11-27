package file_handling;
import java.io.FileOutputStream;

public class FileOut {
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file.txt");
			fout.write(65);
			String s="Java Programming";
			byte b[]=s.getBytes(); //converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Success!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
