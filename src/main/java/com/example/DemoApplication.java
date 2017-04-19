package com.example;

import com.example.config.AuthorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Value("${book.author}")
    private String bookAuthor;

    @Autowired
    private AuthorProperties authorSettings;


    @RequestMapping("/")
    String index(){
//        return "book name is " + bookAuthor;
        System.out.println(authorSettings);
        System.out.println(authorSettings.getAge());
        System.out.println(authorSettings.getName());
        return "author name is " + authorSettings.getName() + " " + authorSettings.getAge();
    }

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

        /**
         * 去掉banner标志
         */
//        SpringApplication app = new SpringApplication(DemoApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);

	}
}
