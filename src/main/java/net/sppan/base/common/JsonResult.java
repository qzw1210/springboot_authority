package net.sppan.base.common;

import java.io.Serializable;

/**
 * Json 统一返回消息类
 * 
 * @author SPPan
 *
 */
public class JsonResult implements Serializable {
	private static final long serialVersionUID = -1491499610244557029L;
	public static int CODE_SUCCESS = 0;
	public static int CODE_FAILURED = -1;
	public static String[] NOOP = new String[] {};

	private int code; // 处理状态：0: 成功
	private String message;
	private Object data; // 返回数据

	private JsonResult(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * 处理成功，并返回数据
	 * 
	 * @param data
	 *            数据对象
	 * @return data
	 */
	public static final JsonResult success(Object data) {
		return new JsonResult(CODE_SUCCESS, "操作成功", data);
	}
	
	/**
	 * 处理成功
	 * 
	 * @param message
	 *            消息
	 * @return data
	 */
	public static final JsonResult success() {
		return new JsonResult(CODE_SUCCESS, "操作成功", NOOP);
	}

	/**
	 * 处理成功
	 * 
	 * @param message
	 *            消息
	 * @return data
	 */
	public static final JsonResult success(String message) {
		return new JsonResult(CODE_SUCCESS, message, NOOP);
	}

	/**
	 * 处理成功
	 * 
	 * @param message
	 *            消息
	 * @param data
	 *            数据对象
	 * @return data
	 */
	public static final JsonResult success(String message, Object data) {
		return new JsonResult(CODE_SUCCESS, message, data);
	}

	/**
	 * 处理失败，并返回数据（一般为错误信息）
	 * 
	 * @param code
	 *            错误代码
	 * @param message
	 *            消息
	 * @return data
	 */
	public static final JsonResult failure(int code, String message) {
		return new JsonResult(code, message, NOOP);
	}

	/**
	 * 处理失败
	 * 
	 * @param message
	 *            消息
	 * @return data
	 */
	public static final JsonResult failure(String message) {
		return failure(CODE_FAILURED, message);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
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
		return "JsonResult [code=" + code + ", message=" + message + ", data="
				+ data + "]";
	}
	
	
}
