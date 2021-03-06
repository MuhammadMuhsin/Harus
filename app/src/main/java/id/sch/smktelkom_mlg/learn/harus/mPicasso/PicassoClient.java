package id.sch.smktelkom_mlg.learn.harus.mPicasso;

/**
 * Created by muhsin511978 on 30/11/2016.
 */

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import id.sch.smktelkom_mlg.learn.harus.R;


public class PicassoClient {

    public static void downloadImage(Context c, String url, ImageView img) {
        if (url != null && url.length() > 0) {
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);
        } else {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }
}