package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.TypeAccess;
import org.springframework.nativex.hint.TypeHint;

@TypeHint(types = org.apache.catalina.servlets.DefaultServlet.class, 
access= {TypeAccess.DECLARED_METHODS, 
        TypeAccess.DECLARED_FIELDS, 
        TypeAccess.DECLARED_CONSTRUCTORS, 
        TypeAccess.PUBLIC_METHODS,
        TypeAccess.PUBLIC_FIELDS,
        TypeAccess.PUBLIC_CONSTRUCTORS,
        TypeAccess.QUERY_DECLARED_CONSTRUCTORS,
        TypeAccess.QUERY_DECLARED_METHODS,
        TypeAccess.QUERY_PUBLIC_CONSTRUCTORS,
        TypeAccess.QUERY_PUBLIC_METHODS}               
)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
