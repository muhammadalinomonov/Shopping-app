// Generated by Dagger (https://dagger.dev).
package uz.gita.shop_app.ui.screen.main.page.shopscreen;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.shop_app.domain.repository.ShopRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShopModel_Factory implements Factory<ShopModel> {
  private final Provider<ShopRepository> repositoryProvider;

  public ShopModel_Factory(Provider<ShopRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ShopModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ShopModel_Factory create(Provider<ShopRepository> repositoryProvider) {
    return new ShopModel_Factory(repositoryProvider);
  }

  public static ShopModel newInstance(ShopRepository repository) {
    return new ShopModel(repository);
  }
}
