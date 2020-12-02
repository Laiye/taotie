package com.bizarreanimals.taotie.api.v1;

import com.bizarreanimals.taotie.dto.PersonDTO;
import com.bizarreanimals.taotie.exception.http.NotFoundException;
import com.bizarreanimals.taotie.model.Banner;
import com.bizarreanimals.taotie.service.BannerService;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/v1/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    /**
     * 测试自定义异常及统一消息处理
     * @return
     */
    @GetMapping("/test")
    public String test() {
//        return "Hello, 奥利奥";
        throw new NotFoundException(10000);
    }

    /**
     * 测试URL参数传递
     * {id} 路径参数 @PathVariable
     * ？name=abc 查询参数 @RequestParam
     * @return
     */
    @GetMapping("/test/parameter/path/{id}")
    public String testParameterPath(@PathVariable @Range(min = 1, max = 10) Integer id, @RequestParam String name) {
        return "testParameter";
    }

    @PostMapping("/test/parameter/body")
    public PersonDTO testParameterBody(@RequestBody @Validated PersonDTO person) {
        PersonDTO dto = new PersonDTO();
        dto.setAge(18);
        dto.setName("你猜呢");
        return dto;
    }

    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable @NotBlank String name) {
        Banner banner = bannerService.getByName(name);
        return banner;
    }
}
