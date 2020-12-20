package cn.onekit.weixin.api.core.res;


import cn.onekit.js.JsObject;
import cn.onekit.js.JsAny;
import cn.onekit.js.JsString;


public class wx_fail extends JsObject {
    public wx_fail(String errMsg) {
        put("errMsg", new JsString( errMsg));
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
    public JsString ToString() {
        return null;
    }
/*
    @Override
    public String toLocaleString(JsString locales, JsAny options) {
        return null;
    }*/

    @Override
    public JsAny invoke(JsAny... params) {
        return null;
    }
}
