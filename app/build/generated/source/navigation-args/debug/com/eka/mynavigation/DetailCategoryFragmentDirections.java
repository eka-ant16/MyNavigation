package com.eka.mynavigation;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class DetailCategoryFragmentDirections {
  private DetailCategoryFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailCategoryFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailCategoryFragment_to_homeFragment);
  }
}
