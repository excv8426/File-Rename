import java.io.File;

public class Filerename {
	static String dir="E:\\[Dymy] Watashi ga Motenai no wa Dou Kangaete mo Omaera ga Warui! 1-10 (BD 1920x1080 x264 FLAC)";

	public static void main(String[] args) {
		File file=new File(dir);
		String[] filenames=file.list(new SubFilenameFilter());
		
		for (int i = 0; i < filenames.length; i++) {
			System.out.println(filenames[i]);
		}
	}

}
