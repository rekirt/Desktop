package com.teamr.yueqiu.utils.alipay;

public class AliPayInfo {
	/**
	 *
	 * 合作者的id
	 */
	public static String PARTNER = "2088021814477190";
	/**
	 * 收款账号
	 */
	public static String SELLER = "zhuce@yueqiuclub.com";
	/**
	 * 商户私钥
	 * 商户上传公钥给支付宝
	 * 一般未pkcs8编码的私钥
	 */
	public static String RSA_PRIVATE = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMT3wVNU/w5teJbH"+
	"XwIllR1cu88CeBYhiD6XySibO3ARsalo9gQXuig08p2uJkVDBYocrWdrLyGJrtxW"+
	"ljLF9XPX5SLgZFRYpPqk7jzjSHYCbkzPJhT0Dm67rS3JxdLtWEtWQ8ubiscy3acN"+
	"XQGGUjQfGi1aaRuX6Jw/VPYUCPYlAgMBAAECgYA8KbkhbQrjK0j0NT2t+DDN4S90"+
	"kbqAeAmXpOFKx++l0aHEr0zF/0FbWqDozPLfoRMmFpBY0IJ66gVBRClopNLN32w8"+
	"chkp7gAx9ub/HRvsZZE6sFX9y3+3vT7XW1rL7NJF2wWAM00IaMhilD3J7/ZumpjK"+
	"IDiSTgntM8a6T5BQQQJBAP1aENFISMUdT5w/BMZA52ysjestXHpgkKezfvB/1Ql2"+
	"LA9ljboTXJwg4NIoyxktBEiRDeXgeNQvw8dPnc3VQtkCQQDHBtBL3CDDxDweO8pC"+
	"SCu1/RS7gAVq2cr8O4Ksve5yUaecdPoQ3tPqzHyc2iddXArQopaa/hqpX/MftFdm"+
	"oCYtAkEAwHwtStQgdaJPWeaHOhkVuvte188e89tqC//T8eUtdoLR9uCxTS5orjZM"+
	"mV9k7zvEhV2vsXdaVdv0Yvmaa0gcAQJAZwmfAvcWu2M3oIthvgjxIEnC1wODSnsw"+
	"vH7uuxGlhefCN5zT7bH+0ntFNEs4v/ur2bGi+OD+2ptDGjHaYdYdjQJBAP0Pb7dp"+
	"wom0c/MQ1O9dc6ccPlnR8Fpl0CNY3ZV1hreLVdGx34sA+VeuYkavuhHP8U8xSskP";
	/**
	 * 支付宝公钥
	 * 支付宝给商户支付宝公钥
	 */
	public static final String RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
	/**
	 * 支付完成的回调页面
	 */
	public static String NOTIFY_URL;
	/**
	 * 好像也是回调页面，可以不传
	 */
	public static String RETURN_URL;


}
