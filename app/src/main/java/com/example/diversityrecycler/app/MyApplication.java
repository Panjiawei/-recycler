package com.example.diversityrecycler.app;

import android.app.Application;

import com.dueeeke.videoplayer.BuildConfig;
import com.dueeeke.videoplayer.exo.ExoMediaPlayerFactory;
import com.dueeeke.videoplayer.ijk.IjkPlayerFactory;
import com.dueeeke.videoplayer.player.AndroidMediaPlayerFactory;
import com.dueeeke.videoplayer.player.VideoViewConfig;
import com.dueeeke.videoplayer.player.VideoViewManager;

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        VideoViewManager.setConfig(VideoViewConfig.newBuilder()
                .setLogEnabled(BuildConfig.DEBUG)//调试的时候请打开日志，方便排错
                //使用使用IjkPlayer解码
                .setPlayerFactory(IjkPlayerFactory.create())
                //使用ExoPlayer解码
               // .setPlayerFactory(ExoMediaPlayerFactory.create())
                //使用MediaPlayer解码
               // .setPlayerFactory(AndroidMediaPlayerFactory.create())
                .build());

    }

}
