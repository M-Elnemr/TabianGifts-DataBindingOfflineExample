package elnemr.com.databinding.databinding;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import elnemr.com.databinding.adapters.CartItemAdapter;
import elnemr.com.databinding.models.CartItem;

public class ViewCartFragmentBindingAdapters {

    private static final String TAG = "ViewCartFragmentBinding";


    @BindingAdapter("cartItems")
    public static void setCartItems(RecyclerView view, List<CartItem> cartItems){
        if(cartItems == null){
            return;
        }
        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null){
            view.setLayoutManager(new LinearLayoutManager(view.getContext()));
        }
        CartItemAdapter adapter = (CartItemAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new CartItemAdapter(view.getContext(), cartItems);
            view.setAdapter(adapter);
        }
        else{
            adapter.updateCartItems(cartItems);
        }
    }

}





















