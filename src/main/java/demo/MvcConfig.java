package demo;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
	@Bean
	public ResourceBundleViewResolver viewResolver(){
		ResourceBundleViewResolver resolver = new ResourceBundleViewResolver();
		resolver.setOrder(1);
		resolver.setBasename("views");
		return resolver;
	}
	
	
    
    

}
