/**
 * Copyright (C), 2019, 因特驰
 * FileName: Car
 * Author:   zyl
 * Date:     2021/3/6 14:44
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/6
 * @since 1.0.0
 */
@Entity
@Table(name = "t_car")
public class Car implements Serializable{

    private static final long serialVersionUID = -7160544537950102437L;
    @Id
    @GeneratedValue
    private Integer carId;

    @Column(name = "car_name",length = 20)
    private String carName;

    @Column(name = "car_price")
    private Double  carPrice;

    @Column(name = "car_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date carDate;

    @Transient
    private String carColor;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public Date getCarDate() {
        return carDate;
    }

    public void setCarDate(Date carDate) {
        this.carDate = carDate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carDate=" + carDate +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
