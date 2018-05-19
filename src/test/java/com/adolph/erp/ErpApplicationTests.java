package com.adolph.erp;

import org.hibernate.boot.jaxb.SourceType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {

	@Resource
	TestDao testDao;

	@Test
	public void contextLoads() {


		List<Emp> empList = testDao.findEmp();
		for(Emp emp :empList){
			if(emp!=null)
			System.out.println("======================="+emp.getName());
		}


	}

}
