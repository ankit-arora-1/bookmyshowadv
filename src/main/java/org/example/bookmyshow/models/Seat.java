package org.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    @ManyToOne
    private SeatType seatType;
    private String num;
    private int rowVal;
    private int colVal;
}
