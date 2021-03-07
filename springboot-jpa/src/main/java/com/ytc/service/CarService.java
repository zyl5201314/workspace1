/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: CarService
 * Author:   zyl
 * Date:     2021/3/6 14:58
 * History:
 */
package com.ytc.service;

import com.ytc.model.Car;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
public interface CarService {
    List<Car> queryCar();

    void addCar(Car car);

    void delCar(Integer carid);

    Car toUpdateCar(Integer carid);

    void updateCar(Car car);
}
