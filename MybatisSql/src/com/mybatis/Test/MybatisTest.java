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
				
		//1.����ȫ�������ļ�
			Reader read=Resources.getResourceAsReader("conf/mybatis.xml");
		//2.����sqlsessionFacory
			SqlSessionFactory fc=new SqlSessionFactoryBuilder().build(read);
		//3.����sqlsession����(����)
			SqlSession sqs=fc.openSession(true);
		//��ȡ�ӿ�
			//��ѯ
			/*BookMapper  book=sqs.getMapper(BookMapper.class);
			Books bookes=book.select(3);
		System.out.println(bookes.getBname());*/
			
			//�޸�
			BookMapper  book=sqs.getMapper(BookMapper.class);
			Books bookone= new Books();
			/*bookone.setBid(3);
			bookone.setBname("������");
			bookone.setBauthor("С��");
			bookone.setBdesc("�ܺÿ���");
			int res=book.update(bookone);
			if(res>=0) {
				System.out.println("�޸ĳɹ�");
			}else {
				System.out.println("�޸�ʧ��");
			}*/
			//ɾ��
			/* int row=book.delete(3);
			 if(row>=0) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("ɾ��ʧ��");
				}*/
		//���
			/*bookone.setBid(7);
			bookone.setBname("������");
			bookone.setBauthor("С��");
			bookone.setBdesc("�ܺÿ���");
			int ress=book.insert(bookone);
			if(ress>=0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}*/
			//��ѯ����
			/*List<Books> lis=book.selectAll();
			System.out.println(lis.size());*/
			/*bookone.setBid(7);
			List<Books> resss= book.selectMuhu(bookone);
			System.out.println(resss.size());*/
			bookone.setBname("��������2021 ");
			Books  one=book.selectGetBooks(bookone);
			System.out.println(one);
	}
}
