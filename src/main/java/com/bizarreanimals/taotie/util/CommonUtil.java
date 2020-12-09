package com.bizarreanimals.taotie.util;

import com.bizarreanimals.taotie.bo.PageCounter;

public class CommonUtil {

    public static PageCounter convertToPageParameter(Integer start, Integer count) {
        int pageNum = start / count;

        PageCounter pageCounter = new PageCounter();
        pageCounter.setPage(pageNum);
        pageCounter.setCount(count);
        return pageCounter;
    }
}
