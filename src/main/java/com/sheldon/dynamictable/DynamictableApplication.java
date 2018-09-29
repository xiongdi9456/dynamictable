package com.sheldon.dynamictable;

import com.sheldon.dynamictable.common.MyMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@EnableTransactionManagement
@MapperScan(basePackages = "com.sheldon.dynamictable.dao",markerInterface = MyMapper.class)
public class DynamictableApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamictableApplication.class, args);
	}
}
