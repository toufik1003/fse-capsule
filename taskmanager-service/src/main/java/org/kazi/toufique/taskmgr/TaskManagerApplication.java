package org.kazi.toufique.taskmgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.kazi.toufique.taskmgr" })
@EnableJpaRepositories(basePackages = "org.kazi.toufique.taskmgr.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "org.kazi.toufique.taskmgr.model")
public class TaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerApplication.class, args);
	}

}
