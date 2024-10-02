package com.example.finalProject.service;

import com.example.finalProject.dto.MiddleDTO;
import com.example.finalProject.entity.MiddleEntity;
import com.example.finalProject.repository.MiddleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MiddleService {
    private final MiddleRepository middleRepository;

    public List<MiddleDTO> findByRef(int ref){
        List<MiddleEntity> me = middleRepository.findByRef(ref);
        List<MiddleDTO> dto = new ArrayList<>();
        me.forEach(item->dto.add(item.toDTO()));
        return dto;

    }
}
