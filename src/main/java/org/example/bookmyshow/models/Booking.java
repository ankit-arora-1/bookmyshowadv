package org.example.bookmyshow.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel {
    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeats;
    private User user;
    private int totalAmount;
    private Date bookedAt;
    private Show show;
    private List<Payment> payments;
}
