package org.example.bookmyshow.services;

import org.example.bookmyshow.models.Booking;
import org.example.bookmyshow.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingService {

    private BookingRepository bookingRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;

    public BookingService(
            BookingRepository bookingRepository,
            ShowRepository showRepository,
            ShowSeatRepository showSeatRepository,
            UserRepository userRepository
    ) {
        this.bookingRepository = bookingRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, List<Long> seatIds, Long showId) {
        /*-----Start trx here for today-------
        * 1. Get user from the DB using userID
        * 2. Get show from the DB using showID
        * -------Transaction----------
        * 3. Get showseat from DB using showseatIDs
        * 4. Check if they are available
        * 5. If not, throw error
        * 6. If yes, update status to locked
        * 7. save to the DB
        * -------End Transaction----------
        * 8. Create the booking object and set the attributes
        * 9. Return to controller
        * ------end trx here today-------
        * */

        return null;
    }
}
