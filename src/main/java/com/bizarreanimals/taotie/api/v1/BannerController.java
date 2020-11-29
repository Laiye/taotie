package com.bizarreanimals.taotie.api.v1;

import com.bizarreanimals.taotie.dto.PersonDTO;
import com.bizarreanimals.taotie.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {

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
    public String testParameterPath(@PathVariable Integer id, @RequestParam String name) {
        return "testParameter";
    }

    @PostMapping("/test/parameter/body")
    public String testParameterBody(@RequestBody PersonDTO person) {
        return "testParameterBody";
    }
}
