package com.dbconnectivity.dbconnectivity;

import com.dbconnectivity.dbconnectivity.dou.MyDou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbconnectivityApplication {

//	@Autowired
//	MyDou myDou;

	public static void main(String[] args) {
		SpringApplication.run(DbconnectivityApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// this.myDou.createTable();
//		// this.myDou.insertValue(2, "Dev");
//	}
}
