package org.example.bookmyshow.repositories;

import org.example.bookmyshow.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Override
    Optional<Booking> findById(Long aLong);

    @Override
    Booking save(Booking booking);
}
