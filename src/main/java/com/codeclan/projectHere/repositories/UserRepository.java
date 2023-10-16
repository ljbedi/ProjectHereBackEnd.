package com.codeclan.projectHere.repositories;
import com.codeclan.projectHere.models.Establishment;
import com.codeclan.projectHere.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u.checked_ins FROM User u WHERE u.id = :id")

    List<Establishment> findAllCheckedInsById(@Param("id") Long id);
}
