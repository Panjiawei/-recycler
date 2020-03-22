package com.example.diversityrecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
;import com.bumptech.glide.Glide;
import com.dueeeke.videocontroller.StandardVideoController;
import com.dueeeke.videocontroller.component.CompleteView;
import com.dueeeke.videocontroller.component.ErrorView;
import com.dueeeke.videocontroller.component.GestureView;
import com.dueeeke.videocontroller.component.PrepareView;
import com.dueeeke.videocontroller.component.VodControlView;
import com.dueeeke.videoplayer.player.VideoView;

public class Main2Activity extends AppCompatActivity {
    private static final String THUMB = "https://cms-bucket.nosdn.127.net/eb411c2810f04ffa8aaafc42052b233820180418095416.jpeg";

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videoView=findViewById(R.id.player);
        PrepareView prepareView = new PrepareView(this);//准备播放界面
        ImageView thumb = prepareView.findViewById(R.id.thumb);//封面图
        Glide.with(this).load(THUMB).into(thumb);

        videoView.setUrl("http://vfx.mtime.cn/Video/2019/03/14/mp4/190314223540373995.mp4"); //设置视频地址
        StandardVideoController controller = new StandardVideoController(this);
        controller.addDefaultControlComponent("标题", false);
        controller.addControlComponent(new CompleteView(this));//自动完成播放界面
        controller.addControlComponent(new ErrorView(this));//错误界面
        VodControlView vodControlView = new VodControlView(this);//点播控制条
        //是否显示底部进度条。默认显示
//                vodControlView.showBottomProgress(false);
        controller.addControlComponent(prepareView);
        controller.addControlComponent(vodControlView);
        GestureView gestureControlView = new GestureView(this);//滑动控制视图
        controller.addControlComponent(gestureControlView);

        videoView.setVideoController(controller); //设置控制器

//        videoView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                videoView.start(); //开始播放，不调用则不自动播放
//            }
//        });

    }



    @Override
    protected void onPause() {
        super.onPause();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoView.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        videoView.release();
    }


    @Override
    public void onBackPressed() {
        if (!videoView.onBackPressed()) {
            super.onBackPressed();
        }
    }











}
