import java.io.File;
import java.io.FilenameFilter;

public class ExtensionFilter implements FilenameFilter {
	private String extension="";
	@Override
	public boolean accept(File dir, String name) {
		int i=name.lastIndexOf(".");
		if (i<0) {
			return false;
		} else {
			if (name.substring(i).equals(extension)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public ExtensionFilter(String ext){
		this.extension=ext;
	}
}
