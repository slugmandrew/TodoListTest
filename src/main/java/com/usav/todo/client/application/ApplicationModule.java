package com.usav.todo.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.usav.todo.client.application.error.ErrorModule;
import com.usav.todo.client.application.home.HomeModule;

public class ApplicationModule extends AbstractPresenterModule
{
    @Override
    protected void configure()
    {
        install(new HomeModule());

        install(new ErrorModule());

        bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class, ApplicationPresenter.MyProxy.class);
    }
}
