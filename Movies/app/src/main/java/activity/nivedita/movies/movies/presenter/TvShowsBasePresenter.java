package activity.nivedita.movies.movies.presenter;

import activity.nivedita.movies.movies.view.TVShowsView;

/**
 * The base presenter for tv shows to be implemented by main TV shows presenter.
 */

public interface TvShowsBasePresenter<V extends TVShowsView> extends Presenter<V> {

    void onFragmentViewInitialized();
}
