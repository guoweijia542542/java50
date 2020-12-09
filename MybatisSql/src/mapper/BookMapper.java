package mapper;

import java.util.List;

import com.book.vo.Books;

public interface BookMapper {

	
	public Books select(int bid);
	
	public int delete(int bid);
	
	public int  update(Books book);
	
	public int insert(Books book);
	//查询所有记录
	public List<Books> selectAll();
	
	// 实现模糊查询
	public List<Books> selectMuhu(Books book);
	
	public Books select();
	
	public Books selectGetBooks(Books book);
}
