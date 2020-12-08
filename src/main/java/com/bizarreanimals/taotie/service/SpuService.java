package com.bizarreanimals.taotie.service;

import com.bizarreanimals.taotie.model.Spu;
import com.bizarreanimals.taotie.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpu(Long id) {
        return spuRepository.findOneById(id);
    }

    public List<Spu> getLatestPagingSpu() {
        return this.spuRepository.findAll();
    }
}
