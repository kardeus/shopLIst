// Generated by Dagger (https://dagger.dev).
package twin.jin.data.di;

import android.content.Context;
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
public final class OkHttpClientModule_ProvideOkHttpClientBuilderFactory implements Factory<OkHttpClient.Builder> {
  private final Provider<Context> contextProvider;

  public OkHttpClientModule_ProvideOkHttpClientBuilderFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public OkHttpClient.Builder get() {
    return provideOkHttpClientBuilder(contextProvider.get());
  }

  public static OkHttpClientModule_ProvideOkHttpClientBuilderFactory create(
      Provider<Context> contextProvider) {
    return new OkHttpClientModule_ProvideOkHttpClientBuilderFactory(contextProvider);
  }

  public static OkHttpClient.Builder provideOkHttpClientBuilder(Context context) {
    return Preconditions.checkNotNullFromProvides(OkHttpClientModule.INSTANCE.provideOkHttpClientBuilder(context));
  }
}
