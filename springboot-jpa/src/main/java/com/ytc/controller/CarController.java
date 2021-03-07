/**
 * Copyright (C), 2019, 因特驰
 * FileName: CarController
 * Author:   zyl
 * Date:     2021/3/6 14:57
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.Car;
import com.ytc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("queryCar")
    public String queryCar(Model model){
       List<Car> list= carService.queryCar();
       model.addAttribute("list",list);
       return "showCar";
    }

    @RequestMapping("toAddCar")
    public String toAddCar(){

        return "addCar";
    }

    /**
     * 新增
     * @param car
     * @return
     */
    @RequestMapping("addCar")
    public String addCar(Car car){
        carService.addCar(car);
        return "redirect:queryCar";
    }

    /**
     * 删除
     * @param
     * @return
     */
    @RequestMapping("delCar")
    public String delCar(Integer carid){
        carService.delCar(carid);
        return "redirect:queryCar";
    }

    /**
     * 修改前的回填
     * @param
     * @return
     */
    @RequestMapping("toUpdateCar")
    public String toUpdateCar(Integer carid,Model model){
        Car car=carService.toUpdateCar(carid);
        model.addAttribute("car",car);
        return "updateCar";
    }


    /**
     * 修改
     * @param car
     * @return
     */
    @RequestMapping("updateCar")
    public String updateCar(Car car){
        carService.updateCar(car);
        return "redirect:queryCar";
    }

}
