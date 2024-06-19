package org.example.bookmyshow.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends BaseModel {
    private String name;
    private String password;
    private String email;
    private List<Booking> bookings;

    // Break for 8 minutes: 8:22 -> 8:30
}
