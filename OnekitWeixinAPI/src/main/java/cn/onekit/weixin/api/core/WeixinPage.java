package cn.onekit.weixin.api.core;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import cn.onekit.js.JsObject;
import cn.onekit.thekit.Android;
import cn.onekit.weixin.api.AudioContext;
import cn.onekit.weixin.api.WX;

public abstract class WeixinPage extends Activity implements WeixinFile  {


    protected WX wx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Android.context = this;
        wx = new WX();

    }

    public static final int VideoView = 1;
    public static final int IMAGE_CAPTURE = 100;
    public static final int IMAGE_CAPTURE_PATH = 101;
    public static final int VIDEO_CAPTURE = 200;
    public static final int GET_CONTENT = 300;
    public static final int GET_CONTENT_PATH = 301;
    public static final int GET_MINI = 400;
    public static final int GET_URI = 500;
    public static final int SCANNIN_GREQUEST_CODE = 202;
    public static final int CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE = 203;
    public static final int location = 204;
    public static final int chooseLocation = 205;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case chooseLocation: {
               // this.wx.ACTION1ChooseLocation(resultCode, data);
            }
            break;
            case location: {
             //   this.wx.ACTION1Openlocation(resultCode, data);
            }
            break;
//            case SCANNIN_GREQUEST_CODE: {
//                ScanCode.SCANNIN_GREQUEST_CODE(resultCode, data);
//            }
//            break;
//            case CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE: {
//                Video.CAPTURE_VIDEO_ACTIVITY_REQUEST_CODE(resultCode, data);
//            }
//            break;
//            case VideoView: {
//                Video.VideoView(resultCode, data);
//            }
//            break;
            default:
                break;
        }
    }
}
