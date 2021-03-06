// Generated by Dagger (https://dagger.dev).
package twin.jin.presentation.ui.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import twin.jin.domain.usecase.GetFavoritesUseCase;
import twin.jin.domain.usecase.SetFavoriteUseCase;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainSharedViewModel_Factory implements Factory<MainSharedViewModel> {
  private final Provider<SetFavoriteUseCase> setFavoriteUseCaseProvider;

  private final Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider;

  public MainSharedViewModel_Factory(Provider<SetFavoriteUseCase> setFavoriteUseCaseProvider,
      Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider) {
    this.setFavoriteUseCaseProvider = setFavoriteUseCaseProvider;
    this.getFavoritesUseCaseProvider = getFavoritesUseCaseProvider;
  }

  @Override
  public MainSharedViewModel get() {
    return newInstance(setFavoriteUseCaseProvider.get(), getFavoritesUseCaseProvider.get());
  }

  public static MainSharedViewModel_Factory create(
      Provider<SetFavoriteUseCase> setFavoriteUseCaseProvider,
      Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider) {
    return new MainSharedViewModel_Factory(setFavoriteUseCaseProvider, getFavoritesUseCaseProvider);
  }

  public static MainSharedViewModel newInstance(SetFavoriteUseCase setFavoriteUseCase,
      GetFavoritesUseCase getFavoritesUseCase) {
    return new MainSharedViewModel(setFavoriteUseCase, getFavoritesUseCase);
  }
}
