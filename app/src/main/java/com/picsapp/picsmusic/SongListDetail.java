package com.picsapp.picsmusic;

public class SongListDetail {

    // Name of the song
    private String mSongName;

    // Singer name
    private String mSingerName;

    // Drawable resource ID for song image
    private int mImageSongResourceId;

    // Drawable resource ID for menu image
    private int mImageMenuResourceId;


    /*
     * Create a new SongDetail object.
     * @param vSongName is the name of the song
     * @param vSongSinger is the singer name
     * @param imageSongResourceId is drawable reference ID that corresponds to the Android version
     * @param imageMenuResourceId is drawable reference ID that corresponds to the Android version
     * */
    public SongListDetail(String vSongName, String vSingerName, int imageSongResourceId, int imageMenuResourceId)
    {
        mSongName = vSongName;
        mSingerName = vSingerName;
        mImageSongResourceId = imageSongResourceId;
        mImageMenuResourceId = imageMenuResourceId;
    }


    // get the name of the song
    public String getSongName() {
        return mSongName;
    }

    // get the singer name
    public String getSingerName() {
        return mSingerName;
    }

    // get image of the song resource id
    public int getImageSongResourceId() {
        return mImageSongResourceId;
    }

    // get image of the song resource id
    public int getImageMenuResourceId() {
        return mImageMenuResourceId;
    }

}
