package org.example.bookmyshow;

import org.example.bookmyshow.controllers.BookingController;
import org.example.bookmyshow.controllers.UserController;
import org.example.bookmyshow.dtos.SignUpRequestDto;
import org.example.bookmyshow.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.awt.print.Book;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication implements CommandLineRunner {

    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDto requestDto = new SignUpRequestDto();
        requestDto.setEmail("vishal1@gmail.com");
        requestDto.setPassword("abc123");

        userController.signUp(requestDto);
    }
}
