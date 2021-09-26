// Generated by Dagger (https://dagger.dev).
package twin.jin.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OkHttpClientModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<OkHttpClient.Builder> builderProvider;

  public OkHttpClientModule_ProvideOkHttpClientFactory(
      Provider<OkHttpClient.Builder> builderProvider) {
    this.builderProvider = builderProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(builderProvider.get());
  }

  public static OkHttpClientModule_ProvideOkHttpClientFactory create(
      Provider<OkHttpClient.Builder> builderProvider) {
    return new OkHttpClientModule_ProvideOkHttpClientFactory(builderProvider);
  }

  public static OkHttpClient provideOkHttpClient(OkHttpClient.Builder builder) {
    return Preconditions.checkNotNullFromProvides(OkHttpClientModule.INSTANCE.provideOkHttpClient(builder));
  }
}