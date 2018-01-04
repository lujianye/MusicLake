package com.cyl.musiclake.ui.music.contract;


import com.cyl.musiclake.ui.music.model.Artist;
import com.cyl.musiclake.ui.base.BasePresenter;
import com.cyl.musiclake.ui.base.BaseView;

import java.util.List;

public interface ArtistContract {

    interface View extends BaseView {

        void showArtists(List<Artist> artists);

        void showEmptyView();
    }

    interface Presenter extends BasePresenter<View> {

        void loadArtists(String action);
    }
}