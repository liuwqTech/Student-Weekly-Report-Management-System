// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StudentChangePWDActivity_ViewBinding implements Unbinder {
  private StudentChangePWDActivity target;

  private View view7f080119;

  private View view7f08004e;

  @UiThread
  public StudentChangePWDActivity_ViewBinding(StudentChangePWDActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StudentChangePWDActivity_ViewBinding(final StudentChangePWDActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.title_back, "field 'titleBack' and method 'onViewClicked'");
    target.titleBack = Utils.castView(view, R.id.title_back, "field 'titleBack'", ImageView.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.passwordInputOldpass = Utils.findRequiredViewAsType(source, R.id.password_input_oldpass, "field 'passwordInputOldpass'", EditText.class);
    target.passwordInputNewpass = Utils.findRequiredViewAsType(source, R.id.password_input_newpass, "field 'passwordInputNewpass'", EditText.class);
    target.passwordInputRepass = Utils.findRequiredViewAsType(source, R.id.password_input_repass, "field 'passwordInputRepass'", EditText.class);
    view = Utils.findRequiredView(source, R.id.changepwd_button, "field 'changepwdButton' and method 'onViewClicked'");
    target.changepwdButton = Utils.castView(view, R.id.changepwd_button, "field 'changepwdButton'", Button.class);
    view7f08004e = view;
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
    StudentChangePWDActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleBack = null;
    target.passwordInputOldpass = null;
    target.passwordInputNewpass = null;
    target.passwordInputRepass = null;
    target.changepwdButton = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
    view7f08004e.setOnClickListener(null);
    view7f08004e = null;
  }
}
