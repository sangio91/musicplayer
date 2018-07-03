package com.example.giorgiosantomasi.musicplayer;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.giorgiosantomasi.musicplayer.pojo.Track;

import java.util.List;


/**
 * Created by giorgio.santomasi on 27/06/2018.
 */

public class TrackRecyclerAdapter extends RecyclerView.Adapter<TrackRecyclerAdapter.TrackViewHolder> {

    private List<Track> tracks;
    private Context context;

    public TrackRecyclerAdapter(List<Track> tracks, Context context){
        this.tracks = tracks;
        this.context = context;
    }

    @Override
    public TrackViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = (LayoutInflater)
                context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View v = mInflater.inflate(R.layout.list_row, parent, false);
        TrackViewHolder wvh = new TrackViewHolder(v);
        return wvh;
    }

    @Override
    public void onBindViewHolder(TrackViewHolder holder, int position) {

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
        holder.title.setText(tracks.get(position).getArtist() + " - " + tracks.get(position).getTitle());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }

    public static class TrackViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        TrackViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.song);
        }
    }
}
