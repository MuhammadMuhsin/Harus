package id.sch.smktelkom_mlg.learn.harus.mRecycler;

/**
 * Created by muhsin511978 on 30/11/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.harus.R;
import id.sch.smktelkom_mlg.learn.harus.mData.Movie;
import id.sch.smktelkom_mlg.learn.harus.mPicasso.PicassoClient;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    ArrayList<Movie> movies;

    public MyAdapter(Context c, ArrayList<Movie> movies) {
        this.c = c;
        this.movies = movies;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_hewan, parent, false);
        MyHolder holder = new MyHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nameTxt.setText(movies.get(position).getName());

        PicassoClient.downloadImage(c, movies.get(position).getUrl(), holder.img);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}