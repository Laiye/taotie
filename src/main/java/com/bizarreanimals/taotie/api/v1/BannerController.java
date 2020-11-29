package com.bizarreanimals.taotie.api.v1;

import com.bizarreanimals.taotie.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {

    @GetMapping("/test")
    public String test() {
//        return "Hello, 奥利奥";
        throw new NotFoundException(10000);
    }
}
