package com.codeclan.projectHere.repositories;
import com.codeclan.projectHere.models.Establishment;
import com.codeclan.projectHere.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EstablishmentRepository extends JpaRepository<Establishment, Long> {

    @Transactional
    @Query(value = "SELECT * FROM establishments WHERE latitude = :latitude AND longitude= :longitude", nativeQuery = true)
    Establishment findEstablishment(@Param("latitude") double latitude, @Param("longitude") double longitude);


}
