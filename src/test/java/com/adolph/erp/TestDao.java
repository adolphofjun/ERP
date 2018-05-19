package com.adolph.erp;


import org.springframework.context.annotation.Bean;

import java.util.List;


public interface TestDao {

    public List<Emp> findEmp();

}
