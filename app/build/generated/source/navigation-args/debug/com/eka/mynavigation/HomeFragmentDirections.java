package com.eka.mynavigation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileActivity() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileActivity);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToCategoryFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_categoryFragment);
  }
}
