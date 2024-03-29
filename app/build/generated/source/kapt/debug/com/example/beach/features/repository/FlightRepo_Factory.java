// Generated by Dagger (https://google.github.io/dagger).
package com.example.beach.features.repository;

import com.example.beach.apicalls.ServiceGateway;
import com.example.beach.backend.NetworkHelper;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FlightRepo_Factory implements Factory<FlightRepo> {
  private final Provider<ServiceGateway> serviceGatewayProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public FlightRepo_Factory(
      Provider<ServiceGateway> serviceGatewayProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.serviceGatewayProvider = serviceGatewayProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public FlightRepo get() {
    return provideInstance(serviceGatewayProvider, networkHelperProvider);
  }

  public static FlightRepo provideInstance(
      Provider<ServiceGateway> serviceGatewayProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new FlightRepo(serviceGatewayProvider.get(), networkHelperProvider.get());
  }

  public static FlightRepo_Factory create(
      Provider<ServiceGateway> serviceGatewayProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new FlightRepo_Factory(serviceGatewayProvider, networkHelperProvider);
  }

  public static FlightRepo newFlightRepo(
      ServiceGateway serviceGateway, NetworkHelper networkHelper) {
    return new FlightRepo(serviceGateway, networkHelper);
  }
}
