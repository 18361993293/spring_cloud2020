package online.zhaochunlin.payment.dao;

import online.zhaochunlin.payment.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhaochunlin
 * @version 1.0
 * @date 2020/4/27 10:47
 */

public interface PaymentMapper {

    int create(@Param("payMent") Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
