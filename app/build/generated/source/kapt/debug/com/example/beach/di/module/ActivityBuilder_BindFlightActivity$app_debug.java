package com.example.beach.di.module;

import com.example.beach.di.annotations.ActivityScope;
import com.example.beach.features.activity.FlightActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent.class
)
public abstract class ActivityBuilder_BindFlightActivity$app_debug {
  private ActivityBuilder_BindFlightActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(FlightActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FlightActivitySubcomponent.Builder builder);

  @Subcomponent(modules = FragmentBuilder.class)
  @ActivityScope
  public interface FlightActivitySubcomponent extends AndroidInjector<FlightActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FlightActivity> {}
  }
}
