package br.com.heiderlopes.githubaac.di.modules


import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeUserProfileFragment(): UserProfileFragment

}

