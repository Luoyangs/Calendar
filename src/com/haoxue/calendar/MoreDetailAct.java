package com.haoxue.calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * 说明:
 * 作者:Luoyangs
 * 时间:2015-9-24
 */
public class MoreDetailAct extends Activity implements OnClickListener{
	
	private Button titilbar_left;
	private double input1 = 0, input2 = 0, result = 0;
	private int option = 0;
	private boolean isClicked = false;
	private TextView input;
	private Button Sin,Cos,Tan,Absolute,Jiecheng,Daoshu,Square,Sqrt,Cube,POW,Gen3,Zhengfu,Backspace,
	                    C,Divide,Mul,Plus,Sub,Nine,Eight,Seven,Six,Five,Four,Three,Two,One,Zero,Sum,Point,Duishu,Ln,e;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_moredetail_layout);
		
		initView();
	}
	
	private void initView(){
		titilbar_left = (Button) findViewById(R.id.titilbar_left);
		input = (TextView) findViewById(R.id.input_2);
		Sin = (Button) findViewById(R.id.sin);
		Cos = (Button) findViewById(R.id.cos);
		Tan = (Button) findViewById(R.id.tan);
		Absolute = (Button) findViewById(R.id.absolute);
		Jiecheng = (Button) findViewById(R.id.jiecheng);
		Daoshu = (Button) findViewById(R.id.daoshu);
		Cube = (Button) findViewById(R.id.cube);
		Square = (Button) findViewById(R.id.square);
		Sqrt = (Button) findViewById(R.id.sqrt);
		POW = (Button) findViewById(R.id.pow);
		Zhengfu = (Button) findViewById(R.id.zhengfu);
		Gen3 = (Button) findViewById(R.id.gen3);
		Backspace = (Button) findViewById(R.id.backspace_1);
		C = (Button) findViewById(R.id.C_1);
		Divide = (Button) findViewById(R.id.Divide_1);
		Mul = (Button) findViewById(R.id.mul_2);
		Plus = (Button) findViewById(R.id.plus_2);
		Sub = (Button) findViewById(R.id.sub_2);
		Sum = (Button) findViewById(R.id.sum_2);
		Nine = (Button) findViewById(R.id.nine_2);
		Eight = (Button) findViewById(R.id.eight_2);
		Seven = (Button) findViewById(R.id.seven_2);
		Six = (Button) findViewById(R.id.six_2);
		Five = (Button) findViewById(R.id.five_2);
		Four = (Button) findViewById(R.id.four_2);
		Three = (Button) findViewById(R.id.three_2);
		Two = (Button) findViewById(R.id.two_2);
		One = (Button) findViewById(R.id.one_2);
		Zero = (Button) findViewById(R.id.zero_2);
		Point = (Button) findViewById(R.id.point_2);
		Duishu = (Button) findViewById(R.id.log);
		Ln = (Button) findViewById(R.id.ln);
		e = (Button) findViewById(R.id.e);

		//添加监听事件
		titilbar_left.setOnClickListener(this);
		Sin.setOnClickListener(this);
		Cos.setOnClickListener(this);
		Tan.setOnClickListener(this);
		Absolute.setOnClickListener(this);
		Jiecheng.setOnClickListener(this);
		Daoshu.setOnClickListener(this);
		Cube.setOnClickListener(this);
		Square.setOnClickListener(this);
		Sqrt.setOnClickListener(this);
		POW.setOnClickListener(this);
		Zhengfu.setOnClickListener(this);
		Gen3.setOnClickListener(this);
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
		Duishu.setOnClickListener(this);
		Ln.setOnClickListener(this);
		e.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.titilbar_left:
			finish();
			break;
		case R.id.backspace_1:
			String str = input.getText().toString().trim();
			try {
				input.setText(str.substring(0, str.length()-1));
			} catch (Exception e) {
				input.setText("");
			}
			break;
		case R.id.C_1:
			input.setText("");
			break;
		case R.id.zero_2:
			inputNum("0");
			break;
		case R.id.one_2:
			inputNum("1");
			break;
		case R.id.two_2:
			inputNum("2");
			break;
		case R.id.three_2:
			inputNum("3");
			break;
		case R.id.four_2:
			inputNum("4");
			break;
		case R.id.five_2:
			inputNum("5");
			break;
		case R.id.six_2:
			inputNum("6");
			break;
		case R.id.seven_2:
			inputNum("7");
			break;
		case R.id.eight_2:
			inputNum("8");
			break;
		case R.id.nine_2:
			inputNum("9");
			break;
		case R.id.point_2:
			inputNum(".");
			break;
		case R.id.Divide_1:
			inputOpt(Constant.DIV);
			break;
		case R.id.mul_2:
			inputOpt(Constant.MUL);
			break;
		case R.id.plus_2:
			inputOpt(Constant.PLU);
			break;
		case R.id.sub_2:
			inputOpt(Constant.SUB);
			break;
		case R.id.pow:
			inputOpt(Constant.POW);
			break;
		case R.id.square:
			inputOpt(Constant.SQU);
			break;
		case R.id.cube:
			inputOpt(Constant.CUB);
			break;
		case R.id.sqrt:
			inputOpt(Constant.GEN2);
			break;
		case R.id.absolute:
			inputOpt(Constant.ABS);
			break;
		case R.id.jiecheng:
			inputOpt(Constant.JC);
			break;
		case R.id.sin:
			inputOpt(Constant.SIN);
			break;
		case R.id.cos:
			inputOpt(Constant.COS);
			break;
		case R.id.tan:
			inputOpt(Constant.TAN);
			break;
		case R.id.gen3:
			inputOpt(Constant.GEN3);
			break;
		case R.id.daoshu:
			inputOpt(Constant.DAO);
			break;
		case R.id.zhengfu:
			inputOpt(Constant.FS);
			break;
		case R.id.log:
			inputOpt(Constant.LOG);
			break;
		case R.id.ln:
			inputOpt(Constant.LN);
			break;
		case R.id.e:
			inputOpt(Constant.E);
			break;
		case R.id.sum_2:
			if(option == Constant.SIN || option == Constant.COS || option == Constant.TAN 
				|| option == Constant.ABS || option == Constant.JC || option == Constant.DAO 
				|| option == Constant.SQU || option == Constant.CUB || option == Constant.GEN3
				|| option == Constant.GEN2 || option == Constant.FS || option == Constant.LOG
				|| option == Constant.LN || option == Constant.E) {
				//单目运算
				input.setText("0");
			}
			if (input.getText() == null || input.getText().toString().equals("")) {
				return;
			}
			if (!RexUtil.isNumeric(input.getText().toString())) {
				return;
			}
			input2 = Double.valueOf(input.getText().toString());
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
			case Constant.POW:
				result = Math.pow(input1, input2);
				break;
			case Constant.SQU:
				result = input1 * input1;
				break;
			case Constant.CUB:
				result = input1 * input1 * input1;
				break;
			case Constant.GEN2:
				result = Math.sqrt(input1);
				break;
			case Constant.ABS:
				result = Math.abs(input1);
				break;
			case Constant.JC://
				double res = input1;
				for (int i = 1; i < input1; i++) {
					res *= i;
				}
				result = res;
				break;
			case Constant.SIN:
				result = Math.sin(input1);
				break;
			case Constant.COS:
				result = Math.cos(input1);
				break;
			case Constant.TAN:
				result = Math.tan(input1);
				break;
			case Constant.DAO:
				result = 1 / input1;
				break;
			case Constant.GEN3:
				result = Math.pow(input1, 1.0/3);
				break;
			case Constant.FS:
				result = -input1;
				break;
			case Constant.LOG:
				result = Math.log(input1);
				break;
			case Constant.LN:
				result = Math.log10(input1);
				break;
			case Constant.E:
				result = Math.exp(input1);
				break;
			}
			input.setText(Double.toString(result));
			isClicked = true;
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
	
	private void inputOpt(int opt){
		if (input.getText() == null || input.getText().toString().equals("")) {
			return;
		}
		if (!RexUtil.isNumeric(input.getText().toString())) {
			return;
		}
		input1 = Double.parseDouble(input.getText().toString());
		input.setText("");
		option = opt;
		isClicked = false;
	}
}
