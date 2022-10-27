
package com.example.demo.biz.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.common.model.PageDTO;
import com.google.common.collect.Lists;

public class PageUtils {

    public static <T> PageDTO<T> copy(IPage<T> page){
        PageDTO<T> pageDTO = new PageDTO<>();
        pageDTO.setPages(Long.valueOf(page.getPages()).intValue());
        pageDTO.setTotal(Long.valueOf(page.getTotal()).intValue());
        pageDTO.setCurrent(Long.valueOf(page.getCurrent()).intValue());
        pageDTO.setSize(Long.valueOf(page.getSize()).intValue());
        pageDTO.setRecords(page.getRecords());
        return pageDTO;
    }
}
