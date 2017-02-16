package com.preciousmall;

import android.support.multidex.MultiDexApplication;
import android.util.Log;

import com.alibaba.baichuan.android.trade.AlibcTradeSDK;
import com.alibaba.baichuan.android.trade.callback.AlibcTradeInitCallback;

/**
 * Created by winson on 2016/10/20.
 */

public class ThisApp extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        AlibcTradeSDK.asyncInit(this, new AlibcTradeInitCallback() {
            @Override
            public void onSuccess() {
                //初始化成功，设置相关的全局配置参数

                Log.i("mall", "AlibcTradeSDK.asyncInit::onSuccess");
                // ...
            }

            @Override
            public void onFailure(int code, String msg) {
                //初始化失败，可以根据code和msg判断失败原因，详情参见错误说明
                Log.i("mall", "AlibcTradeSDK.asyncInit::onFailure : " + msg);
            }
        });

    }

}
