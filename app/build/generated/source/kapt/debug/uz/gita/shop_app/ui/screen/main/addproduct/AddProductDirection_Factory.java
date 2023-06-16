// Generated by Dagger (https://dagger.dev).
package uz.gita.shop_app.ui.screen.main.addproduct;

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
public final class AddProductDirection_Factory implements Factory<AddProductDirection> {
  private final Provider<AppNavigator> navigatorProvider;

  public AddProductDirection_Factory(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  @Override
  public AddProductDirection get() {
    return newInstance(navigatorProvider.get());
  }

  public static AddProductDirection_Factory create(Provider<AppNavigator> navigatorProvider) {
    return new AddProductDirection_Factory(navigatorProvider);
  }

  public static AddProductDirection newInstance(AppNavigator navigator) {
    return new AddProductDirection(navigator);
  }
}