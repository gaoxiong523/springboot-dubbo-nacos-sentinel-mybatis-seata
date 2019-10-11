package com.gaoxiong.base;

import java.util.List;

/**
 * @author gaoxiong
 * @ClassName BaseService
 * @Description
 * @date 2019/10/11 14:12
 */
public interface BaseService<T> {

    List<T> findAll();
}
