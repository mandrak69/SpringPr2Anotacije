package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import main.Main;

@Configuration
@ComponentScan({"dao.impl","service","model"})
public class AppConfig {
	 @Bean(name="main")
	    public Main getMain() {
	    	return new Main();
	    	
	    }

  

}
