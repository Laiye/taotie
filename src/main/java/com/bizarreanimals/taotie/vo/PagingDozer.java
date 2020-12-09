package com.bizarreanimals.taotie.vo;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class PagingDozer<T, K> extends Paging {
    public PagingDozer(Page<T> pageT, Class<K> kClass) {
        this.initPageParameters(pageT);

        List<T> tList = pageT.getContent();
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        List<K> voList = new ArrayList<>();
        tList.forEach(item -> {
            K vo = mapper.map(item, kClass);
            voList.add(vo);
        });
        this.setItems(voList);
    }
}
