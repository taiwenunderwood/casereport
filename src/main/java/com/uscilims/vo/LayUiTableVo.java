package com.uscilims.vo;

import java.util.List;

//layUi数据表需要的数据
public class LayUiTableVo<T> {
    private int code;//状态码
    private String msg;
    private int count;
    private List<T> data;

    public LayUiTableVo() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
