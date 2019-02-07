package com.annie.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity // 开启 security
public class MySecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    MyUserDetailsService myUserDetailsService;


    // 定制 http 的安全规则
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                // 定制请求的授权规则
                .authorizeRequests()
                // 这些路径所有人都可以访问
                .antMatchers("/").permitAll()
                // 这些路径必须要有  角色  才能访问
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");


        // 开启自动配置的登录功能
        http.formLogin().successForwardUrl("/").loginPage("/userlogin").loginProcessingUrl("/login");

        // 开启自动配置的注销功能  // 注销成功以后去的位置
        http.logout().logoutSuccessUrl("/");

        // 开启自动 记住我 功能
        // 自动保存 cookie 注销后会自动删除 cookie
        http.rememberMe();

    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//        auth
//                // 添加一个用户                     用户账号                    用户密码             用户角色
//                .inMemoryAuthentication().withUser("zhangsan").password("123").roles("VIP1", "VIP3");
//
//
//        auth
//                .inMemoryAuthentication().withUser("lisi").password("123").roles("VIP2");


    }
}
