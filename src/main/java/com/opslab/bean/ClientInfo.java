package com.opslab.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装通用的客户端请求
 */
@Data
public class ClientInfo {
    //唯一标示
    private String kid;
    //用户标示
    private String userId;
    //请求发送时间
    private String reqTime;
    //请求响应时间
    private String respTime;
    //请求端ip
    private String clientIp;
    //客户端os系统
    private String platform;
    //客户端os系统版本
    private String osVersion;
    //客户端类型名称
    private String appName;
    //客户端类型版本
    private String appVersion;
    //客户端指纹信息
    private String userAgents;
    //http referer信息
    private String referer;
    /*手机IMEI设备Id*/
    private String driverId;
    //请求端
    private String uri;
}