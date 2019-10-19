// Generated by Dagger (https://google.github.io/dagger).
package com.example.beach.di;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import androidx.lifecycle.ViewModel;
import com.example.beach.MVVMApplication;
import com.example.beach.apicalls.ServiceGateway;
import com.example.beach.backend.NetworkHelper_Factory;
import com.example.beach.di.module.ActivityBuilder_BindFlightActivity$app_debug;
import com.example.beach.di.module.ActivityBuilder_BindHotelActivity$app_debug;
import com.example.beach.di.module.NetworkModule;
import com.example.beach.di.module.NetworkModule_GetBaseUrlFactory;
import com.example.beach.di.module.NetworkModule_ProvideGatewayFactory;
import com.example.beach.di.module.NetworkModule_ProvideGsonFactory;
import com.example.beach.di.module.NetworkModule_ProvideRetroFitFactory;
import com.example.beach.features.activity.FlightActivity;
import com.example.beach.features.activity.FlightActivity_MembersInjector;
import com.example.beach.features.activity.HotelActivity;
import com.example.beach.features.activity.HotelActivity_MembersInjector;
import com.example.beach.features.repository.FlightRepo;
import com.example.beach.features.repository.FlightRepo_Factory;
import com.example.beach.features.repository.HotelRepo;
import com.example.beach.features.repository.HotelRepo_Factory;
import com.example.beach.features.viewmodel.FlightViewModel;
import com.example.beach.features.viewmodel.FlightViewModel_Factory;
import com.example.beach.features.viewmodel.HotelViewModel;
import com.example.beach.features.viewmodel.HotelViewModel_Factory;
import com.google.gson.Gson;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent.Builder>
      flightActivitySubcomponentBuilderProvider;

  private Provider<ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent.Builder>
      hotelActivitySubcomponentBuilderProvider;

  private Provider<Gson> provideGsonProvider;

  private NetworkModule_GetBaseUrlFactory getBaseUrlProvider;

  private Provider<Retrofit> provideRetroFitProvider;

  private Provider<ServiceGateway> provideGatewayProvider;

  private Provider<FlightRepo> flightRepoProvider;

  private FlightViewModel_Factory flightViewModelProvider;

  private Provider<HotelRepo> hotelRepoProvider;

  private HotelViewModel_Factory hotelViewModelProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2)
        .put(FlightActivity.class, (Provider) flightActivitySubcomponentBuilderProvider)
        .put(HotelActivity.class, (Provider) hotelActivitySubcomponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap(),
        Collections
            .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
                emptyMap(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Activity>>>emptyMap());
  }

  private DispatchingAndroidInjector<BroadcastReceiver>
      getDispatchingAndroidInjectorOfBroadcastReceiver() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap(),
        Collections
            .<Class<? extends BroadcastReceiver>,
                Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
                emptyMap(),
        Collections
            .<String, Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>emptyMap());
  }

  private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap(),
        Collections
            .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
                emptyMap(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Fragment>>>emptyMap());
  }

  private DispatchingAndroidInjector<Service> getDispatchingAndroidInjectorOfService() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap(),
        Collections
            .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>
                emptyMap(),
        Collections.<String, Provider<AndroidInjector.Factory<? extends Service>>>emptyMap());
  }

  private DispatchingAndroidInjector<ContentProvider>
      getDispatchingAndroidInjectorOfContentProvider() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf(),
        Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap(),
        Collections
            .<Class<? extends ContentProvider>,
                Provider<AndroidInjector.Factory<? extends ContentProvider>>>
                emptyMap(),
        Collections
            .<String, Provider<AndroidInjector.Factory<? extends ContentProvider>>>emptyMap());
  }

  private Map<Class<? extends ViewModel>, Provider<ViewModel>>
      getMapOfClassOfAndProviderOfViewModel() {
    return MapBuilder.<Class<? extends ViewModel>, Provider<ViewModel>>newMapBuilder(2)
        .put(FlightViewModel.class, (Provider) flightViewModelProvider)
        .put(HotelViewModel.class, (Provider) hotelViewModelProvider)
        .build();
  }

  private ViewModelFactory getViewModelFactory() {
    return new ViewModelFactory(getMapOfClassOfAndProviderOfViewModel());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.flightActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent.Builder
              get() {
            return new FlightActivitySubcomponentBuilder();
          }
        };
    this.hotelActivitySubcomponentBuilderProvider =
        new Provider<
            ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent.Builder
              get() {
            return new HotelActivitySubcomponentBuilder();
          }
        };
    this.provideGsonProvider =
        DoubleCheck.provider(NetworkModule_ProvideGsonFactory.create(builder.networkModule));
    this.getBaseUrlProvider = NetworkModule_GetBaseUrlFactory.create(builder.networkModule);
    this.provideRetroFitProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetroFitFactory.create(
                builder.networkModule, provideGsonProvider, getBaseUrlProvider));
    this.provideGatewayProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideGatewayFactory.create(
                builder.networkModule, provideRetroFitProvider));
    this.flightRepoProvider =
        DoubleCheck.provider(
            FlightRepo_Factory.create(provideGatewayProvider, NetworkHelper_Factory.create()));
    this.flightViewModelProvider = FlightViewModel_Factory.create(flightRepoProvider);
    this.hotelRepoProvider =
        DoubleCheck.provider(
            HotelRepo_Factory.create(provideGatewayProvider, NetworkHelper_Factory.create()));
    this.hotelViewModelProvider = HotelViewModel_Factory.create(hotelRepoProvider);
  }

  @Override
  public void inject(MVVMApplication arg0) {
    injectMVVMApplication(arg0);
  }

  private MVVMApplication injectMVVMApplication(MVVMApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance, getDispatchingAndroidInjectorOfActivity());
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance, getDispatchingAndroidInjectorOfBroadcastReceiver());
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance, getDispatchingAndroidInjectorOfFragment());
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance, getDispatchingAndroidInjectorOfService());
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance, getDispatchingAndroidInjectorOfContentProvider());
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    return instance;
  }

  private static final class Builder extends AppComponent.Builder {
    private NetworkModule networkModule;

    private MVVMApplication seedInstance;

    @Override
    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(MVVMApplication.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public void seedInstance(MVVMApplication arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class FlightActivitySubcomponentBuilder
      extends ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent.Builder {
    private FlightActivity seedInstance;

    @Override
    public ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(FlightActivity.class.getCanonicalName() + " must be set");
      }
      return new FlightActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(FlightActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class FlightActivitySubcomponentImpl
      implements ActivityBuilder_BindFlightActivity$app_debug.FlightActivitySubcomponent {
    private FlightActivitySubcomponentImpl(FlightActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(FlightActivity arg0) {
      injectFlightActivity(arg0);
    }

    private FlightActivity injectFlightActivity(FlightActivity instance) {
      FlightActivity_MembersInjector.injectViewModelFactory(
          instance, DaggerAppComponent.this.getViewModelFactory());
      return instance;
    }
  }

  private final class HotelActivitySubcomponentBuilder
      extends ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent.Builder {
    private HotelActivity seedInstance;

    @Override
    public ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(HotelActivity.class.getCanonicalName() + " must be set");
      }
      return new HotelActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(HotelActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class HotelActivitySubcomponentImpl
      implements ActivityBuilder_BindHotelActivity$app_debug.HotelActivitySubcomponent {
    private HotelActivitySubcomponentImpl(HotelActivitySubcomponentBuilder builder) {}

    @Override
    public void inject(HotelActivity arg0) {
      injectHotelActivity(arg0);
    }

    private HotelActivity injectHotelActivity(HotelActivity instance) {
      HotelActivity_MembersInjector.injectViewModelFactory(
          instance, DaggerAppComponent.this.getViewModelFactory());
      return instance;
    }
  }
}
