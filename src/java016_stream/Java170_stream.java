package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java170_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/song.txt");

		RandomAccessFile raf = null;
		String stn = new String("\r\nMoron 5 - Daylight, Sunday Morning \r\n");

		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer()); // 0

			long size = raf.length();
			// song.txt파일의 총 길이를 리턴한다.
			raf.seek(size);
			// 파일 대상에 데이터를 보낸다.
			raf.writeBytes(stn);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}// main() end

}// class end
