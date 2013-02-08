package uk.co.sticksoft.adce;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Branding
{
	public static Button CreateButton(Context context)
	{
		Button b = new Button(context);
		//b.setBackgroundColor(Color.rgb(127, 0, 0));
		GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { Color.rgb(63,0,0), Color.rgb(127, 0, 0), Color.BLACK });
		gd.setGradientType(GradientDrawable.LINEAR_GRADIENT);
		b.setBackgroundDrawable(gd);
		b.setTextColor(Color.WHITE);
		
		return b;
	}
	
	public static ToggleButton CreateToggleButton(Context context)
	{
		ToggleButton b = new ToggleButton(context);
		/*
		GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { Color.rgb(63,0,0), Color.rgb(127, 0, 0), Color.BLACK });
		gd.setGradientType(GradientDrawable.LINEAR_GRADIENT);
		b.setBackgroundDrawable(gd);
		*/
		b.setTextColor(Color.RED);
		
		return b;
	}
	
	public static TextView CreateTextView(Context context)
	{
		TextView tv = new TextView(context);
		tv.setBackgroundColor(Color.BLACK);
		tv.setTextColor(Color.RED);
		
		return tv;
	}
}
