package com.duonghb.testbitrise.di

import android.content.Context
import com.duonghb.testbitrise.util.rx.AppSchedulerProvider
import com.duonghb.testbitrise.util.rx.SchedulerProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SchedulerModule {

    @Binds
    abstract fun bindScheduler(appScheduleProvider: AppSchedulerProvider): SchedulerProvider
}
