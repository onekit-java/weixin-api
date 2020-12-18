package cn.onekit.weixin.api;

import java.util.HashMap;
import java.util.Map;

import cn.onekit.JsAny;

import cn.onekit.js.core.function;

public class EventChannel implements JsAny {
    public static Map<Integer,EventChannel> eventChannels=new HashMap();
    /////////////////////
    Map<String, function> onHandlers = new HashMap();
    Map<String, function> onceHandlers = new HashMap();
    public EventChannel(int channelID,int otherID){
        this.otherID=otherID;
        eventChannels.put(channelID,this);
    }
    private final int otherID;
    public void emit(String eventName, JsAny args) {
        EventChannel other = eventChannels.get(otherID);
        if (other.onHandlers.containsKey(eventName)) {
            other.onHandlers.get(eventName).invoke(args);
        }else  if (other.onceHandlers.containsKey(eventName)) {
            other.onceHandlers.get(eventName).invoke(args);
            other.onceHandlers.remove(eventName);
        }
    }

    public void on(String eventName, function fn) {
        onHandlers.put(eventName, fn);
    }

    public void once(String eventName, function fn) {
        onceHandlers.put(eventName, fn);
    }

    public void off(String eventName, function fn) {
        onHandlers.remove(eventName);
    }

    @Override
    public JsAny ToString() {
        return null;
    }

    @Override
    public String toLocaleString(JsString locales, JsAny options) {
        return null;
    }

    @Override
    public JsAny invoke(JsAny... params) {
        return null;
    }
}
