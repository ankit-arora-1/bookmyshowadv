package org.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel {
    private SeatType seatType;
    private String num;
    private int rowVal;
    private int colVal;
}
