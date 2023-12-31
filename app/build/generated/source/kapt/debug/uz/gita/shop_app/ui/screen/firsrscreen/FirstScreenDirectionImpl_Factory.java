// Generated by Dagger (https://dagger.dev).
package uz.gita.shop_app.ui.screen.firsrscreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.shop_app.navigation.AppNavigator;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FirstScreenDirectionImpl_Factory implements Factory<FirstScreenDirectionImpl> {
  private final Provider<AppNavigator> navigatorProvider;

  public FirstScreenDirectionImpl_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public FirstScreenDirectionImpl get() {
    return newInstance(navigatorProvider.get());
  }

  public static FirstScreenDirectionImpl_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new FirstScreenDirectionImpl_Factory(navigatorProvider);
  }

  public static FirstScreenDirectionImpl newInstance(AppNavigator navigator) {
    return new FirstScreenDirectionImpl(navigator);
  }
}
