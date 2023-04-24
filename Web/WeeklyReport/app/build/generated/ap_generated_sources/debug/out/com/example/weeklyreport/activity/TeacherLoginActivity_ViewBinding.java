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

public class TeacherLoginActivity_ViewBinding implements Unbinder {
  private TeacherLoginActivity target;

  private View view7f080119;

  private View view7f080084;

  @UiThread
  public TeacherLoginActivity_ViewBinding(TeacherLoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TeacherLoginActivity_ViewBinding(final TeacherLoginActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.title_back, "field 'titleBack' and method 'onClick'");
    target.titleBack = Utils.castView(view, R.id.title_back, "field 'titleBack'", ImageView.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.loginInputNum = Utils.findRequiredViewAsType(source, R.id.login_input_num, "field 'loginInputNum'", EditText.class);
    target.loginInputPassword = Utils.findRequiredViewAsType(source, R.id.login_input_password, "field 'loginInputPassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.login_button, "field 'loginButton' and method 'onClick'");
    target.loginButton = Utils.castView(view, R.id.login_button, "field 'loginButton'", Button.class);
    view7f080084 = view;
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
    TeacherLoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleBack = null;
    target.loginInputNum = null;
    target.loginInputPassword = null;
    target.loginButton = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
    view7f080084.setOnClickListener(null);
    view7f080084 = null;
  }
}
