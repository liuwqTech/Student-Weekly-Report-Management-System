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

public class StudentWriterActivity_ViewBinding implements Unbinder {
  private StudentWriterActivity target;

  private View view7f080119;

  @UiThread
  public StudentWriterActivity_ViewBinding(StudentWriterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StudentWriterActivity_ViewBinding(final StudentWriterActivity target, View source) {
    this.target = target;

    View view;
    target.btn = Utils.findRequiredViewAsType(source, R.id.student_bt_submit, "field 'btn'", Button.class);
    target.editText1 = Utils.findRequiredViewAsType(source, R.id.student_ed_text1, "field 'editText1'", EditText.class);
    target.editText2 = Utils.findRequiredViewAsType(source, R.id.student_ed_text2, "field 'editText2'", EditText.class);
    target.editText3 = Utils.findRequiredViewAsType(source, R.id.student_ed_text3, "field 'editText3'", EditText.class);
    target.editText5 = Utils.findRequiredViewAsType(source, R.id.student_ed_text5, "field 'editText5'", EditText.class);
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
    StudentWriterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn = null;
    target.editText1 = null;
    target.editText2 = null;
    target.editText3 = null;
    target.editText5 = null;
    target.titleBack = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
  }
}
