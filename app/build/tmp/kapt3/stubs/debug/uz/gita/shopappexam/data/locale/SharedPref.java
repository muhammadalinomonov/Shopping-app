package uz.gita.shopappexam.data.locale;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0018\u0010\u0011\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Luz/gita/shopappexam/data/locale/SharedPref;", "", "email", "", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "hasToken", "", "getHasToken", "()Z", "setHasToken", "(Z)V", "password", "getPassword", "setPassword", "token", "getToken", "setToken", "app_debug"})
public abstract interface SharedPref {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getToken();
    
    public abstract void setToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    public abstract boolean getHasToken();
    
    public abstract void setHasToken(boolean p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getEmail();
    
    public abstract void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getPassword();
    
    public abstract void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0);
}