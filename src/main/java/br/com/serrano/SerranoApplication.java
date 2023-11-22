package br.com.serrano;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SerranoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SerranoApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/areas").allowedOrigins("http://localhost:8080");
				registry.addMapping("/cargos").allowedOrigins("http://localhost:8080");
				registry.addMapping("/classes").allowedOrigins("http://localhost:8080");
				registry.addMapping("/especialidades").allowedOrigins("http://localhost:8080");
				registry.addMapping("/eventos").allowedOrigins("http://localhost:8080");
				registry.addMapping("/inventarios").allowedOrigins("http://localhost:8080");
				registry.addMapping("/requisitos").allowedOrigins("http://localhost:8080");
				registry.addMapping("/unidades").allowedOrigins("http://localhost:8080");
				registry.addMapping("/usuarios").allowedOrigins("http://localhost:8080");
			}
		};
	}
}
