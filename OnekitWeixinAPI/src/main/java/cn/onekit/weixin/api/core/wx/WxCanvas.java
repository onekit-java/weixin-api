package cn.onekit.weixin.api.core.wx;


import cn.onekit.JsAny;
import cn.onekit.js.Map;
import cn.onekit.weixin.CanvasContext;
import cn.onekit.weixin.OffscreenCanvas;

public class WxCanvas extends WxCamera {
    public OffscreenCanvas createOffscreenCanvas(){
        return null;
    }
    public CanvasContext createCanvasContext(JsAny canvasId, JsAny THIS){
        return null;
    }
    public void createCanvasContext(Map OBJECT, JsAny THIS){

    }
    public void canvasPutImageData(Map OBJECT, JsAny THIS){

    }
    public void canvasGetImageData(Map OBJECT, JsAny THIS){

    }
}
