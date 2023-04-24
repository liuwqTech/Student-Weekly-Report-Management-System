// Generated code from Butter Knife. Do not modify!
package com.example.weeklyreport.fragment.teacher;

import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.weeklyreport.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TeacherReadFragment_ViewBinding implements Unbinder {
  private TeacherReadFragment target;

  @UiThread
  public TeacherReadFragment_ViewBinding(TeacherReadFragment target, View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.teacher_read_lv, "field 'listView'", ListView.class);
    target.spinner_class = Utils.findRequiredViewAsType(source, R.id.spinner_class, "field 'spinner_class'", Spinner.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TeacherReadFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.spinner_class = null;
  }
}
