package com.usav.todo.client.application.home;

import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.usav.todo.client.application.ApplicationPresenter;
import com.usav.todo.client.place.NameTokens;

import javax.inject.Inject;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy>
{
    public interface MyView extends View
    {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter>
    {
    }

    @Inject
    HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy)
    {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
