package cn.onekit.weixin.api.core.wx;

import android.provider.Settings;

import java.util.Map;

import cn.onekit.js.JsObject;
import cn.onekit.js.function;
import cn.onekit.thekit.Android;
import cn.onekit.weixin.api.LogManager;
import cn.onekit.weixin.api.R;
import cn.onekit.weixin.api.core.res.wx_fail;

public class WxDebug extends WxCompass {
    public void setEnableDebug(Map OBJECT) {
        final boolean enableDebug = (boolean) OBJECT.get("enableDebug");
        final function success = (OBJECT.get("success")!= null)? (function) OBJECT.get("success") :null;
        final function fail = (OBJECT.get("fail")!= null)? (function) OBJECT.get("fail") :null;
        final function complete = (OBJECT.get("complete")!= null)? (function) OBJECT.get("complete") :null;
        try {
            if (enableDebug == true) {
                Settings.Secure.putInt(application.getContentResolver(), Settings.Secure.ADB_ENABLED, 1);
            }else {
                Settings.Secure.putInt(application.getContentResolver(), Settings.Secure.ADB_ENABLED, 0);
            }
            JsObject res = new JsObject();
            if (success != null) {
                success.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
            wx_fail res = new wx_fail(Android.context.getResources().getString(R.string.wx_setEnableDebug_fail));
//            res.errMsg = ACTIVITY.context.getResources().getString(R.string.wx_setEnableDebug_fail);
            if (fail != null) {
                fail.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        }
    }
    public LogManager getLogManager(Map OBJECT){
        return null;
    }
}
