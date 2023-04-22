package com.projects.expenseTracker.configurations;

// import java.util.List;

// import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// import org.springframework.web.filter.CorsFilter;

@Configuration
public class ProjectConfigurations {
    
//     @Bean
//     public FilterRegistrationBean corsFilter() {
//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

//         CorsConfiguration config = new CorsConfiguration();
//         // Headers which will be allowed by the server
//         config.addAllowedHeader("Accept");
//         config.addAllowedHeader("Connection");
//         config.addAllowedHeader("Authorization");
//         config.addAllowedHeader("Content-type");
//         // Methods which will be allowed by the server 
//         config.setAllowedMethods(List.of("GET","POST", "DELETE", "PUT", "OPTIONS"));
//         // Allowing all the origin patterns
//         config.addAllowedOriginPattern("*");
//         /**
//          * Whether the browser should send credentials, such as cookies along with
//          * cross domain requests, to the annotated endpoint. The configured value is
//          * set on the {@code Access-Control-Allow-Credentials} response header of
//          * preflight requests.
//          * <p>
//          * <strong>NOTE:</strong> Be aware that this option establishes a high
//          * level of trust with the configured domains and also increases the surface
//          * attack of the web application by exposing sensitive user-specific
//          * information such as cookies and CSRF tokens.
//          * <p>
//          * By default this is not set in which case the
//          * {@code Access-Control-Allow-Credentials} header is also not set and
//          * credentials are therefore not allowed.
//          */
//         config.setAllowCredentials(true);

//         /*
//         * The list of allowed origins that be specific origins, e.g.
//         * {@code "http://domain1.com"}, or {@code "*"} for all origins.
//         * <p>A matched origin is listed in the {@code Access-Control-Allow-Origin}
//         * response header of preflight actual CORS requests.
//         * <p>By default, all origins are allowed.
//         * <p><strong>Note:</strong> CORS checks use values from "Forwarded"
//         * (<a href="http://tools.ietf.org/html/rfc7239">RFC 7239</a>),
//         * "X-Forwarded-Host", "X-Forwarded-Port", and "X-Forwarded-Proto" headers,
//         * if present, in order to reflect the client-originated address.
//         * Consider using the {@code ForwardedHeaderFilter} in order to choose from a
//         * central place whether to extract and use, or to discard such headers.
//         * See the Spring Framework reference for more on this filter.
//         *
//         *   public CorsRegistration allowedOrigins(String... origins) {
//         *       this.config.setAllowedOrigins(Arrays.asList(origins));
//         *       return this;
//         *   }
//         *
//         */

//         source.registerCorsConfiguration("/*", config);

//         FilterRegistrationBean<CorsFilter> filter = new FilterRegistrationBean<>(new CorsFilter(source));
//         return filter;
//     }

}
