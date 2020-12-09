package com.bizarreanimals.taotie.service;

import com.bizarreanimals.taotie.model.Spu;
import com.bizarreanimals.taotie.repository.SpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpuService {

    @Autowired
    private SpuRepository spuRepository;

    public Spu getSpu(Long id) {
        return spuRepository.findOneById(id);
    }

    public Page<Spu> getLatestPagingSpu(Integer pageNum, Integer size) {
        Pageable page = PageRequest.of(pageNum, size, Sort.by("createTime").descending());
        return this.spuRepository.findAll(page);
    }
}
