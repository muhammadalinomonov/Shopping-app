// Generated by Dagger (https://dagger.dev).
package uz.gita.shop_app.ui.screen.onBoarding;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OnBoardingModel_Factory implements Factory<OnBoardingModel> {
  private final Provider<OnBoardingDirection> directionProvider;

  public OnBoardingModel_Factory(Provider<OnBoardingDirection> directionProvider) {
    this.directionProvider = directionProvider;
  }

  @Override
  public OnBoardingModel get() {
    return newInstance(directionProvider.get());
  }

  public static OnBoardingModel_Factory create(Provider<OnBoardingDirection> directionProvider) {
    return new OnBoardingModel_Factory(directionProvider);
  }

  public static OnBoardingModel newInstance(OnBoardingDirection direction) {
    return new OnBoardingModel(direction);
  }
}