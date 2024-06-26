package org.example.bookmyshow.services;

import org.example.bookmyshow.models.Show;
import org.example.bookmyshow.models.ShowSeat;
import org.example.bookmyshow.models.ShowSeatType;
import org.example.bookmyshow.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(Show show, List<ShowSeat> showSeats) {
        List<ShowSeatType> showSeatTypes = showSeatTypeRepository
                .findAllByShow(show);

        int amount = 0;
        for(ShowSeat showSeat: showSeats) { // ShowSeats selected by the user
          for(ShowSeatType showSeatType: showSeatTypes) { // All showseattypes that exist in the show
             if(showSeat.getSeat().getSeatType().equals(showSeatType.getShowSeatType())) {
                 amount += showSeatType.getPrice();
             }
          }
        }

        return amount;
    }
}
