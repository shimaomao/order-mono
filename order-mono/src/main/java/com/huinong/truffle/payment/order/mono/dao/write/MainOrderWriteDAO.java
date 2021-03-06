package com.huinong.truffle.payment.order.mono.dao.write;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.huinong.truffle.payment.order.mono.entity.HnpMainOrderEntity;

/**
 * @author peng
 * 主订单写DAO
 *
 */
@Repository
public interface MainOrderWriteDAO {
	
	/**
	 * 添加主订单
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public int insert(HnpMainOrderEntity record);
	
	
	/**
	 * 更新主订单
	 * @param mainOrderNo
	 * @param orderStatus
	 * @return
	 * @throws Exception
	 */
	public int updateByMainOrderNo (HnpMainOrderEntity record) throws Exception ;
	
	
	/**
	 * 删除订单信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delMainOrder(@Param("id") Long id) throws Exception;

}
