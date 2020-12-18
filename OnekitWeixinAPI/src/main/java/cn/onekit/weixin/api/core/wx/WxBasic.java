package cn.onekit.weixin.api.core.wx;

import android.app.Application;

import java.util.Base64;

import cn.onekit.js.ArrayBuffer;
import cn.onekit.js.JsBoolean;
import cn.onekit.js.TypedArray;
import cn.onekit.thekit.Android;

public class WxBasic extends WxBackgroundFetch {
    Application application= Android.application();
    public JsBoolean canIUse(String schema) {
        return new JsBoolean(true);
    }

    public ArrayBuffer base64ToArrayBuffer(String base64) {
        byte[] bytes = Base64.getDecoder().decode(base64);
        return new ArrayBuffer(bytes);
    }

    public String arrayBufferToBase64(TypedArray arrayBuffer) {
        return Base64.getEncoder().encodeToString(arrayBuffer._buffer._data);
    }
}
