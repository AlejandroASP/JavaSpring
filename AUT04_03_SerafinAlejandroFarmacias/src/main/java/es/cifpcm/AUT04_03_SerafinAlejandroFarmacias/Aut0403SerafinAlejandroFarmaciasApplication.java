package es.cifpcm.AUT04_03_SerafinAlejandroFarmacias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Aut0403SerafinAlejandroFarmaciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Aut0403SerafinAlejandroFarmaciasApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer forwardToIndex() {
		return new WebMvcConfigurer() {

			public void addViewControllers(ViewControllerRegistry registry){
				registry.addViewController("/").setViewName("forward:/index2.html");
			}
		};

	}
}
