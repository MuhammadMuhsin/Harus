package id.sch.smktelkom_mlg.learn.harus.mRecycler;

/**
 * Created by muhsin511978 on 30/11/2016.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.learn.harus.R;


public class MyHolder extends RecyclerView.ViewHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        img = (ImageButton) itemView.findViewById(R.id.movieImage);

    }
}