package com.mybatis.Test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.book.vo.Books;
import mapper.BookMapper;

public class MybatisTest {

	public static void main(String[] args) throws IOException {
				
		//1.加载全局配置文件
			Reader read=Resources.getResourceAsReader("conf/mybatis.xml");
		//2.创建sqlsessionFacory
			SqlSessionFactory fc=new SqlSessionFactoryBuilder().build(read);
		//3.创建sqlsession对象(核心)
			SqlSession sqs=fc.openSession(true);
		//获取接口
			//查询
			/*BookMapper  book=sqs.getMapper(BookMapper.class);
			Books bookes=book.select(3);
		System.out.println(bookes.getBname());*/
			
			//修改
			BookMapper  book=sqs.getMapper(BookMapper.class);
			Books bookone= new Books();
			/*bookone.setBid(3);
			bookone.setBname("长生殿");
			bookone.setBauthor("小郭");
			bookone.setBdesc("很好看的");
			int res=book.update(bookone);
			if(res>=0) {
				System.out.println("修改成功");
			}else {
				System.out.println("修改失败");
			}*/
			//删除
			/* int row=book.delete(3);
			 if(row>=0) {
					System.out.println("删除成功");
				}else {
					System.out.println("删除失败");
				}*/
		//添加
			/*bookone.setBid(7);
			bookone.setBname("长生殿");
			bookone.setBauthor("小郭");
			bookone.setBdesc("很好看的");
			int ress=book.insert(bookone);
			if(ress>=0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}*/
			//查询所有
			/*List<Books> lis=book.selectAll();
			System.out.println(lis.size());*/
			/*bookone.setBid(7);
			List<Books> resss= book.selectMuhu(bookone);
			System.out.println(resss.size());*/
			bookone.setBname("健康日历2021 ");
			Books  one=book.selectGetBooks(bookone);
			System.out.println(one);
	}
}
