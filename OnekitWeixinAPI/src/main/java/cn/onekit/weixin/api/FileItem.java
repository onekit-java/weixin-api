package cn.onekit.weixin.api;

import cn.onekit.JsAny;


public class FileItem implements JsAny {
    public String filePath;
    public int createTime;
    public int size;

    @Override
    public JsAny ToString() {
        return null;
    }
}
