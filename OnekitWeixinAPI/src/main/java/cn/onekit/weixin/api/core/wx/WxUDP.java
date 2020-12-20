package cn.onekit.weixin.api.core.wx;

import cn.onekit.weixin.api.UDPSocket;

public class WxUDP extends WxTopBar{
    public UDPSocket createUDPSocket(){

        return new UDPSocket();
    }

}
