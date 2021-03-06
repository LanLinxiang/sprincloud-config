package com.llx.llxmall.order.dao;

import com.llx.llxmall.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author LanLinxiang
 * @email linxianglan@aliyun.com
 * @date 2021-02-07 19:25:11
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
