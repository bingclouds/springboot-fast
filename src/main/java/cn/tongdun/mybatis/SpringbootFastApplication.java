package cn.tongdun.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement    //开启事务注解
@MapperScan("cn.tongdun.mybatis.dao")
public class SpringbootFastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFastApplication.class, args);
	}

}

