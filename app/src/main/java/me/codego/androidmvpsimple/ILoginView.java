package me.codego.androidmvpsimple;

/**
 * Created by mengxn on 16-11-25.
 */

public interface ILoginView {

    void showLoading();

    void hideLoading();

    void onSuccess();

    void onFailure();
}
