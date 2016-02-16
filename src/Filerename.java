import java.io.File;

public class Filerename {
	static String dir="E:\\[Dymy] Watashi ga Motenai no wa Dou Kangaete mo Omaera ga Warui! 1-10 (BD 1920x1080 x264 FLAC)";

	public static void main(String[] args) {
		File file=new File(dir);
		String[] subnames=file.list(new ExtensionFilter(".ass"));
		String[] videonames=file.list(new ExtensionFilter(".mkv"));
		String newname="";
		for (int i = 0; i < subnames.length; i++) {
			file=new File(subnames[i]);
			newname=videonames[i/2];
			if (i%2==0) {
				file.renameTo(new File(newname.replace(".mkv", "jp.ass")));
			} else {
				file.renameTo(new File(newname.replace(".mkv", "sc.ass")));
			}
		}
	}

}
