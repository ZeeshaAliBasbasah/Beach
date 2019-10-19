package com.example.beach.databinding;
import com.example.beach.R;
import com.example.beach.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHotelBindingImpl extends ActivityHotelBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imagesRecycleView, 5);
        sViewsWithIds.put(R.id.facilityText, 6);
        sViewsWithIds.put(R.id.facility, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityHotelBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityHotelBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ListView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.RatingBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            );
        this.hotelAddress.setTag(null);
        this.hotelDescription.setTag(null);
        this.hotelName.setTag(null);
        this.hotelRating.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.hotelViewModel == variableId) {
            setHotelViewModel((com.example.beach.features.viewmodel.HotelViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHotelViewModel(@Nullable com.example.beach.features.viewmodel.HotelViewModel HotelViewModel) {
        this.mHotelViewModel = HotelViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.hotelViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHotelViewModelHotelAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeHotelViewModelHotelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeHotelViewModelRating((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeHotelViewModelHotelName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHotelViewModelHotelAddress(androidx.lifecycle.MutableLiveData<java.lang.String> HotelViewModelHotelAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHotelViewModelHotelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> HotelViewModelHotelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHotelViewModelRating(androidx.lifecycle.MutableLiveData<java.lang.Integer> HotelViewModelRating, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHotelViewModelHotelName(androidx.lifecycle.MutableLiveData<java.lang.String> HotelViewModelHotelName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        int androidxDatabindingViewDataBindingSafeUnboxHotelViewModelRatingGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> hotelViewModelHotelAddress = null;
        java.lang.String hotelViewModelHotelDescriptionGetValue = null;
        java.lang.String hotelViewModelHotelNameGetValue = null;
        com.example.beach.features.viewmodel.HotelViewModel hotelViewModel = mHotelViewModel;
        java.lang.Integer hotelViewModelRatingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> hotelViewModelHotelDescription = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> hotelViewModelRating = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> hotelViewModelHotelName = null;
        java.lang.String hotelViewModelHotelAddressGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (hotelViewModel != null) {
                        // read hotelViewModel.hotelAddress
                        hotelViewModelHotelAddress = hotelViewModel.getHotelAddress();
                    }
                    updateLiveDataRegistration(0, hotelViewModelHotelAddress);


                    if (hotelViewModelHotelAddress != null) {
                        // read hotelViewModel.hotelAddress.getValue()
                        hotelViewModelHotelAddressGetValue = hotelViewModelHotelAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (hotelViewModel != null) {
                        // read hotelViewModel.hotelDescription
                        hotelViewModelHotelDescription = hotelViewModel.getHotelDescription();
                    }
                    updateLiveDataRegistration(1, hotelViewModelHotelDescription);


                    if (hotelViewModelHotelDescription != null) {
                        // read hotelViewModel.hotelDescription.getValue()
                        hotelViewModelHotelDescriptionGetValue = hotelViewModelHotelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (hotelViewModel != null) {
                        // read hotelViewModel.rating
                        hotelViewModelRating = hotelViewModel.getRating();
                    }
                    updateLiveDataRegistration(2, hotelViewModelRating);


                    if (hotelViewModelRating != null) {
                        // read hotelViewModel.rating.getValue()
                        hotelViewModelRatingGetValue = hotelViewModelRating.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(hotelViewModel.rating.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHotelViewModelRatingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(hotelViewModelRatingGetValue);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (hotelViewModel != null) {
                        // read hotelViewModel.hotelName
                        hotelViewModelHotelName = hotelViewModel.getHotelName();
                    }
                    updateLiveDataRegistration(3, hotelViewModelHotelName);


                    if (hotelViewModelHotelName != null) {
                        // read hotelViewModel.hotelName.getValue()
                        hotelViewModelHotelNameGetValue = hotelViewModelHotelName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hotelAddress, hotelViewModelHotelAddressGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hotelDescription, hotelViewModelHotelDescriptionGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.hotelName, hotelViewModelHotelNameGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.hotelRating, androidxDatabindingViewDataBindingSafeUnboxHotelViewModelRatingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hotelViewModel.hotelAddress
        flag 1 (0x2L): hotelViewModel.hotelDescription
        flag 2 (0x3L): hotelViewModel.rating
        flag 3 (0x4L): hotelViewModel.hotelName
        flag 4 (0x5L): hotelViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}