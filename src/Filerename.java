import java.io.File;

public class Filerename {
	static String dir="E:\\[U2-RIP]Saki Achiga Hen Episode of Side-A";

	public static void main(String[] args) {
		File file=new File(dir);
		String[] subnames=file.list(new ExtensionFilter(".ass"));
		String[] videonames=file.list(new ExtensionFilter(".mkv"));
		String newname="";
		for (int i = 0; i < subnames.length; i++) {
			file=new File(dir+"\\"+subnames[i]);
			newname=videonames[i/2];
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
