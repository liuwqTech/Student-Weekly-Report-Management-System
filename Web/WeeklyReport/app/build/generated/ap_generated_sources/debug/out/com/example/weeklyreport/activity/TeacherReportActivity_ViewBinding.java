// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TeacherReportActivity_ViewBinding implements Unbinder {
  private TeacherReportActivity target;

  private View view7f080119;

  @UiThread
  public TeacherReportActivity_ViewBinding(TeacherReportActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TeacherReportActivity_ViewBinding(final TeacherReportActivity target, View source) {
    this.target = target;

    View view;
    target.listView = Utils.findRequiredViewAsType(source, R.id.teacher_report_lv, "field 'listView'", ListView.class);
    view = Utils.findRequiredView(source, R.id.title_back, "field 'titleBack' and method 'onViewClicked'");
    target.titleBack = Utils.castView(view, R.id.title_back, "field 'titleBack'", ImageView.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TeacherReportActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.titleBack = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
  }
}
