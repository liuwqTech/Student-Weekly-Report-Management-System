// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.activity;

import android.view.View;
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

public class TeacherReportSbActivity_ViewBinding implements Unbinder {
  private TeacherReportSbActivity target;

  private View view7f080119;

  private View view7f080101;

  @UiThread
  public TeacherReportSbActivity_ViewBinding(TeacherReportSbActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TeacherReportSbActivity_ViewBinding(final TeacherReportSbActivity target, View source) {
    this.target = target;

    View view;
    target.editText1 = Utils.findRequiredViewAsType(source, R.id.teacher_ed_text1, "field 'editText1'", EditText.class);
    target.editText2 = Utils.findRequiredViewAsType(source, R.id.teacher_ed_text2, "field 'editText2'", EditText.class);
    target.editText3 = Utils.findRequiredViewAsType(source, R.id.teacher_ed_text3, "field 'editText3'", EditText.class);
    target.editText5 = Utils.findRequiredViewAsType(source, R.id.teacher_ed_text5, "field 'editText5'", EditText.class);
    target.editText4 = Utils.findRequiredViewAsType(source, R.id.teacher_ed_text4, "field 'editText4'", EditText.class);
    view = Utils.findRequiredView(source, R.id.title_back, "field 'titleBack' and method 'onViewClicked'");
    target.titleBack = Utils.castView(view, R.id.title_back, "field 'titleBack'", ImageView.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.teacher_bt_submit, "method 'onClick'");
    view7f080101 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    TeacherReportSbActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText1 = null;
    target.editText2 = null;
    target.editText3 = null;
    target.editText5 = null;
    target.editText4 = null;
    target.titleBack = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
    view7f080101.setOnClickListener(null);
    view7f080101 = null;
  }
}
