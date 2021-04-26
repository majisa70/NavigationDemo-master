// Generated by data binding compiler. Do not edit!
package com.example.android.navigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.navigation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentGameWonBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout gameWonConstraintLayout;

  @NonNull
  public final Button nextMatchButton;

  @NonNull
  public final TextView times;

  @NonNull
  public final ImageView youWinImage;

  protected FragmentGameWonBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout gameWonConstraintLayout, Button nextMatchButton, TextView times,
      ImageView youWinImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.gameWonConstraintLayout = gameWonConstraintLayout;
    this.nextMatchButton = nextMatchButton;
    this.times = times;
    this.youWinImage = youWinImage;
  }

  @NonNull
  public static FragmentGameWonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameWonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentGameWonBinding>inflateInternal(inflater, R.layout.fragment_game_won, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentGameWonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_game_won, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentGameWonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentGameWonBinding>inflateInternal(inflater, R.layout.fragment_game_won, null, false, component);
  }

  public static FragmentGameWonBinding bind(@NonNull View view) {
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
  public static FragmentGameWonBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentGameWonBinding)bind(component, view, R.layout.fragment_game_won);
  }
}