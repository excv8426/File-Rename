import java.io.File;

public class Filerename {
	static String dir="C:\\[VCB-Studio] Kantai Collection [Ma10p_1080p]";
	static boolean singlesub=true;
	
	public static void main(String[] args) {
		File file=new File(dir);
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
		}
	}

}
