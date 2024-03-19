package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author tianYou
 * @version 1 .0
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
