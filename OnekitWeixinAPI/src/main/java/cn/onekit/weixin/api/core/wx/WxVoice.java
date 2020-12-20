package cn.onekit.weixin.api.core.wx;

import android.media.MediaPlayer;

import java.io.IOException;
import java.util.Map;

import cn.onekit.js.JsObject;
import cn.onekit.js.JsAny;
import cn.onekit.js.function;
import cn.onekit.thekit.Android;
import cn.onekit.weixin.api.AudioContext;
import cn.onekit.weixin.api.InnerAudioContext;
import cn.onekit.weixin.api.MediaAudioPlayer;
import cn.onekit.weixin.api.R;
import cn.onekit.weixin.api.core.Onekit_Weixin;
import cn.onekit.weixin.api.core.res.wx_fail;

public class WxVoice extends WxVideoDecoder {

    private MediaPlayer player;
    private boolean isPause = true;

    //播放语音
    public void playVoice(Map OBJECT) {
        final String filePath = OBJECT.get("filePath") != null ? (String) OBJECT.get("filePath") : null;
        function success = OBJECT.get("success") != null ? (function) OBJECT.get("success") : null;
        function fail = OBJECT.get("fail") != null ? (function) OBJECT.get("fail") : null;
        function complete = OBJECT.get("complete") != null ? (function) OBJECT.get("complete") : null;
        String realPath = Onekit_Weixin.tempPath2androidPath(filePath);//只能是录音路径 否则 realPath 为null
        if (player != null) {
            if (isPause == true) {
                player.pause();//暂停播放
                isPause = false;
            } else {
                player.start();//继续播放
                isPause = true;
            }
        } else {
            player = new MediaPlayer();
            try {
                player.setDataSource(realPath);
                player.prepare();
                player.start();
              //  WxBackgroundAudio.BackgroundAudioManager.mediaPlayer = player;
                JsObject res = new JsObject();
//                res.errMsg = Android.context.getResources().getString(R.string.wx_playVoice_success);
//                res.localld = filePath;
                if (success != null) {
                    success.invoke(res);
                }
                if (complete != null) {
                    complete.invoke(res);
                }
            } catch (IOException e) {
                e.printStackTrace();
                wx_fail res = new wx_fail(Android.context.getResources().getString(R.string.wx_playVoice_fail));
//                res.errMsg = Android.context.getResources().getString(R.string.wx_playVoice_fail);
                if (complete != null) {
                    complete.invoke(res);
                }
                if (fail != null) {
                    fail.invoke(res);
                }
            }
        }
    }


    //暂停播放语音
    public void pauseVoice(Map OBJECT) {
        if (OBJECT == null) {
            return;
        }
        function success = OBJECT.get("success") != null ? (function) OBJECT.get("success") : null;
        function fail = OBJECT.get("fail") != null ? (function) OBJECT.get("fail") : null;
        function complete = OBJECT.get("complete") != null ? (function) OBJECT.get("complete") : null;
        if (player == null) {
            return;
        }
        if (player.isPlaying()) {
            player.pause();//暂停播放
            isPause = false;
            JsObject res = new JsObject();
//            res.errMsg = Android.context.getResources().getString(R.string.wx_pauseVoice_success);
            if (success != null) {
                success.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        } else {
            wx_fail res = new wx_fail( Android.context.getResources().getString(R.string.wx_pauseVoice_fail));
//            res.errMsg = Android.context.getResources().getString(R.string.wx_pauseVoice_fail);
            if (fail != null) {
                fail.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        }
    }

    //停止播放语音
    public void stopVoice(Map OBJECT) {
        if (OBJECT == null) {
            return;
        }
        function success = OBJECT.get("success") != null ? (function) OBJECT.get("success") : null;
        function fail = OBJECT.get("fail") != null ? (function) OBJECT.get("fail") : null;
        function complete = OBJECT.get("complete") != null ? (function) OBJECT.get("complete") : null;

        if (player != null) {
            player.reset();
            player.stop();
            player = null;
            JsObject res = new JsObject();
//            res.errMsg =Android.context.getResources().getString(R.string.wx_stopVoice_success);
            if (success != null) {
                success.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        } else {
            wx_fail res = new wx_fail(Android.context.getResources().getString(R.string.wx_stopVoice_fail));
//            res.errMsg = Android.context.getResources().getString(R.string.wx_stopVoice_fail);
            if (fail != null) {
                fail.invoke(res);
            }
            if (complete != null) {
                complete.invoke(res);
            }
        }
    }
    public void setInnerAudioOption(Map OBJECT){

    }
    public void getAvailableAudioSources(Map OBJECT){

    }
    public MediaAudioPlayer createMediaAudioPlayer(Map OBJECT){
          return null;
    }
    public InnerAudioContext createInnerAudioContext(){
return null;
    }
    public AudioContext createAudioContext(JsAny id, JsAny THIS){
          return null;
    }


}
