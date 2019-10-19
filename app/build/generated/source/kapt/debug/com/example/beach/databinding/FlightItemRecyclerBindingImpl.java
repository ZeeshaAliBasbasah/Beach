package com.example.beach.databinding;
import com.example.beach.R;
import com.example.beach.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FlightItemRecyclerBindingImpl extends FlightItemRecyclerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.myRectangleView, 7);
        sViewsWithIds.put(R.id.from, 8);
        sViewsWithIds.put(R.id.to, 9);
        sViewsWithIds.put(R.id.departure, 10);
        sViewsWithIds.put(R.id.arrival, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FlightItemRecyclerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FlightItemRecyclerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[9]
            );
        this.arrivalAirPort.setTag(null);
        this.arrivalDate.setTag(null);
        this.cardView.setTag(null);
        this.departureAirPort.setTag(null);
        this.departuredate.setTag(null);
        this.flightName.setTag(null);
        this.price.setTag(null);
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
        if (BR.flight == variableId) {
            setFlight((com.example.beach.features.model.Flight) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlight(@Nullable com.example.beach.features.model.Flight Flight) {
        this.mFlight = Flight;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.flight);
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
        java.lang.String flightAirline = null;
        java.lang.String charStringValueOfFlightPrice = null;
        java.lang.String flightArrivalDate = null;
        int flightPrice = 0;
        java.lang.String flightArrivalAirport = null;
        java.lang.String stringValueOfFlightPrice = null;
        java.lang.String flightDepartureDate = null;
        java.lang.String flightDepartureAirport = null;
        java.lang.String flightConvertDateFlightDepartureDate = null;
        java.lang.String flightConvertDateFlightArrivalDate = null;
        com.example.beach.features.model.Flight flight = mFlight;

        if ((dirtyFlags & 0x3L) != 0) {



                if (flight != null) {
                    // read flight.airline
                    flightAirline = flight.getAirline();
                    // read flight.arrival_date
                    flightArrivalDate = flight.getArrival_date();
                    // read flight.price
                    flightPrice = flight.getPrice();
                    // read flight.arrival_airport
                    flightArrivalAirport = flight.getArrival_airport();
                    // read flight.departure_date
                    flightDepartureDate = flight.getDeparture_date();
                    // read flight.departure_airport
                    flightDepartureAirport = flight.getDeparture_airport();
                }


                if (flight != null) {
                    // read flight.convertDate(flight.arrival_date)
                    flightConvertDateFlightArrivalDate = flight.convertDate(flightArrivalDate);
                    // read flight.convertDate(flight.departure_date)
                    flightConvertDateFlightDepartureDate = flight.convertDate(flightDepartureDate);
                }
                // read String.valueOf(flight.price)
                stringValueOfFlightPrice = java.lang.String.valueOf(flightPrice);


                // read ('$') + (String.valueOf(flight.price))
                charStringValueOfFlightPrice = ('$') + (stringValueOfFlightPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.arrivalAirPort, flightArrivalAirport);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.arrivalDate, flightConvertDateFlightArrivalDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.departureAirPort, flightDepartureAirport);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.departuredate, flightConvertDateFlightDepartureDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.flightName, flightAirline);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.price, charStringValueOfFlightPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): flight
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}