package de.trzpiot.bringyourbike.repository;

import de.trzpiot.bringyourbike.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
