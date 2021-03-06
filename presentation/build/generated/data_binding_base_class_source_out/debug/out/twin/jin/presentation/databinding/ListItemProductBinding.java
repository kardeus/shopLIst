// Generated by data binding compiler. Do not edit!
package twin.jin.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import twin.jin.domain.data.ProductUiData;
import twin.jin.presentation.R;

public abstract class ListItemProductBinding extends ViewDataBinding {
  @NonNull
  public final TextView discountRate;

  @NonNull
  public final ImageView image;

  @NonNull
  public final AppCompatImageView like;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView newBadge;

  @NonNull
  public final TextView price;

  @NonNull
  public final TextView sellCount;

  @Bindable
  protected ProductUiData mProduct;

  protected ListItemProductBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView discountRate, ImageView image, AppCompatImageView like, TextView name,
      TextView newBadge, TextView price, TextView sellCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.discountRate = discountRate;
    this.image = image;
    this.like = like;
    this.name = name;
    this.newBadge = newBadge;
    this.price = price;
    this.sellCount = sellCount;
  }

  public abstract void setProduct(@Nullable ProductUiData product);

  @Nullable
  public ProductUiData getProduct() {
    return mProduct;
  }

  @NonNull
  public static ListItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_product, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemProductBinding>inflateInternal(inflater, R.layout.list_item_product, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_product, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemProductBinding>inflateInternal(inflater, R.layout.list_item_product, null, false, component);
  }

  public static ListItemProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemProductBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemProductBinding)bind(component, view, R.layout.list_item_product);
  }
}
