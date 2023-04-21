package com.example.legacyauthorizationsever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LegacyAuthorizationSeverApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegacyAuthorizationSeverApplication.class, args);
    }

}



// URL
//localhost:8080/oauth/authorize?response_type=code&client_id=client&scope=read



//curl -v -XPOST -u client:secret "http://localhost:8080/oauth/token?grant_type=password&username=Re&password=12345&scope=read"

// with authorization_code
// curl -v -XPOST -u client:secret "http://localhost:8080/oauth/token?grant_type=authorization_code&scope=read&code=l588ER"

//curl -v -XPOST -u client2:secret2 "http://localhost:8080/oauth/token?grant_type=authorization_code&scope=read&code=ZwkmR8"