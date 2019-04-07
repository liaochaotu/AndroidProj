package com.example.liaochaotu.puredisplay2;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by liaochaotu on 2019/3/31.
 */
public class PureDisplayIntentService extends IntentService{
    private Intent intent;

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public PureDisplayIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent( Intent intent) {

        this.intent = intent;
    }
}
