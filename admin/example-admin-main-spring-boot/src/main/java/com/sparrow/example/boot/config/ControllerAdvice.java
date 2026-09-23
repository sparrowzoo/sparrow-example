package com.sparrow.example.boot.config;

import com.sparrow.spring.mvc.ControllerReturnAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 这里需要业务手动设置扫描路径
 */
//@RestControllerAdvice(basePackages = {"com.sparrow"})
public class ControllerAdvice extends ControllerReturnAdvice {
}
