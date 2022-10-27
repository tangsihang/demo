package com.example.demo.common.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DemoDTO implements Serializable {

    private static final long serialVersionUID = -3736893214335392362L;

    private String str;
}