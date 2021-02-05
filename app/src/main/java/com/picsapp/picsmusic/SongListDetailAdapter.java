package com.picsapp.picsmusic;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/*
 * {@link SongListDetailAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link songListDetail} objects.
 * */
public class SongListDetailAdapter extends ArrayAdapter<SongListDetail> {

    private static final String LOG_TAG = SongListDetailAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songListDetail A List of songListDetail objects to display in a list
     */
    public SongListDetailAdapter(Activity context, ArrayList<SongListDetail> songListDetail) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songListDetail);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_item, parent, false);
        }

        // Get the {@link songListDetail} object located at this position in the list
        SongListDetail currentSongListDetail = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView SongTextView = listItemView.findViewById(R.id.song_name);
        // Get the version name from the current songListDetail object and
        // set this text on the name TextView
        SongTextView.setText(currentSongListDetail.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView SingerTextView = listItemView.findViewById(R.id.singer_name);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        SingerTextView.setText(currentSongListDetail.getSingerName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = listItemView.findViewById(R.id.song_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentSongListDetail.getImageSongResourceId());


        // Find the ImageView in the list_item.xml layout with the ID Menu
        ImageView MenuView = listItemView.findViewById(R.id.Menu);
        // Get the image resource ID from the current SongListDetail object and
        // set the image to iconView
        MenuView.setImageResource(currentSongListDetail.getImageMenuResourceId());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
