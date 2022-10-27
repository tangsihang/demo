package com.example.demo.dao.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.entity.BaseDO;
import com.example.demo.dao.mapper.DefaultMapper;

public abstract class BaseRepository<M extends DefaultMapper<T>, T extends BaseDO> extends ServiceImpl<M, T> {


}
