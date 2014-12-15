package com.raizlabs.android.viewholderinflater.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.raizlabs.android.viewholderinflater.ViewHolderInflater;
import com.raizlabs.android.viewholderinflater.core.VHMethod;
import com.raizlabs.android.viewholderinflater.core.VHMethodInflatable;


@VHMethodInflatable
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleInflatable inflatable = new SimpleInflatable();
        setContentView(ViewHolderInflater.inflate(this, inflatable, R.layout.activity_main));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @VHMethod
    void onClickTextView(TextView textView) {

    }

    @VHMethod
    void onClickCheckBox() {

    }

    @VHMethod
    void onItemClickListView(AdapterView<?> adapterView, View v, int position, long id) {

    }

    @VHMethod
    void onCheckedChangedCheckBox(CompoundButton button, boolean isChecked) {

    }
}