package com.newlecture.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
//import org.springframework.web.servlet.view.

@Configuration
public class TilesConfig {
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer titlesConfigurer = new TilesConfigurer();
		titlesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles.xml"});
		titlesConfigurer.setCheckRefresh(true);
		
		return titlesConfigurer;
	}
	
	@Bean
	public TilesViewResolver tilesViewResoler() {
		TilesViewResolver viewResolver = new TilesViewResolver();
		viewResolver.setViewClass(TilesView.class);
		viewResolver.setOrder(1);
		
		return viewResolver;
	}
}
