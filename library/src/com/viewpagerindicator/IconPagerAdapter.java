package com.viewpagerindicator;

import android.graphics.drawable.Drawable;

public interface IconPagerAdapter {
    /**
     * Get icon representing the page at {@code index} in the adapter.
     */
    int getIconResId(int index);

  /**
   * Drawable version, if icon version returns 0.
   */
  Drawable getDrawable(int index);

  // From PagerAdapter
    int getCount();
}
