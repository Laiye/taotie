package com.bizarreanimals.taotie.service;

import com.bizarreanimals.taotie.model.Banner;
import com.bizarreanimals.taotie.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    @Override
    public Banner getByName(String name) {
        return bannerRepository.findOneByName(name);
//        System.out.println("....sss.....");
    }
}
