package chao.tan.liu.config;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
 
/**
 * @ClassName WebMvc
 * @Description 表现层配置
 * @author Cheng.Wei
 * @date 2017年12月9日 上午0:40:00
 * 实现 {@link org.springframework.web.servlet.config.annotation.WebMvcConfigurer}
 */
//这是注解配置 和 xml会冲突
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "chao.tan.liu.*",includeFilters= {@ComponentScan.Filter(type=FilterType.ANNOTATION, value= {org.springframework.stereotype.Controller.class})})
public class WebMvc extends WebMvcConfigurerAdapter {
	protected static final Logger logger = LogManager.getLogger(WebMvc.class);
	 	
	@Bean
	public LocalValidatorFactoryBean validator() {
		logger.debug("LocalValidatorFactoryBean");
		return new LocalValidatorFactoryBean();
	}
	@Bean
	public BeanNameViewResolver beanNameViewResolver() {
		logger.debug("BeanNameViewResolver");
		return new BeanNameViewResolver();
	}
	@Bean
	public MappingJackson2JsonView jsonView() {
		logger.debug("MappingJackson2JsonView");
		MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
		mappingJackson2JsonView.setContentType("text/html;charset=UTF-8");
		return mappingJackson2JsonView;
	}
	/**激活静态资源处置策略*/
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}