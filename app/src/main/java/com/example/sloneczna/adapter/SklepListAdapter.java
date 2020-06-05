package com.example.sloneczna.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.TaskExecutor;

import com.example.sloneczna.R;
import com.example.sloneczna.model.sklep;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.List;

public class SklepListAdapter extends ArrayAdapter<sklep> {

    private  Context ncontext;
    int nResource;

    public SklepListAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        ncontext=context;
        nResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        setupImageLoader();
        String name=getItem(position).getNazwa();
        String img=getItem(position).getImgurl();

        sklep skl = new sklep(img,name);
        LayoutInflater inflater = LayoutInflater.from(ncontext);
        convertView = inflater.inflate(nResource,parent,false);
        TextView tvName= (TextView) convertView.findViewById(R.id.tvNazwa);
        ImageView imageView= convertView.findViewById(R.id.ivZdjecie);

        tvName.setText(name);
        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = ncontext.getResources().getIdentifier("@drawable/image_failed",null,ncontext.getPackageName());

        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage).build();

        imageLoader.displayImage(img,imageView,options);



        return convertView;
    }

    private void setupImageLoader(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                ncontext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }
}
