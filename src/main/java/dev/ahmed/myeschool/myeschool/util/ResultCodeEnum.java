package dev.ahmed.myeschool.myeschool.util;

import lombok.Getter;

/**
 * Unified return result status information class
 *
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"success"),
    FAIL(201, "fail"),
    SERVICE_ERROR(2012, "Abnormal service"),
    ILLEGAL_REQUEST( 204, "illegal request"),
    PAY_RUN(205, "payment ongoing"),
    ARGUMENT_VALID_ERROR(206, "Parameter validation error"),

    LOGIN_ERROR(207, "wrong user name or password"),
    LOGIN_AUTH(208, "not logged in"),
    PERMISSION(209, "permission denied"),
    SECKILL_NO_START(210, "The spike hasn't started yet"),
    SECKILL_RUN(211, "in line"),
    SECKILL_NO_PAY_ORDER(212, "You have unpaid orders"),
    SECKILL_FINISH(213, "Sold out"),
    SECKILL_END(214, "Lightning has ended"),
    SECKILL_SUCCESS(215, "Successful order grabbing"),
    SECKILL_FAIL(216, "Order grab failed"),
    SECKILL_ILLEGAL(217, "illegal request"),
    SECKILL_ORDER_SUCCESS(218, "successfully ordered"),
    COUPON_GET(220, "Coupon has been received"),
    COUPON_LIMIT_GET(221, "Coupons have been issued"),
    //2022-02-22
    LOGIN_CODE(222,"There is no operation for a long time, the session has expired, please refresh the page and try again!"),
    CODE_ERROR(223,"Verification code error!"),
    TOKEN_ERROR(224,"Token is invalid!")
    ;

    private Integer code;

    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
