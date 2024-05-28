package com.rentify.repository;

import com.rentify.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByUserId(Long userId);
}
