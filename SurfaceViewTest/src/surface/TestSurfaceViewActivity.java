package surface;

import android.app.Activity;
import android.os.Bundle;

public class TestSurfaceViewActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(new MySurfaceView(this));
	}

}
