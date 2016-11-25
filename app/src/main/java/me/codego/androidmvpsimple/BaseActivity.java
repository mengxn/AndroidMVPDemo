package me.codego.androidmvpsimple;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by mengxn on 16-11-25.
 */

public abstract class BaseActivity<V, P extends BasePresenter> extends Activity {

    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    public abstract P createPresenter(V v);
}
