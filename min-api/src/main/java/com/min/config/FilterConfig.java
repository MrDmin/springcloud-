package com.min.config;


import com.min.utils.TimeFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean setTimeFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TimeFilter());
        registrationBean.addUrlPatterns();
        registrationBean.setName("TimeFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
