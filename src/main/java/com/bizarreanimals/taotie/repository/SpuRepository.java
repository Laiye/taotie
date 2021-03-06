package com.bizarreanimals.taotie.repository;

import com.bizarreanimals.taotie.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRepository extends JpaRepository<Spu, Long> {
    Spu findOneById(Long id);
    Page<Spu> findByCategoryIdOrderByCreateTimeDesc(Long cid, Pageable pageable);
    Page<Spu> findByRootCategoryIdOrderByCreateTimeDesc(Long cid, Pageable pageable);
}
