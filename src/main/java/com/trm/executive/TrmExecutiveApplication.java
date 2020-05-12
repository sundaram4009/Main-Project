package com.trm.executive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.trm.executive")
@SpringBootApplication
public class TrmExecutiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrmExecutiveApplication.class, args);
	}

}
