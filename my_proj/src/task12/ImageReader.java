package task12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageReader {

	public static void main(String[] args) throws IOException{
		try {
			FileInputStream fis = new FileInputStream("D:\\Images\\Anime Wallpaper\\AllMight.jpg");
			FileOutputStream fos = new FileOutputStream("D:\\newPic.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int x = 0;
			while(x != -1) {
				x = bis.read();
				bos.write(x);
			}
			bis.close();
			bos.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
