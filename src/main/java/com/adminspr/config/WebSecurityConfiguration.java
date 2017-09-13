package com.adminspr.config;



import com.adminspr.auth.handler.LoginSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author timothy
 * @created 17/9/13 下午14:49
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {


    /**
     * 不需要拦截处理的URI
     */
    public static final String[] IGNORE_URIS = {
            "/error/**",
            "/kaptcha/**",
            "/sysuser/getResourceByUserId",
            "/sysuser/findSysUserByEmailFromOther",
            "/deskuser/setDefaultGroup",
            "/deskuser/getTopResourceByUserId",
            "/resource/getAllResourceBySysId",
            "/auth/**",
            "/login",
            "/signin/**",
            "/**/*.jsp",
            "/signup/**"
    };

    public static final String[] IGNORE_RESOURCES = {
            "/static/**",
            "/components/**",
            "/images/**",
            "/**/*.css",
            "/**/*.png",
            "/**/*.gif",
            "/**/*.jpg",
            "/**/*.jsp",
            "/**/*.js",
            "/**/*.woff",
            "/**/*.eot",
            "/**/*.svg",
            "/**/*.ttf",
            "/**/*.woff2"
    };



//  @Autowired
//  private DataSource dataSource;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers(IGNORE_RESOURCES);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers(IGNORE_URIS).permitAll()
      .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .successHandler(loginSuccessHandler())//
                .and()
                .headers()
                .frameOptions()
                .disable()
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .permitAll()
                .invalidateHttpSession(true);
        http.csrf().disable();
//      .and()
//      .rememberMe()
//      .tokenValiditySeconds(1209600) //60*60*24*14
//      .tokenRepository(tokenRepository());

    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//        auth.eraseCredentials(false);
//    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(4);
    }


    @Bean
    public LoginSuccessHandler loginSuccessHandler() {
        return new LoginSuccessHandler();
    }

}
