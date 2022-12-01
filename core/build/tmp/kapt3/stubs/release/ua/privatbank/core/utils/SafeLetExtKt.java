package ua.privatbank.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000,\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\b\u00a2\u0006\u0002\u0010\t\u001au\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\f\u00a2\u0006\u0002\u0010\r\u001a\u008f\u0001\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u000e*\u00020\u0003\"\b\b\u0004\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2\b\u0010\u000f\u001a\u0004\u0018\u0001H\u000e2&\u0010\u0007\u001a\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0010\u00a2\u0006\u0002\u0010\u0011\u001a\u00a9\u0001\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\n*\u00020\u0003\"\b\b\u0003\u0010\u000e*\u00020\u0003\"\b\b\u0004\u0010\u0012*\u00020\u0003\"\b\b\u0005\u0010\u0001*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u00042\b\u0010\u000b\u001a\u0004\u0018\u0001H\n2\b\u0010\u000f\u001a\u0004\u0018\u0001H\u000e2\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00122,\u0010\u0007\u001a(\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0014\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T3", "p3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "T4", "p4", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "T5", "p5", "Lkotlin/Function5;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "core_release"})
public final class SafeLetExtKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable()
    T1 p1, @org.jetbrains.annotations.Nullable()
    T2 p2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable()
    T1 p1, @org.jetbrains.annotations.Nullable()
    T2 p2, @org.jetbrains.annotations.Nullable()
    T3 p3, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable()
    T1 p1, @org.jetbrains.annotations.Nullable()
    T2 p2, @org.jetbrains.annotations.Nullable()
    T3 p3, @org.jetbrains.annotations.Nullable()
    T4 p4, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, T3 extends java.lang.Object, T4 extends java.lang.Object, T5 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable()
    T1 p1, @org.jetbrains.annotations.Nullable()
    T2 p2, @org.jetbrains.annotations.Nullable()
    T3 p3, @org.jetbrains.annotations.Nullable()
    T4 p4, @org.jetbrains.annotations.Nullable()
    T5 p5, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> block) {
        return null;
    }
}