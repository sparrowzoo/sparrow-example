package com.sparrow.example.boot.config;

import com.sparrow.spring.starter.advice.ControllerResponseAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"com.example"})
public class ControllerAdvice extends ControllerResponseAdvice {
}
