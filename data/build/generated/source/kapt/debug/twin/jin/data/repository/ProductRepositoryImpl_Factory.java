// Generated by Dagger (https://dagger.dev).
package twin.jin.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import twin.jin.data.source.local.LocalDataSource;
import twin.jin.data.source.remote.AblyApi;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<LocalDataSource> localDataSourceProvider;

  private final Provider<AblyApi> apiProvider;

  public ProductRepositoryImpl_Factory(Provider<LocalDataSource> localDataSourceProvider,
      Provider<AblyApi> apiProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(localDataSourceProvider.get(), apiProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(
      Provider<LocalDataSource> localDataSourceProvider, Provider<AblyApi> apiProvider) {
    return new ProductRepositoryImpl_Factory(localDataSourceProvider, apiProvider);
  }

  public static ProductRepositoryImpl newInstance(LocalDataSource localDataSource, AblyApi api) {
    return new ProductRepositoryImpl(localDataSource, api);
  }
}
