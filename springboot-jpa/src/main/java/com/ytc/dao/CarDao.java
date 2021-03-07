/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: CarDao
 * Author:   zyl
 * Date:     2021/3/6 15:03
 * History:
 */
package com.ytc.dao;

import com.ytc.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
public interface CarDao extends JpaRepository<Car,Integer> {
}
