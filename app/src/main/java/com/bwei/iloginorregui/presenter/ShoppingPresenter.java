package com.bwei.iloginorregui.presenter;

import com.bwei.iloginorregui.core.DataCall;
import com.bwei.iloginorregui.core.ILogin;
import com.bwei.iloginorregui.http.HttpUtils;

import io.reactivex.Observable;

public class ShoppingPresenter extends BasePresenter {
    public ShoppingPresenter(DataCall dataCall) {
        super(dataCall);
    }

    @Override
    protected Observable observable(Object... args) {
        ILogin iLogin = HttpUtils.getHttpUtils().create(ILogin.class);
        return iLogin.findShopping((Integer)args[0],(String)args[1]);
    }
}
