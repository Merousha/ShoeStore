package com.udacity.shoestore.databinding;
import com.udacity.shoestore.R;
import com.udacity.shoestore.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentShoeDetailBindingImpl extends FragmentShoeDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.shoeListTitle, 5);
        sViewsWithIds.put(R.id.shoeName_tv, 6);
        sViewsWithIds.put(R.id.company_tv, 7);
        sViewsWithIds.put(R.id.shoesize_tv, 8);
        sViewsWithIds.put(R.id.shoeDescription_tv, 9);
        sViewsWithIds.put(R.id.buttonCancel, 10);
        sViewsWithIds.put(R.id.buttonSave, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener comapnyandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of shoeListViewModel.shoeCompany
            //         is shoeListViewModel.setShoeCompany((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(comapny);
            // localize variables for thread safety
            // shoeListViewModel != null
            boolean shoeListViewModelJavaLangObjectNull = false;
            // shoeListViewModel
            com.udacity.shoestore.shoeList.ShoeListViewModel shoeListViewModel = mShoeListViewModel;
            // shoeListViewModel.shoeCompany
            java.lang.String shoeListViewModelShoeCompany = null;



            shoeListViewModelJavaLangObjectNull = (shoeListViewModel) != (null);
            if (shoeListViewModelJavaLangObjectNull) {




                shoeListViewModel.setShoeCompany(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener shoeDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of shoeListViewModel.shoeDescription
            //         is shoeListViewModel.setShoeDescription((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(shoeDescription);
            // localize variables for thread safety
            // shoeListViewModel != null
            boolean shoeListViewModelJavaLangObjectNull = false;
            // shoeListViewModel
            com.udacity.shoestore.shoeList.ShoeListViewModel shoeListViewModel = mShoeListViewModel;
            // shoeListViewModel.shoeDescription
            java.lang.String shoeListViewModelShoeDescription = null;



            shoeListViewModelJavaLangObjectNull = (shoeListViewModel) != (null);
            if (shoeListViewModelJavaLangObjectNull) {




                shoeListViewModel.setShoeDescription(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener shoeNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of shoeListViewModel.shoeName
            //         is shoeListViewModel.setShoeName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(shoeName);
            // localize variables for thread safety
            // shoeListViewModel != null
            boolean shoeListViewModelJavaLangObjectNull = false;
            // shoeListViewModel.shoeName
            java.lang.String shoeListViewModelShoeName = null;
            // shoeListViewModel
            com.udacity.shoestore.shoeList.ShoeListViewModel shoeListViewModel = mShoeListViewModel;



            shoeListViewModelJavaLangObjectNull = (shoeListViewModel) != (null);
            if (shoeListViewModelJavaLangObjectNull) {




                shoeListViewModel.setShoeName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener shoeSizeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of shoeListViewModel.shoeSize
            //         is shoeListViewModel.setShoeSize((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(shoeSize);
            // localize variables for thread safety
            // shoeListViewModel.shoeSize
            java.lang.String shoeListViewModelShoeSize = null;
            // shoeListViewModel != null
            boolean shoeListViewModelJavaLangObjectNull = false;
            // shoeListViewModel
            com.udacity.shoestore.shoeList.ShoeListViewModel shoeListViewModel = mShoeListViewModel;



            shoeListViewModelJavaLangObjectNull = (shoeListViewModel) != (null);
            if (shoeListViewModelJavaLangObjectNull) {




                shoeListViewModel.setShoeSize(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentShoeDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentShoeDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[11]
            , (android.widget.EditText) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[8]
            );
        this.comapny.setTag(null);
        this.shoeDescription.setTag(null);
        this.shoeDetail.setTag(null);
        this.shoeName.setTag(null);
        this.shoeSize.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.shoeListViewModel == variableId) {
            setShoeListViewModel((com.udacity.shoestore.shoeList.ShoeListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShoeListViewModel(@Nullable com.udacity.shoestore.shoeList.ShoeListViewModel ShoeListViewModel) {
        this.mShoeListViewModel = ShoeListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.shoeListViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String shoeListViewModelShoeSize = null;
        java.lang.String shoeListViewModelShoeName = null;
        java.lang.String shoeListViewModelShoeDescription = null;
        com.udacity.shoestore.shoeList.ShoeListViewModel shoeListViewModel = mShoeListViewModel;
        java.lang.String shoeListViewModelShoeCompany = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (shoeListViewModel != null) {
                    // read shoeListViewModel.shoeSize
                    shoeListViewModelShoeSize = shoeListViewModel.getShoeSize();
                    // read shoeListViewModel.shoeName
                    shoeListViewModelShoeName = shoeListViewModel.getShoeName();
                    // read shoeListViewModel.shoeDescription
                    shoeListViewModelShoeDescription = shoeListViewModel.getShoeDescription();
                    // read shoeListViewModel.shoeCompany
                    shoeListViewModelShoeCompany = shoeListViewModel.getShoeCompany();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.comapny, shoeListViewModelShoeCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.shoeDescription, shoeListViewModelShoeDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.shoeName, shoeListViewModelShoeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.shoeSize, shoeListViewModelShoeSize);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.comapny, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, comapnyandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.shoeDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, shoeDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.shoeName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, shoeNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.shoeSize, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, shoeSizeandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): shoeListViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}