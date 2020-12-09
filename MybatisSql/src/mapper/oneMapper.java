package mapper;

import com.book.vo.Books;

public interface oneMapper {
	
	
	//实现一对一查询
	public Books selectBooksByBookss(String bname);

}
