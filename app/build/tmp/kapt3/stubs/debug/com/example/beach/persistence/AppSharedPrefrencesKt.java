package com.example.beach.persistence;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a4\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u0001H\u0007H\u0086\n\u00a2\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0086\u0002\u00a8\u0006\u000f"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "get", "T", "", "key", "", "defaultValue", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "set", "value", "app_debug"})
public final class AppSharedPrefrencesKt {
    
    public static final void edit(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$edit, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    /**
     * puts a key value pair in shared prefs if doesn't exists, otherwise updates value on given [key]
     */
    public static final void set(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$set, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
}