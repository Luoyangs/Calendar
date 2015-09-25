package com.haoxue.calendar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainAct extends Activity implements OnClickListener{

	private double input1 = 0, input2 = 0, result = 0;
	private int option = 0;
	private boolean isClicked = false;
	
	private Button titilbar_right;
	private TextView input;
	private Button Backspace, C, Divide, Mul, Plus, Sub, Sum, Nine, Eight,
		Seven, Six, Five, Four, Three, Two, One, Zero, Point;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main_layout);
		initView();
	}

	private void initView(){
		titilbar_right = (Button) findViewById(R.id.titilbar_right);
		input = (TextView) findViewById(R.id.input);
		Backspace = (Button) findViewById(R.id.Backspace);
		C = (Button) findViewById(R.id.C);
		Divide = (Button) findViewById(R.id.divide);
		Mul = (Button) findViewById(R.id.mul);
		Plus = (Button) findViewById(R.id.plus);
		Sub = (Button) findViewById(R.id.sub);
		Sum = (Button) findViewById(R.id.sum);
		Nine = (Button) findViewById(R.id.nine);
		Eight = (Button) findViewById(R.id.eight);
		Seven = (Button) findViewById(R.id.seven);
		Six = (Button) findViewById(R.id.six);
		Five = (Button) findViewById(R.id.five);
		Four = (Button) findViewById(R.id.four);
		Three = (Button) findViewById(R.id.three);
		Two = (Button) findViewById(R.id.two);
		One = (Button) findViewById(R.id.one);
		Zero = (Button) findViewById(R.id.zero);
		Point = (Button) findViewById(R.id.point);
		
		//Ìí¼Ó¼àÌýÊÂ¼þ
		titilbar_right.setOnClickListener(this);
		Backspace.setOnClickListener(this);
		C.setOnClickListener(this);
		Divide.setOnClickListener(this);
		Mul.setOnClickListener(this);
		Plus.setOnClickListener(this);
		Sub.setOnClickListener(this);
		Sum.setOnClickListener(this);
		Nine.setOnClickListener(this);
		Eight.setOnClickListener(this);
		Seven.setOnClickListener(this);
		Six.setOnClickListener(this);
		Five.setOnClickListener(this);
		Four.setOnClickListener(this);
		Three.setOnClickListener(this);
		Two.setOnClickListener(this);
		One.setOnClickListener(this);
		Zero.setOnClickListener(this);
		Point.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.titilbar_right:
			startActivity(new Intent(MainAct.this,MoreDetailAct.class));
			break;
		case R.id.Backspace:
			String str = input.getText().toString().trim();
			try {
				input.setText(str.substring(0, str.length()-1));
			} catch (Exception e) {
				input.setText("");
			}
			break;
		case R.id.C:
			input.setText("");
			break;
		case R.id.divide:
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input1 = Double.parseDouble(input.getText().toString());
			input.setText("");
			option = Constant.DIV;
			isClicked = false;
			break;
		case R.id.mul:
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input1 = Double.parseDouble(input.getText().toString());
			input.setText("");
			option = Constant.MUL;
			isClicked = false;
			break;
		case R.id.plus:
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input1 = Double.parseDouble(input.getText().toString());
			input.setText("");
			option = Constant.PLU;
			isClicked = false;
			break;
		case R.id.sub:
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input1 = Double.parseDouble(input.getText().toString());
			input.setText("");
			option = Constant.SUB;
			isClicked = false;
			break;
		case R.id.sum:
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input2 = Double.parseDouble(input.getText().toString());
			input.setText("");
			switch (option) {
			case 0:
				result = 0;
				break;
			case Constant.DIV:
				if (input2 == 0) {
					input.setText(""+Double.MAX_VALUE);
					return;
				}
				result = input1 / input2;
				break;
			case Constant.MUL:
				result = input1 * input2;
				break;
			case Constant.PLU:
				result = input1 + input2;
				break;
			case Constant.SUB:
				result = input1 - input2;
				break;
			}
			input.setText(String.valueOf(result));
			isClicked = true;
			break;
		case R.id.nine:
			inputNum("9");
			break;
		case R.id.eight:
			inputNum("8");
			break;
		case R.id.seven:
			inputNum("7");
			break;
		case R.id.six:
			inputNum("6");
			break;
		case R.id.five:
			inputNum("5");
			break;
		case R.id.four:
			inputNum("4");
			break;
		case R.id.three:
			inputNum("3");
			break;
		case R.id.two:
			inputNum("2");
			break;
		case R.id.one:
			inputNum("1");
			break;
		case R.id.zero:
			inputNum("0");
			break;
		case R.id.point:
			inputNum(".");
			break;
		}
	}
	
	private void inputNum(String num){
		if (isClicked) {
			input.setText("");
			isClicked = false;
		}
		String str_0 = input.getText().toString();
		str_0 += num;
		input.setText(str_0);
	}

}
