// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.fragment.student;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StudentWriteFragment_ViewBinding implements Unbinder {
  private StudentWriteFragment target;

  private View view7f0800e4;

  @UiThread
  public StudentWriteFragment_ViewBinding(final StudentWriteFragment target, View source) {
    this.target = target;

    View view;
    target.editText1 = Utils.findRequiredViewAsType(source, R.id.student_ed_text1, "field 'editText1'", EditText.class);
    target.editText2 = Utils.findRequiredViewAsType(source, R.id.student_ed_text2, "field 'editText2'", EditText.class);
    target.editText3 = Utils.findRequiredViewAsType(source, R.id.student_ed_text3, "field 'editText3'", EditText.class);
    target.editText5 = Utils.findRequiredViewAsType(source, R.id.student_ed_text5, "field 'editText5'", EditText.class);
    view = Utils.findRequiredView(source, R.id.student_bt_submit, "method 'onClick'");
    view7f0800e4 = view;
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
    StudentWriteFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText1 = null;
    target.editText2 = null;
    target.editText3 = null;
    target.editText5 = null;

    view7f0800e4.setOnClickListener(null);
    view7f0800e4 = null;
  }
}
