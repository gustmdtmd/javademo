package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/test.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("파일 삭제");
		}else {
			System.out.println("파일 없음");
		}
		
	}//main() end

}//class end


/*
 * java.awt.Frame
 * java.awt.event.ActionListener
 * 
 * import java.awt.*;
 * import java.awt.event.*;
 */