package com.photy

import com.photy.data.NetworkModule
import com.photy.ui.base.mvp.BaseFragment
import com.photy.ui.photos.PhotosPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton @Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface AppComponent {

  fun getPhotoPresenter(): PhotosPresenter

  fun inject(fragment: BaseFragment)
}