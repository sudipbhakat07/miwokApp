package com.example.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersOnclickListener implements View.OnClickListener {
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "NumbersActivity",Toast.LENGTH_SHORT).show();
    }
}
