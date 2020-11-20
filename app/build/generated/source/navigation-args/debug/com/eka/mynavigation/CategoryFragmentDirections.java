package com.eka.mynavigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CategoryFragmentDirections {
  private CategoryFragmentDirections() {
  }

  @NonNull
  public static ActionCategoryFragmentToDetailCategoryFragment actionCategoryFragmentToDetailCategoryFragment(
      ) {
    return new ActionCategoryFragmentToDetailCategoryFragment();
  }

  public static class ActionCategoryFragmentToDetailCategoryFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionCategoryFragmentToDetailCategoryFragment() {
    }

    @NonNull
    public ActionCategoryFragmentToDetailCategoryFragment setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      return this;
    }

    @NonNull
    public ActionCategoryFragmentToDetailCategoryFragment setStock(long stock) {
      this.arguments.put("stock", stock);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("name")) {
        String name = (String) arguments.get("name");
        __result.putString("name", name);
      }
      if (arguments.containsKey("stock")) {
        long stock = (long) arguments.get("stock");
        __result.putLong("stock", stock);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_categoryFragment_to_detailCategoryFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getName() {
      return (String) arguments.get("name");
    }

    @SuppressWarnings("unchecked")
    public long getStock() {
      return (long) arguments.get("stock");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCategoryFragmentToDetailCategoryFragment that = (ActionCategoryFragmentToDetailCategoryFragment) object;
      if (arguments.containsKey("name") != that.arguments.containsKey("name")) {
        return false;
      }
      if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
        return false;
      }
      if (arguments.containsKey("stock") != that.arguments.containsKey("stock")) {
        return false;
      }
      if (getStock() != that.getStock()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getName() != null ? getName().hashCode() : 0);
      result = 31 * result + (int)(getStock() ^ (getStock() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCategoryFragmentToDetailCategoryFragment(actionId=" + getActionId() + "){"
          + "name=" + getName()
          + ", stock=" + getStock()
          + "}";
    }
  }
}
