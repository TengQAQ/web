package com.ming.vo;


/**
 * 前后端分离的项目进行数据交互时，必须有一个统一的格式
 * { code:状态码, message:消息, data: 响应的数据 }
 */
public class Result {
	// 状态码
	private Integer code;
	// 消息
	private String message;
	// 响应的数据
	private Object data;

	public Result() {
	}

	public Result(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result{" +
				"code=" + code +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}
}
