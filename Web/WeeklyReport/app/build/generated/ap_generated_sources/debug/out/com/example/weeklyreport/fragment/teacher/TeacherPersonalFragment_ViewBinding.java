// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.fragment.teacher;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TeacherPersonalFragment_ViewBinding implements Unbinder {
  private TeacherPersonalFragment target;

  private View view7f080102;

  private View view7f08010a;

  @UiThread
  public TeacherPersonalFragment_ViewBinding(final TeacherPersonalFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.teacher_change_pwd, "field 'teacherChangePwd' and method 'onViewClicked'");
    target.teacherChangePwd = Utils.castView(view, R.id.teacher_change_pwd, "field 'teacherChangePwd'", RelativeLayout.class);
    view7f080102 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.teacher_logout_text, "field 'teacherLogoutText' and method 'onViewClicked'");
    target.teacherLogoutText = Utils.castView(view, R.id.teacher_logout_text, "field 'teacherLogoutText'", TextView.class);
    view7f08010a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.teacher_name = Utils.findRequiredViewAsType(source, R.id.teacher_name, "field 'teacher_name'", TextView.class);
    target.teacher_num = Utils.findRequiredViewAsType(source, R.id.teacher_num, "field 'teacher_num'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TeacherPersonalFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.teacherChangePwd = null;
    target.teacherLogoutText = null;
    target.teacher_name = null;
    target.teacher_num = null;

    view7f080102.setOnClickListener(null);
    view7f080102 = null;
    view7f08010a.setOnClickListener(null);
    view7f08010a = null;
  }
}
