package com.picsapp.picsmusic;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class SongItemMainAdapter extends RecyclerView.Adapter<SongItemMainAdapter.CustomViewHolder> {

    private Context context;
    private ArrayList<SongItemMain> items;
    public SongItemMainAdapter(Context context, ArrayList<SongItemMain> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.songs_item_main_activity, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.itemTitle.setText(items.get(position).getSongName());
        holder.itemImage.setImageResource(items.get(position).getImageSongResourceId());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemTitle;
        public CustomViewHolder(View view) {
            super(view);
            itemImage = view.findViewById(R.id.image_main_1);
            itemTitle = view.findViewById(R.id.text_main1);
        }
    }
}