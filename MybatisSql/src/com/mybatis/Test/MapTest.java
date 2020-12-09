	package com.mybatis.Test;
	
	import java.io.IOException;
	import java.io.Reader;
	import java.util.List;
	import org.apache.ibatis.io.Resources;
	import org.apache.ibatis.session.SqlSession;
	import org.apache.ibatis.session.SqlSessionFactory;
	import org.apache.ibatis.session.SqlSessionFactoryBuilder;
	import com.book.vo.School;
	import com.book.vo.Student;
	import com.book.vo.Teacher;
	import mapper.SchoolMap;
	
	
	public class MapTest {
	
		public static void main(String[] args) throws IOException {
			Reader read=Resources.getResourceAsReader("conf/mybatis.xml");
			SqlSessionFactory fc=new SqlSessionFactoryBuilder().build(read);
			SqlSession sqs=fc.openSession(true);
		/*	 BookMapper   books=sqs.getMapper(BookMapper.class);
			 Books book=new Books();
			 book.setBname("Ω°øµ»’¿˙2021");
			 Books  res=books.selectGetBooks(book);
			System.out.println(res);*/
			
			SchoolMap schools=sqs.getMapper(SchoolMap.class);
			School school=new School();
			school.setSchname("”¢Ã©“∆∂Ø");
			School s1=schools.getinfo(school);
			System.out.println(s1.getSchname());
			List<Teacher>  tea=s1.getTea();
			for (Teacher teacher : tea) {
				List<Student> stu=	teacher.getStu();
				System.out.println(teacher.getTname());
			for (Student stu1 : stu) {
				System.out.println(stu1.getSname());
				}
			}
		}
	
	}
	
