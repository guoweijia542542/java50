package mapper;

import java.util.List;

import com.book.vo.Books;

public interface BookMapper {

	
	public Books select(int bid);
	
	public int delete(int bid);
	
	public int  update(Books book);
	
	public int insert(Books book);
	//��ѯ���м�¼
	public List<Books> selectAll();
	
	// ʵ��ģ����ѯ
	public List<Books> selectMuhu(Books book);
	
	public Books select();
	
	public Books selectGetBooks(Books book);
}
