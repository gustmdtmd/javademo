package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Vector;

/*
 * [출력결과]
 */
public class Java183_Vector {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	}// main() end

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		Vector<Sawon> vt = new Vector<Sawon>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) {  //kim:56/78/12
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		return vt;
	}// lines() end

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하세요.
		for(Sawon sn : vt) {
			System.out.println(sn.toString());
		}
		
	}// prnDisplay() end

}// class end
