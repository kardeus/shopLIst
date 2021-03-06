// Generated by Dagger (https://dagger.dev).
package twin.jin.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import twin.jin.data.source.local.LocalDataSource;
import twin.jin.data.source.local.ProductQuery;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataSourceModule_ProvideLocalDataSourceFactory implements Factory<LocalDataSource> {
  private final Provider<ProductQuery> queryProvider;

  public LocalDataSourceModule_ProvideLocalDataSourceFactory(Provider<ProductQuery> queryProvider) {
    this.queryProvider = queryProvider;
  }

  @Override
  public LocalDataSource get() {
    return provideLocalDataSource(queryProvider.get());
  }

  public static LocalDataSourceModule_ProvideLocalDataSourceFactory create(
      Provider<ProductQuery> queryProvider) {
    return new LocalDataSourceModule_ProvideLocalDataSourceFactory(queryProvider);
  }

  public static LocalDataSource provideLocalDataSource(ProductQuery query) {
    return Preconditions.checkNotNullFromProvides(LocalDataSourceModule.INSTANCE.provideLocalDataSource(query));
  }
}
