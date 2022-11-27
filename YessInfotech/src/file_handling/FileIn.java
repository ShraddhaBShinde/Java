package file_handling;
import java.io.FileInputStream;
import java.io.IOException;

//byteinput
public class FileIn {
	public static void main(String args[]) throws IOException, InterruptedException
	{
		int i;
		FileInputStream fin=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file.txt");
		while((i=fin.read())!=-1)
		{
			Thread.sleep(300);
			System.out.print((char)i);
		}
		fin.close();
	}
}
