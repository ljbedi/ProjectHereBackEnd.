package com.codeclan.projectHere.repositories;

import com.codeclan.projectHere.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long>
{
}
