package com.bizarreanimals.taotie.repository;

import com.bizarreanimals.taotie.model.Spu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpuRepository extends JpaRepository<Spu, Long> {
    Spu findOneById(Long id);
}
