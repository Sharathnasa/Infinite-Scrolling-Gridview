package grabhouse.sharathnasa.com.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import grabhouse.sharathnasa.com.R;
import static grabhouse.sharathnasa.com.utils.Constants.IMAGE_HTTP;

/**
 * Created by Sharathnasa on 14/11/15.
 */
public class ZoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Get intent data
        Intent i = getIntent();

        // Selected image
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String image = extras.getString(IMAGE_HTTP);

        ImageView imageView = (ImageView) findViewById(R.id.activity_zoom_imageView);
        Picasso.with(ZoomActivity.this).load(image).into(imageView);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
