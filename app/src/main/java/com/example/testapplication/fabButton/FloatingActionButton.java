package com.example.testapplication.fabButton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.testapplication.R;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class FloatingActionButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floting_action_button);
        findViewById(R.id.pink_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FloatingActionButton.this, "Clicked pink Floating Action Button", Toast.LENGTH_SHORT).show();
            }
        });

        com.getbase.floatingactionbutton.FloatingActionButton button = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.setter);
        button.setSize(com.getbase.floatingactionbutton.FloatingActionButton.SIZE_MINI);
        button.setColorNormalResId(R.color.pink);
        button.setColorPressedResId(R.color.pink_pressed);
        button.setIcon(R.drawable.ic_fab_star);
        button.setStrokeVisible(false);

        final View actionB = findViewById(R.id.action_b);

        com.getbase.floatingactionbutton.FloatingActionButton actionC = new com.getbase.floatingactionbutton.FloatingActionButton(getBaseContext());
        actionC.setTitle("Hide/Show Action above");
        actionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionB.setVisibility(actionB.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
            }
        });

        final FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.multiple_actions);
        menuMultipleActions.addButton(actionC);

        final com.getbase.floatingactionbutton.FloatingActionButton removeAction = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.button_remove);
        removeAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FloatingActionsMenu) findViewById(R.id.multiple_actions_down)).removeButton(removeAction);
            }
        });

        ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
        drawable.getPaint().setColor(getResources().getColor(R.color.white));
        ((com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.setter_drawable)).setIconDrawable(drawable);

        final com.getbase.floatingactionbutton.FloatingActionButton actionA = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.action_a);
        actionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionA.setTitle("Action A clicked");
            }
        });

        // Test that FAMs containing FABs with visibility GONE do not cause crashes
        findViewById(R.id.button_gone).setVisibility(View.GONE);

        final com.getbase.floatingactionbutton.FloatingActionButton actionEnable = (com.getbase.floatingactionbutton.FloatingActionButton) findViewById(R.id.action_enable);
        actionEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuMultipleActions.setEnabled(!menuMultipleActions.isEnabled());
            }
        });

        FloatingActionsMenu rightLabels = (FloatingActionsMenu) findViewById(R.id.right_labels);
        com.getbase.floatingactionbutton.FloatingActionButton addedOnce = new com.getbase.floatingactionbutton.FloatingActionButton(this);
        addedOnce.setTitle("Added once");
        rightLabels.addButton(addedOnce);

        com.getbase.floatingactionbutton.FloatingActionButton addedTwice = new com.getbase.floatingactionbutton.FloatingActionButton(this);
        addedTwice.setTitle("Added twice");
        rightLabels.addButton(addedTwice);
        rightLabels.removeButton(addedTwice);
        rightLabels.addButton(addedTwice);
    }
}
