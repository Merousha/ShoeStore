package com.udacity.shoestore.shoeList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r\u00a8\u0006\""}, d2 = {"Lcom/udacity/shoestore/shoeList/ShoeListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_shoeList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/udacity/shoestore/shoeList/models/Shoe;", "_shoes", "shoeCompany", "", "getShoeCompany", "()Ljava/lang/String;", "setShoeCompany", "(Ljava/lang/String;)V", "shoeDescription", "getShoeDescription", "setShoeDescription", "shoeList", "Landroidx/lifecycle/LiveData;", "getShoeList", "()Landroidx/lifecycle/LiveData;", "shoeName", "getShoeName", "setShoeName", "shoeSize", "getShoeSize", "setShoeSize", "addNewShoe", "", "name", "size", "", "company", "desc", "app_debug"})
public final class ShoeListViewModel extends androidx.lifecycle.ViewModel {
    private final java.util.List<com.udacity.shoestore.shoeList.models.Shoe> _shoes = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.udacity.shoestore.shoeList.models.Shoe>> _shoeList = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shoeName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shoeCompany = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shoeSize = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String shoeDescription = "";
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.udacity.shoestore.shoeList.models.Shoe>> getShoeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShoeName() {
        return null;
    }
    
    public final void setShoeName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShoeCompany() {
        return null;
    }
    
    public final void setShoeCompany(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShoeSize() {
        return null;
    }
    
    public final void setShoeSize(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShoeDescription() {
        return null;
    }
    
    public final void setShoeDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Shoe function called directly from SAVE button
     */
    public final void addNewShoe(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double size, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
    }
    
    public ShoeListViewModel() {
        super();
    }
}