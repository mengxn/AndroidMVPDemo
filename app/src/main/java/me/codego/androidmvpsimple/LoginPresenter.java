package me.codego.androidmvpsimple;

import android.os.Handler;

/**
 * Created by mengxn on 16-11-25.
 */

public class LoginPresenter extends BasePresenter<ILoginView> {

    private Handler handler = new Handler();

    public LoginPresenter(ILoginView view) {
        super(view);
    }

    public void submit(String username, String password) {
        getView().showLoading();

        //模拟请求数据
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                getView().hideLoading();
                getView().onSuccess();
            }
        }, 2000);
    }
}
