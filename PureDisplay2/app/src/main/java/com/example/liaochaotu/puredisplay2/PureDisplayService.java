package com.example.liaochaotu.puredisplay2;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by liaochaotu on 2019/3/31.
 */
public class PureDisplayService extends  Service{

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("liaocahotu","PureDisplayService-onCreate");
        return null;
    }
    @Override
    public void onCreate(){
        Log.d("liaocahotu","PureDisplayService-onCreate");
    }

}
