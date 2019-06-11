package com.stylefeng.guns.rest.model.order.orderResVo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by ZhangYao
 * Date 2019/4/25 Time 15:24
 */
@Setter
@Getter
@ToString
public class OrderVo implements Serializable {
    private String orderId;
    private String filmName;
    private String fieldTime;
    private String cinemaName;
    private String seatsName;
    private String orderPrice;
    private String orderTimestamp;
    private String orderStatus;
}
