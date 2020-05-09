package online.zhaochunlin.payment.entity;

import lombok.*;

/**
 * @author zhaochunlin
 * @version 1.0
 * @date 2020/4/27 10:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Payment {
    private Long id;
    private String serial;
}
