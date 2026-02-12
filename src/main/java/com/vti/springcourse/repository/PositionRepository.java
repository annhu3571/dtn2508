package com.vti.springcourse.repository;

import com.vti.springcourse.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
