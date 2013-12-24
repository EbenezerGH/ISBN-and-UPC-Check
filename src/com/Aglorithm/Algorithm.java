package com.Aglorithm;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Algorithm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final TextView val = (TextView) findViewById(R.id.valid);
		val.setVisibility(View.GONE);

		Spinner spinner = (Spinner) findViewById(R.id.isbn_spinner);
		Button tv = (Button) findViewById(R.id.check);

		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.isbn_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int pos, long id) {

				if (pos == 0) {
					Toast.makeText(parent.getContext(), "UPC Check",
							Toast.LENGTH_SHORT).show();

				}
				if (pos != 0)
					Toast.makeText(parent.getContext(), "Comming Soon",
							Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});

		tv.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				EditText et = (EditText) findViewById(R.id.isbnTV);
				String Text = et.getText().toString();
int i = Text.length();
				if (i != 12) {
					Toast.makeText(getBaseContext(),
							"UPC's require 12 digits.", Toast.LENGTH_LONG)
							.show();
				}

				
				
				if (i == 12 && UPC(Text) == true) {
					val.setVisibility(View.VISIBLE);
					val.setText("VALID");
					val.setTextColor(getResources().getColor(R.color.green));

				} else {
					val.setVisibility(View.VISIBLE);
					val.setText("INVALID");
					val.setTextColor(getResources().getColor(R.color.red));

				}
				
				
				
				
				
				
				
			}
		});
	}

	public boolean UPC(String UPC) {
		Log.d("XXXXXX", "ONE");

		String upc = UPC;
		Log.d("XXXXXX", "two");

		String sumODo = upc.charAt(0) + "";
		int q = Integer.parseInt(sumODo);
		Log.d("XXXXXX", "three");

		String sumODth = upc.charAt(2) + "";
		int w = Integer.parseInt(sumODth);
		Log.d("XXXXXX", "four");

		String sumODfi = upc.charAt(4) + "";
		int e = Integer.parseInt(sumODfi);
		Log.d("XXXXXX", "five");

		String sumODse = upc.charAt(6) + "";
		int r = Integer.parseInt(sumODse);
		Log.d("XXXXXX", "six");

		String sumODni = upc.charAt(8) + "";
		int t = Integer.parseInt(sumODni);
		Log.d("XXXXXX", "seven");

		String sumODel = upc.charAt(10) + "";
		int y = Integer.parseInt(sumODel);
		Log.d("XXXXXX", "eight");

		String sumOdDte = upc.charAt(1) + "";
		int ebenezer = Integer.parseInt(sumOdDte);
		Log.d("XXXXXX", "nine");

		String sumODte = upc.charAt(3) + "";
		int E = Integer.parseInt(sumODte);
		Log.d("XXXXXX", "ten");

		String sumODtde = upc.charAt(5) + "";
		int b = Integer.parseInt(sumODtde);
		Log.d("XXXXXX", "ten");

		String sumODtee = upc.charAt(7) + "";
		int n = Integer.parseInt(sumODtee);
		Log.d("XXXXXX", "eleven");

		String sumODtwe = upc.charAt(9) + "";
		int z = Integer.parseInt(sumODtwe);
		Log.d("XXXXXX", "twelve");

		String sumODtqe = upc.charAt(11) + "";
		int h = Integer.parseInt(sumODtqe);
		Log.d("XXXXXX", "thirteen");

		int sumODD = 3 * (q + w + e + r + t + y)
				+ (ebenezer + E + b + n + z + h);
		Log.d("XXXXXX", "fourteen");

		if (sumODD % 10 == 0)
			return true;
		return false;


	}
}
