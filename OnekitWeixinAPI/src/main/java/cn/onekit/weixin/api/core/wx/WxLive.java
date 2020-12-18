package cn.onekit.weixin.api.core.wx;

import cn.onekit.JsAny;
import cn.onekit.weixin.LivePlayerContext;
import cn.onekit.weixin.LivePusherContext;

public class WxLive extends WxLifeCycle {
    public LivePusherContext createLivePusherContext(){
        return null;
    }
    public LivePlayerContext createLivePlayerContext(JsAny id, JsAny THIS){
        return null;
    }

}
