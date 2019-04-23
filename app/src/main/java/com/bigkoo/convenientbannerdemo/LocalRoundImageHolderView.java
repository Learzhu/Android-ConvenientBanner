package com.bigkoo.convenientbannerdemo;

import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;

/**
 * Created by Sai on 15/8/4.
 * 本地图片Holder例子
 */
public class LocalRoundImageHolderView extends Holder<Integer> {
    private ImageView imageView;

    public LocalRoundImageHolderView(View itemView) {
        super(itemView);
    }

    @Override
    protected void initView(View itemView) {
//        imageView = itemView.findViewById(R.id.rciv);
        imageView = (ImageView) itemView;
    }

    @Override
    public void updateUI(Integer data) {
        imageView.setImageResource(data);
    }
}
