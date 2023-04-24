// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.activity;

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

public class StudentAnswerActivity_ViewBinding implements Unbinder {
  private StudentAnswerActivity target;

  private View view7f080119;

  @UiThread
  public StudentAnswerActivity_ViewBinding(StudentAnswerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StudentAnswerActivity_ViewBinding(final StudentAnswerActivity target, View source) {
    this.target = target;

    View view;
    target.textView = Utils.findRequiredViewAsType(source, R.id.student_answer_tv, "field 'textView'", TextView.class);
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
    StudentAnswerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
    target.titleBack = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
  }
}
