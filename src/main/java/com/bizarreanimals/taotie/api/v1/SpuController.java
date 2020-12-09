package com.bizarreanimals.taotie.api.v1;

import com.bizarreanimals.taotie.bo.PageCounter;
import com.bizarreanimals.taotie.exception.http.NotFoundException;
import com.bizarreanimals.taotie.model.Spu;
import com.bizarreanimals.taotie.service.SpuService;
import com.bizarreanimals.taotie.util.CommonUtil;
import com.bizarreanimals.taotie.vo.PagingDozer;
import com.bizarreanimals.taotie.vo.SpuSimplifyVO;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/spu")
@Validated
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping("/id/{id}/detail")
    public Spu getDetail(@PathVariable @Positive Long id) {
        Spu spu = spuService.getSpu(id);
        if (spu == null) {
            throw new NotFoundException(30003);
        }
        return spu;
    }

    @GetMapping("/latest")
    public PagingDozer<Spu, SpuSimplifyVO> getLatestSpuList(@RequestParam(defaultValue = "0") Integer start,
                                                            @RequestParam(defaultValue = "10") Integer count) {
        PageCounter pageCounter = CommonUtil.convertToPageParameter(start, count);
        Page<Spu> page = this.spuService.getLatestPagingSpu(pageCounter.getPage(), pageCounter.getCount());

        return new PagingDozer<>(page, SpuSimplifyVO.class);

//        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
//        List<SpuSimplifyVO> vos = new ArrayList<>();
//        spuList.forEach( s -> {
//            SpuSimplifyVO vo = mapper.map(s, SpuSimplifyVO.class);
//            vos.add(vo);
//        });
//        return vos;
    }

    @GetMapping("/id/{id}/simplify")
    public SpuSimplifyVO getSimplifySpu(@PathVariable @Positive Long id) {
        Spu spu = this.spuService.getSpu(id);
        SpuSimplifyVO vo = new SpuSimplifyVO();
        BeanUtils.copyProperties(spu, vo);
        return vo;
    }
}
