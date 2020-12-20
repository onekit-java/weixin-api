package cn.onekit.weixin.api.core.wx;

import cn.onekit.js.JsAny;
import cn.onekit.weixin.api.LivePlayerContext;
import cn.onekit.weixin.api.LivePusherContext;

public class WxLive extends WxLifeCycle {
    public LivePusherContext createLivePusherContext(){
        return null;
    }
    public LivePlayerContext createLivePlayerContext(JsAny id, JsAny THIS){
        return null;
    }

}
