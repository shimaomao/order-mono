package com.huinong.truffle.payment.order.mono.constant;

import com.huinong.truffle.component.base.constants.ResultCodeIntf;

/**
 * 订单返回错误信息
 * @author peng
 *
 */
public enum OrderResultCode implements ResultCodeIntf {
	
	//系统异常 1
    SYS_0001(000,"订单服务异常"),
    //DB 异常 2
    DB_0002(4002,"订单已支付，请勿重新支付"),
	DB_0003(4003,"创建订单失败"),
	DB_0004(4004,"删除订单信息失败"),
	DB_0005(4005,"查询结果为空"),
	DB_0006(4006,"更新订单异常"),
	DB_0007(4007,"订单结算超时"),
	DB_0008(4008,"付款单信息与支付订单信息不相符"),
	DB_0009(4009,"结算订单还处在审核中"),
	DB_0010(4010,"订单付款失败"),
	DB_0011(4011,"订单付款成功，请勿重复付款"),
	DB_0013(4013,"当前付款金额大于平台可用余额"),
	DB_0014(4014,"新增制付款单异常"),
	DB_0016(4016,"订单退款超时"),
	DB_0017(4017,"更新结算订单付款状态失败"),
	DB_0018(4018,"更新付款明细订单状态失败"),
	DB_0019(4019,"子订单金额之和不等于主订单总金额"),
	DB_0020(4020,"订单预支付超时"),
	DB_0021(4021,"对象转换异常"),
	DB_0022(4022,"完结订单异常"),
	DB_0023(4023,"检索的订单结果为空"),
    
    //入参参数异常 5
	PARAM_0002(5002,"订单项参数为空"),
	PARAM_0004(5004,"传入的参数为空"),
	PARAM_0006(5006,"无法识别{订单号}"),
	PARAM_0007(5007,"无法识别{买家ID}"),
	PARAM_0008(5008,"无法识别{结算总额}"),
	PARAM_0009(5009,"无法识别{子订单编号}"),
	PARAM_0010(5010,"无法识别{卖家ID}"),
	PARAM_0011(5011,"无法识别{收款人账号}"),
	PARAM_0012(5012,"无法识别{收款人名称}"),
	PARAM_0013(5013,"无法识别{招商卡标志}"),
	PARAM_0014(5014,"无法识别{收款银行开户行地址}"),
	PARAM_0015(5015,"无法识别{收款银行开户银行}"),
	PARAM_0016(5016,"无法识别{手续费}"),
	PARAM_0017(5017,"无法识别{结算方向}"),
	PARAM_0018(5018,"无法识别{支付渠道}"),
	PARAM_0019(5019,"无法识别{买家金额}"),
	PARAM_0020(5020,"付款方向不在指定范围值内(0-付款 1-退款)"),
	PARAM_0021(5021,"无法识别{订单ID}"),
	PARAM_0022(5022,"无法识别{结算流水号}"),
	PARAM_0023(5023,"无法识别{付款状态}"),
	PARAM_0024(5024,"无法识别{付款返回码}"),
	PARAM_0025(5025,"无法识别{付款返回消息}"),
	PARAM_0026(5026,"无法识别{平台标识}"),
	PARAM_0027(5027,"无法识别{平台来源}"),
	PARAM_0028(5028,"无法识别{买家惠农网用户ID}"),
	PARAM_0029(5029,"无法识别{下单渠道}"),
	PARAM_0030(5030,"无法识别{订单明细为空}"),
	PARAM_0031(5031,"无法识别{收款卡信息}"),
	PARAM_0032(5032,"无法识别{支付流水号}"),
	PARAM_0033(5033,"无法识别{卖家金额}"),
	//买家收款卡信息
	;

	private int code;
	private String msg;
	
	private OrderResultCode(int code){
		this.code = code;
	}
	  
	private OrderResultCode(int code, String msg){
		this.code = code ;
		this.msg = msg ;
	}
	
	public String getMsg(){
	    return this.msg;
	}

	public int getCode(){
	    return this.code;
	}

}
