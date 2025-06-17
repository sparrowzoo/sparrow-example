package com.sparrowzoo.example.boot.config;

import com.sparrow.spring.starter.advice.ControllerResponseAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"$package_controller"})
public class ControllerAdvice extends ControllerResponseAdvice {
}
