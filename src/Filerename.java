import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

public class Filerename {
	static String dir="D:\\train-image";
	static boolean singlesub=true;
	
	public static void main(String[] args) {
		renameUUID();
		/*File file=new File(dir);
		String[] subnames=file.list(new ExtensionFilter(".ass"));
		String[] videonames=file.list(new ExtensionFilter(".mkv"));
		String newname="";
		for (int i = 0; i < subnames.length; i++) {
			file=new File(dir+"\\"+subnames[i]);
			newname=videonames[i];
			if (singlesub) {
				newname=dir+"\\"+newname.replace(".mkv", ".ass");
				System.out.println("oldname:"+file.getName()+"-newname:"+newname);
				System.out.println(file.renameTo(new File(newname)));
				System.out.println(newname);
			} else {
				if (i%2==0) {
					newname=dir+"\\"+newname.replace(".mkv", ".sc.ass");
					System.out.println(file.renameTo(new File(newname)));
					System.out.println(newname);
				} else {
					newname=dir+"\\"+newname.replace(".mkv", ".tc.ass");
					System.out.println(file.renameTo(new File(newname)));
					System.out.println(newname);
				}
			}			
		}*/
	}
	
	public static void renameUUID(){
		File rootfile=new File(dir);
		File[] files=rootfile.listFiles();
		String extname;
		for (File file : files) {
			extname=file.getName().substring(file.getName().lastIndexOf(".")+1);
			System.out.println(extname);
			if (extname.equals("jpeg")) {
				extname="jpg";
				file.renameTo(new File(dir+File.separatorChar+UUID.randomUUID().toString()+"."+extname));
			} else if (extname.equals("png")) {
				png2jpg(file);
			}
			
		}
	}
	
	
	public static void png2jpg(File pngFile) {
		BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(pngFile);
			BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
			newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);
			ImageIO.write(newBufferedImage, "jpg", new File("D:\\pngs\\"+UUID.randomUUID().toString()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

		   

}
