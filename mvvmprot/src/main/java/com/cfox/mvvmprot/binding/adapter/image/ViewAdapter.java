package com.cfox.mvvmprot.binding.adapter.image;


import android.widget.ImageView;
import androidx.databinding.BindingAdapter;


/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"url", "placeholderRes"}, requireAll = false)
    public static void setImageUri(ImageView imageView, String url, int placeholderRes) {
//        if (!TextUtils.isEmpty(url)) {
//            //使用Glide框架加载图片
//            Glide.with(imageView.getContext())
//                    .load(url)
//                    .apply(new RequestOptions().placeholder(placeholderRes))
//                    .into(imageView);
//        }
    }
}

