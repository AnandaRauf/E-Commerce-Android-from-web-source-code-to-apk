package com.batrisyia.indo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	
	private WebView viewtoko;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear8;
	private ImageView _drawer_imageview2;
	private ImageView _drawer_imageviewadmin;
	private Button _drawer_admimbut;
	private ImageView _drawer_imageviewcustomer;
	private Button _drawer_reselbut;
	private ImageView _drawer_imageview3;
	private Button _drawer_custombut;
	private ImageView _drawer_imageview4;
	private Button _drawer_wishlistbut;
	private ImageView _drawer_imageview5;
	private Button _drawer_checkout;
	private ImageView _drawer_imageview6;
	private Button _drawer_checkongkirbut;
	
	private Intent haldpn = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		viewtoko = (WebView) findViewById(R.id.viewtoko);
		viewtoko.getSettings().setJavaScriptEnabled(true);
		viewtoko.getSettings().setSupportZoom(true);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_imageviewadmin = (ImageView) _nav_view.findViewById(R.id.imageviewadmin);
		_drawer_admimbut = (Button) _nav_view.findViewById(R.id.admimbut);
		_drawer_imageviewcustomer = (ImageView) _nav_view.findViewById(R.id.imageviewcustomer);
		_drawer_reselbut = (Button) _nav_view.findViewById(R.id.reselbut);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_custombut = (Button) _nav_view.findViewById(R.id.custombut);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_wishlistbut = (Button) _nav_view.findViewById(R.id.wishlistbut);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_checkout = (Button) _nav_view.findViewById(R.id.checkout);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_checkongkirbut = (Button) _nav_view.findViewById(R.id.checkongkirbut);
		
		viewtoko.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_drawer_admimbut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				viewtoko.loadUrl("URLWEB");
				viewtoko.loadUrl("CODEWEBHTML");
			}
		});
		
		_drawer_reselbut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				viewtoko.loadUrl("URLWEB");
				viewtoko.loadUrl("CODEWEBHTML");
			}
		});
		
		_drawer_custombut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				viewtoko.loadUrl("URLWEB");
				viewtoko.loadUrl("CODEWEBHTML");
			}
		});
		
		_drawer_wishlistbut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				viewtoko.loadUrl("URLWEB");
				viewtoko.loadUrl("CODEWEBHTML");
			}
		});
		
		_drawer_checkout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				viewtoko.loadUrl("URLWEB");
				viewtoko.loadUrl("CODEWEBHTML");
			}
		});
		
		_drawer_checkongkirbut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
