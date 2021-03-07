/**
 * Copyright (C), 2019, 因特驰
 * FileName: CarServiceImpl
 * Author:   zyl
 * Date:     2021/3/6 14:58
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.dao.CarDao;
import com.ytc.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> queryCar() {
        return carDao.findAll();

    }

    @Override
    public void addCar(Car car) {
        carDao.save(car);
    }

    @Override
    public void delCar(Integer carid) {
        carDao.deleteById(carid);
    }

    @Override
    public Car toUpdateCar(Integer carid) {
       return carDao.getOne(carid);
    }

    @Override
    public void updateCar(Car car) {
        carDao.save(car) ;
    }
}
