// Generated by Dagger (https://dagger.dev).
package uz.gita.shop_app.domain.repository.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uz.gita.shopappexam.data.locale.SharedPref;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ShopRepositoryImpl_Factory implements Factory<ShopRepositoryImpl> {
  private final Provider<SharedPref> sharedPrefProvider;

  public ShopRepositoryImpl_Factory(Provider<SharedPref> sharedPrefProvider) {
    this.sharedPrefProvider = sharedPrefProvider;
  }

  @Override
  public ShopRepositoryImpl get() {
    ShopRepositoryImpl instance = newInstance();
    ShopRepositoryImpl_MembersInjector.injectSharedPref(instance, sharedPrefProvider.get());
    return instance;
  }

  public static ShopRepositoryImpl_Factory create(Provider<SharedPref> sharedPrefProvider) {
    return new ShopRepositoryImpl_Factory(sharedPrefProvider);
  }

  public static ShopRepositoryImpl newInstance() {
    return new ShopRepositoryImpl();
  }
}
