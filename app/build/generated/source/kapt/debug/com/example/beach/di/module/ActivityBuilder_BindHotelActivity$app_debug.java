package com.example.beach.di.module;

import com.example.beach.di.annotations.ActivityScope;
import com.example.beach.features.activity.HotelActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent.class)
public abstract class ActivityBuilder_BindHotelActivity$app_debug {
  private ActivityBuilder_BindHotelActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(HotelActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HotelActivitySubcomponent.Builder builder);

  @Subcomponent(modules = FragmentBuilder.class)
  @ActivityScope
  public interface HotelActivitySubcomponent extends AndroidInjector<HotelActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HotelActivity> {}
  }
}
