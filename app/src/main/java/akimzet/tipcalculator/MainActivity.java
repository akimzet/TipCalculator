package akimzet.tipcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//Import Widget Used
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare Variables here
    TextView titleTextView, totalTextView;
    EditText costTextBox, percentTextBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //Create Variables and connect them to widgets used
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        totalTextView = (TextView) findViewById(R.id.totalTextView);
        costTextBox = (EditText) findViewById(R.id.costTextBox);
        percentTextBox = (EditText) findViewById(R.id.percentTextBox);
        Button calculateButton = (Button) findViewById(R.id.calculateButton);
        //When Button is clicked
        calculateButton.setOnClickListener(new View.OnClickListener()
        {
            //Override Function
            @Override
            public void onClick(View view)
            {
                //Turn String to Floats and Calculate
                float cost = Float.parseFloat(costTextBox.getText().toString());
                float percent = (Float.parseFloat(percentTextBox.getText().toString()) / 100);
                float total = cost * percent;
                //Turn total to String and put on Display
                totalTextView.setText(Float.toString(total));
            }
        });


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
}
