package org.example.bookmyshow.controllers;

import org.example.bookmyshow.dtos.BookMovieRequestDto;
import org.example.bookmyshow.dtos.BookMovieResponseDto;
import org.example.bookmyshow.dtos.ResponseStatus;
import org.example.bookmyshow.models.Booking;
import org.example.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto requestDto) {
        BookMovieResponseDto responseDto = new BookMovieResponseDto();
        Booking booking;
        try {
            booking = bookingService.bookMovie(
                    requestDto.getUserId(),
                    requestDto.getShowSeatsIds(),
                    requestDto.getShowId()
            );

            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setAmount(booking.getTotalAmount());
            responseDto.setBookingId(booking.getId());
        } catch (Exception ex) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
