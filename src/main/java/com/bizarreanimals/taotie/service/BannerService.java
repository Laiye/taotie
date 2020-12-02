package com.bizarreanimals.taotie.service;

import com.bizarreanimals.taotie.model.Banner;
import org.springframework.stereotype.Service;

public interface BannerService {
    Banner getByName(String name);
}
