package project_01;

import java.util.HashMap;
import java.util.List;

public class BookController {
	private BookDAO dao;
	
	public BookController() {
		dao = BookDAO.getInstance();
	}
	
	public int insertProcess(BookDTO dto) {
		return dao.insertMethod(dto);
	}//end insertProcess()
	
	public List<BookDTO> listProcess(){
		return dao.listMethod();
	}//end listProcess()
	
	public List<BookDTO> searchProcess(String title){
		return dao.searchMethod(title);
	}//end searchProcess
	
	public int deleteProcess(int num) {
		return dao.deleteMethod(num);
	}//end deleteProcess
	
	public int updateProcess(HashMap<String, Object> hmap) {
		return dao.updateMethod(hmap);
	}//end updateProcess()
}//end class
