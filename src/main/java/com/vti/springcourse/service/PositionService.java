package com.vti.springcourse.service;


import com.vti.springcourse.repository.PositionRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionService {

    private static final Logger log = LoggerFactory.getLogger(PositionService.class);
    @Autowired
    private PositionRepository positionRepository;



    public void deletePosition(int positionId) {
        positionRepository.deleteById(positionId);
    }

    public void createNew(int positionId) {
        positionRepository.deleteById(positionId);
    }
}
