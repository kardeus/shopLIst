// Generated by data binding compiler. Do not edit!
package twin.jin.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Deprecated;
import java.lang.Object;
import twin.jin.presentation.R;

public abstract class CellBannerBinding extends ViewDataBinding {
  @NonNull
  public final TextView indicator;

  @NonNull
  public final ViewPager2 vpBanner;

  protected CellBannerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView indicator, ViewPager2 vpBanner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.indicator = indicator;
    this.vpBanner = vpBanner;
  }

  @NonNull
  public static CellBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cell_banner, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CellBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CellBannerBinding>inflateInternal(inflater, R.layout.cell_banner, root, attachToRoot, component);
  }

  @NonNull
  public static CellBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.cell_banner, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CellBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CellBannerBinding>inflateInternal(inflater, R.layout.cell_banner, null, false, component);
  }

  public static CellBannerBinding bind(@NonNull View view) {
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
  public static CellBannerBinding bind(@NonNull View view, @Nullable Object component) {
    return (CellBannerBinding)bind(component, view, R.layout.cell_banner);
  }
}