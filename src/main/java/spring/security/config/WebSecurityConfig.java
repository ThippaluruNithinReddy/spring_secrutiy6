package spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.csrf(csrf -> csrf.disable())
	        .authorizeHttpRequests(
	        		request -> request.requestMatchers("register").permitAll()
	        		.anyRequest().authenticated()
	         )
	        .formLogin(Customizer.withDefaults())
	        .httpBasic(Customizer.withDefaults());
			
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService(){
		UserDetails nithin = User.withUsername("nithin")
								.password("{noop}nithin")
								.roles("USER")
								.build();
		UserDetails pradeep = User.withUsername("pradeep")
				.password("{noop}pradeep")
				.roles("USER")
				.build();
		
		return new InMemoryUserDetailsManager(nithin,pradeep);
	}
}
