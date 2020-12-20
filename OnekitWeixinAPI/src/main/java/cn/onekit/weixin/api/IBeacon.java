package cn.onekit.weixin.api;


import cn.onekit.js.JsAny;
import cn.onekit.js.JsString;


public class IBeacon implements JsAny {
    String uuid;
    String major;
    String minor;
    int proximity;
    double accuracy;
    int rssi;

    public String getUuid() {
        return uuid;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public int getProximity() {
        return proximity;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getRssi() {
        return rssi;
    }

    @Override
    public JsAny get(JsAny key) {
        return null;
    }

    @Override
    public JsAny set(JsAny key, JsAny value) {
        return null;
    }

    @Override
    public JsAny get(String key) {
        return null;
    }

    @Override
    public JsAny set(String key, JsAny value) {
        return null;
    }

    @Override
    public JsString ToString() {
        return null;
    }

    @Override
    public JsAny invoke(JsAny... arguments) {
        return null;
    }
}
