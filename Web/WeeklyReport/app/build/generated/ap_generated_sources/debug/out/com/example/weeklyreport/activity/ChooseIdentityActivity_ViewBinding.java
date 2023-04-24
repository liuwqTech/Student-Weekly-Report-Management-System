// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChooseIdentityActivity_ViewBinding implements Unbinder {
  private ChooseIdentityActivity target;

  private View view7f0800ea;

  private View view7f080108;

  @UiThread
  public ChooseIdentityActivity_ViewBinding(ChooseIdentityActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChooseIdentityActivity_ViewBinding(final ChooseIdentityActivity target, View source) {
    this.target = target;

    View view;
    target.Identity = Utils.findRequiredViewAsType(source, R.id.identity, "field 'Identity'", TextView.class);
    view = Utils.findRequiredView(source, R.id.student_identity, "field 'studentIdentity' and method 'onViewClicked'");
    target.studentIdentity = Utils.castView(view, R.id.student_identity, "field 'studentIdentity'", Button.class);
    view7f0800ea = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.teacher_identity, "field 'teacherIdentity' and method 'onViewClicked'");
    target.teacherIdentity = Utils.castView(view, R.id.teacher_identity, "field 'teacherIdentity'", Button.class);
    view7f080108 = view;
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
    ChooseIdentityActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.Identity = null;
    target.studentIdentity = null;
    target.teacherIdentity = null;

    view7f0800ea.setOnClickListener(null);
    view7f0800ea = null;
    view7f080108.setOnClickListener(null);
    view7f080108 = null;
  }
}
