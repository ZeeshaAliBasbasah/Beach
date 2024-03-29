// Generated by Dagger (https://google.github.io/dagger).
package com.example.beach.di.module;

import android.app.Application;
import com.example.beach.MVVMApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideApplicationFactory implements Factory<Application> {
  private final AppModule module;

  private final Provider<MVVMApplication> applicationProvider;

  public AppModule_ProvideApplicationFactory(
      AppModule module, Provider<MVVMApplication> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Application get() {
    return provideInstance(module, applicationProvider);
  }

  public static Application provideInstance(
      AppModule module, Provider<MVVMApplication> applicationProvider) {
    return proxyProvideApplication(module, applicationProvider.get());
  }

  public static AppModule_ProvideApplicationFactory create(
      AppModule module, Provider<MVVMApplication> applicationProvider) {
    return new AppModule_ProvideApplicationFactory(module, applicationProvider);
  }

  public static Application proxyProvideApplication(
      AppModule instance, MVVMApplication application) {
    return Preconditions.checkNotNull(
        instance.provideApplication(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
