package com.mjj.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * controller基类
 * @author h
 */
public class BaseController {
    @Autowired
    protected HttpServletRequest request;
}
