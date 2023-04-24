// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.fragment.student;

import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StudentReadFragment_ViewBinding implements Unbinder {
  private StudentReadFragment target;

  private View view7f0800f0;

  @UiThread
  public StudentReadFragment_ViewBinding(final StudentReadFragment target, View source) {
    this.target = target;

    View view;
    target.listView = Utils.findRequiredViewAsType(source, R.id.student_lv, "field 'listView'", ListView.class);
    target.sp_year = Utils.findRequiredViewAsType(source, R.id.spinner_year, "field 'sp_year'", Spinner.class);
    target.sp_month = Utils.findRequiredViewAsType(source, R.id.spinner_month, "field 'sp_month'", Spinner.class);
    view = Utils.findRequiredView(source, R.id.student_read_btn, "method 'onClick'");
    view7f0800f0 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StudentReadFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.sp_year = null;
    target.sp_month = null;

    view7f0800f0.setOnClickListener(null);
    view7f0800f0 = null;
  }
}
