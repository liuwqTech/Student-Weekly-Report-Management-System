// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.fragment.student;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StudentPersonalFragment_ViewBinding implements Unbinder {
  private StudentPersonalFragment target;

  private View view7f080081;

  private View view7f08004d;

  private View view7f08010a;

  @UiThread
  public StudentPersonalFragment_ViewBinding(final StudentPersonalFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.lingdang_iv, "field 'imageView' and method 'onClick'");
    target.imageView = Utils.castView(view, R.id.lingdang_iv, "field 'imageView'", ImageView.class);
    view7f080081 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.student_number = Utils.findRequiredViewAsType(source, R.id.student_number, "field 'student_number'", TextView.class);
    target.student_name = Utils.findRequiredViewAsType(source, R.id.student_name, "field 'student_name'", TextView.class);
    target.student_class = Utils.findRequiredViewAsType(source, R.id.student_class, "field 'student_class'", TextView.class);
    view = Utils.findRequiredView(source, R.id.change_pwd_text, "method 'onViewClicked'");
    view7f08004d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.teacher_logout_text, "method 'onViewClicked'");
    view7f08010a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StudentPersonalFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.student_number = null;
    target.student_name = null;
    target.student_class = null;

    view7f080081.setOnClickListener(null);
    view7f080081 = null;
    view7f08004d.setOnClickListener(null);
    view7f08004d = null;
    view7f08010a.setOnClickListener(null);
    view7f08010a = null;
  }
}
