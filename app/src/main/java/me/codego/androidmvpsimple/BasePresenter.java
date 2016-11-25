package me.codego.androidmvpsimple;

import java.lang.ref.WeakReference;

/**
 * Created by mengxn on 16-11-25.
 */
public  class BasePresenter<V> implements IPresenter<V> {

    private WeakReference<V> viewRef;

    public BasePresenter(V v) {
        attachView(v);
    }

    @Override
    public void attachView(V view) {
        viewRef = new WeakReference<V>(view);
    }

    @Override
    public void detachView() {
        if (viewRef != null) {
            viewRef.clear();
            viewRef = null;
        }
    }

    @Override
    public V getView() {
        return viewRef.get();
    }
}
