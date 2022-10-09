package com.ryfj.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @Author: renyan
 * @CreateTime: 2022-09-28  21:36
 * @Description: TODO
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResult<T> {

    @NonNull
    private Integer code;


    private String msg;


    private T data;
}
