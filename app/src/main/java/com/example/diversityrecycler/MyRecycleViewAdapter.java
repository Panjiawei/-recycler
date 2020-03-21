package com.example.diversityrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diversityrecycler.adapter.ImageAdapter;
import com.example.diversityrecycler.bean.DataBean;
import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;

import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.config.IndicatorConfig;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;


import java.util.ArrayList;
import java.util.List;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final Context context;
    //布局标识集合
    private final List<Integer> typeList;

    private List<String> list=new ArrayList<>();
    private List<String> listtit=new ArrayList<>();

    //设置常量
    private static final int TYPE_THREE = 3;
    private static final int TYPE_TWO = 2;
    private static final int TYPE_ONE = 1;
    private static final int TYPE_FOUR = 4;


    public MyRecycleViewAdapter(Context context, List<Integer> typeList) {
        this.context = context;
        this.typeList = typeList;
        for (int i = 0; i <4 ; i++) {
            list.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");

            listtit.add("demo");
        }

    }


    @Override
    public int getItemViewType(int position) {
        if (typeList.get(position) == 2) {
            return TYPE_THREE;
        } else if (typeList.get(position) == 0) {
            return TYPE_TWO;
        } else if (typeList.get(position) == 1) {
            return TYPE_ONE;
        } else if (typeList.get(position) == 4) {
            return TYPE_FOUR;
        }
        return 1;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_THREE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item3, parent, false);
            ThreeViewHolder threeViewHolder = new ThreeViewHolder(view);
            return threeViewHolder;
        } else if (viewType == TYPE_TWO) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent, false);
            TwoViewHolder recyclerViewHolder = new TwoViewHolder(view);
            return recyclerViewHolder;
        } else if (viewType == TYPE_ONE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1, parent, false);
            OneViewHolder recycleViewHolderOne = new OneViewHolder(view);
            return recycleViewHolderOne;
        } else if (viewType == TYPE_FOUR) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item4, parent, false);
            FourViewHolder recycleViewHolderFour = new FourViewHolder(view);
            return recycleViewHolderFour;
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        switch (holder.getItemViewType()) {

            case TYPE_ONE:



                break;

            case TYPE_TWO:
                TwoViewHolder twoViewHolder = (TwoViewHolder) holder;

                twoViewHolder.banner.setAdapter(new ImageAdapter(DataBean.getTestData3(),context));

                twoViewHolder.banner.setIndicator(new CircleIndicator(context));
                twoViewHolder. banner.setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(Object data, int position) {
                        Toast.makeText(context, "点击" + position, Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onBannerChanged(int position) {

                    }
                });
                twoViewHolder.banner.setIndicatorGravity(IndicatorConfig.Direction.CENTER);
                twoViewHolder.banner.setOrientation(Banner.VERTICAL);
                twoViewHolder.banner.start();

                break;

            case TYPE_THREE:

                break;

            case TYPE_FOUR:

                break;


        }


    }

    @Override
    public int getItemCount() {
        return typeList.size();
    }

    public class ThreeViewHolder extends RecyclerView.ViewHolder {

        public ThreeViewHolder(View itemView) {
            super(itemView);

        }

    }

    public class TwoViewHolder extends RecyclerView.ViewHolder {
        public Banner banner;
        public TwoViewHolder(View itemView) {
            super(itemView);
            banner=itemView.findViewById(R.id.banner);

        }

    }

    public class OneViewHolder extends RecyclerView.ViewHolder {


        public OneViewHolder(View itemView) {
            super(itemView);

        }

    }


    public class FourViewHolder extends RecyclerView.ViewHolder {

        public FourViewHolder(View itemView) {
            super(itemView);

        }

    }
}
