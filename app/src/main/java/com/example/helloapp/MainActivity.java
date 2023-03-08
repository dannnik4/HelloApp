package com.example.helloapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.widget.CheckBox;
import android.widget.ToggleButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    //EditText editText;
    //TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_layout);

        // создание TextView
        //TextView textView = new TextView(this);
        // установка текста в TextView
        //textView.setText("Hello Android!");
        // установка высоты текста
        //textView.setTextSize(22);
        // установка визуального интерфейса для activity
        //setContentView(textView);


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello Android");
        //textView.setTextSize(26);

        // устанавливаем параметры размеров и расположение элемента
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        // эквивалент app:layout_constraintLeft_toLeftOf="parent"
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        // эквивалент app:layout_constraintTop_toTopOf="parent"
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        // устанавливаем параметры для textView
        //textView.setLayoutParams(layoutParams);
        // добавляем TextView в ConstraintLayout
        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);


        //EditText editText = new EditText(this);
        //editText.setHint("Введите Email");
        //editText.setId(View.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");
        //button.setId(View.generateViewId());

        //ConstraintLayout.LayoutParams editTextLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.rightToLeft = button.getId();
        //editText.setLayoutParams(editTextLayout);
        //constraintLayout.addView(editText);

        //ConstraintLayout.LayoutParams buttonLayout = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT , ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //buttonLayout.leftToRight = editText.getId();
        //buttonLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //button.setLayoutParams(buttonLayout);
        //constraintLayout.addView(button);

        //setContentView(constraintLayout);


        //setContentView(R.layout.activity_main);
        //LinearLayout linearLayout = new LinearLayout(this);
        // горизонтальная ориентация
        //linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        //TextView textView = new TextView(this);
        //textView.setText("Hello");
        //textView.setTextSize(30);
        // создаем параметры позиционирования для элемента
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        //layoutParams.setMargins(100, 100, 0, 0);
        //textView.setLayoutParams(layoutParams);
        // добавляем элемент в LinearLayout
        //linearLayout.addView(textView);

        //setContentView(linearLayout);


        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);

        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        // textView1 имеет вес 3
        //linearLayout.addView(textView1, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 3));

        // второе текстовое поле
        //TextView textView2 = new TextView(this);
        //textView2.setText("Android");
        //textView2.setBackgroundColor(0xFFBDBDBD);
        //textView2.setTextSize(30);
        // textView2 имеет вес 2
        //linearLayout.addView(textView2, new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.MATCH_PARENT, 0, 2));

        //setContentView(linearLayout);

        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation(LinearLayout.VERTICAL);
        //LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
        //        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // установка layout_gravity
        //layoutParams.gravity = Gravity.CENTER;
        // первое текстовое поле
        //TextView textView1 = new TextView(this);
        //textView1.setText("Hello");
        //textView1.setTextSize(30);
        //linearLayout.addView(textView1, layoutParams);
        //setContentView(linearLayout);


        //RelativeLayout relativeLayout = new RelativeLayout(this);

        //EditText editText = new EditText(this);
        //editText.setId(EditText.generateViewId());

        //Button button = new Button(this);
        //button.setText("Отправить");

        // устанавливаем параметры положения для EditText
        //RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.MATCH_PARENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание по центру родительского контейнера
        //editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        // добавляем в RelativeLayout
        //relativeLayout.addView(editText, editTextParams);

        // устанавливаем параметры положения для Button
        //RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
        //        RelativeLayout.LayoutParams.WRAP_CONTENT,
        //        RelativeLayout.LayoutParams.WRAP_CONTENT
        //);
        // выравнивание справа и снизу от поля EditText
        //buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
        //buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
        // добавляем в RelativeLayout
        //relativeLayout.addView(button, buttonParams);

        //setContentView(relativeLayout);


        //TableLayout tableLayout = new TableLayout( this);

        // первая строка
        //TableRow tableRow1 = new TableRow(this);

        //TextView textView1 = new TextView(this);
        //textView1.setText("Логин");
        //tableRow1.addView(textView1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText1 = new EditText(this);
        //tableRow1.addView(editText1, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.0f));

        // вторая строка
        //TableRow tableRow2 = new TableRow(this);

        //TextView textView2 = new TextView(this);
        //textView2.setText("Email");
        //tableRow2.addView(textView2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 0.5f));

        //EditText editText2 = new EditText(this);
        //tableRow2.addView(editText2, new TableRow.LayoutParams(
        //        TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT, 1.f));

        //tableLayout.addView(tableRow1);
        //tableLayout.addView(tableRow2);
        //setContentView(tableLayout);


        //FrameLayout frameLayout = new FrameLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello World!");

        //FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams
        //        (FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.TOP;

        //textView.setLayoutParams(layoutParams);
        //textView.setTextSize(26);
        //frameLayout.addView(textView);
        //setContentView(frameLayout);


        //GridLayout gridLayout = new GridLayout( this);
        // количество строк
        //gridLayout.setRowCount(3);
        // количество столбцов
        //gridLayout.setColumnCount(3);

        //for(int i = 1; i <=9; i++){
        //    Button btn = new Button(this);
        //    btn.setText(String.valueOf(i));
        //    gridLayout.addView(btn);
        //}

        //for(int i = 1; i <=3; i++){
        //    Button btn = new Button(this);
        //    btn.setText(String.valueOf(i));
        //    gridLayout.addView(btn);
        //}

        //Button btn4 = new Button(this);
        //btn4.setText("4");
        //GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
        //layoutParams4.columnSpec = GridLayout.spec(0,2);
        //layoutParams4.width = (int) TypedValue.applyDimension(
        //        TypedValue.COMPLEX_UNIT_DIP, 180, getResources().getDisplayMetrics());
        //gridLayout.addView(btn4, layoutParams4);


        //Button btn5 = new Button(this);
        //btn5.setText("5");
        //GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
        //layoutParams5.rowSpec = GridLayout.spec(1,2);
        //layoutParams5.height = (int) TypedValue.applyDimension(
        //        TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics());
        //gridLayout.addView(btn5, layoutParams5);

        //Button btn6 = new Button(this);
        //btn6.setText("6");
        //Button btn7 = new Button(this);
        //btn7.setText("7");
        //gridLayout.addView(btn6);
        //gridLayout.addView(btn7);

        //setContentView(gridLayout);


        //ScrollView scrollView = new ScrollView(this);

        //TextView textView = new TextView(this);
        //textView.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry...like Aldus PageMaker including versions of Lorem Ipsum.");
        //textView.setLayoutParams(new ViewGroup.LayoutParams
        //        (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        //textView.setTextSize(26);
        //scrollView.addView(textView);
        //setContentView(scrollView);


        //int clicks = 0;

        //@Override
        //protected void onCreate(Bundle savedInstanceState) {
        //    super.onCreate(savedInstanceState);
        //    setContentView(R.layout.layout_include);
        //}

        //public void onClick(View view){
        //    TextView clicksText = findViewById(R.id.clicksText);
        //    clicks++;
        //    clicksText.setText(clicks + " Clicks");
        //}

        //View plusButtonView = findViewById(R.id.plus_button);
        //View minusButtonView = findViewById(R.id.minus_button);
        //TextView clicksText = findViewById(R.id.clicksText);

        //Button plusButton = plusButtonView.findViewById(R.id.clickBtn);
        //Button minusButton = minusButtonView.findViewById(R.id.clickBtn);

        //plusButton.setText("+");
        //minusButton.setText("-");

        //plusButton.setOnClickListener(v -> {
        //    clicks++;
        //    clicksText.setText(clicks + " Clicks");
        //});
        //minusButton.setOnClickListener(v -> {
        //    clicks--;
        //    clicksText.setText(clicks + " Clicks");
        //});


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        //textView.setText("Hello Android!");
        //textView.setTextSize(30);
        //textView.setBackgroundColor(0xffe8eaf6);

        // установка gravity
        //textView.setGravity(Gravity.BOTTOM | Gravity.CENTER);

        // установка высоты и ширины
        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, 200);
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(layoutParams);

        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);


        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //TextView textView = new TextView(this);
        // установка фонового цвета
        //textView.setBackgroundColor(0xffe8eaf6);
        // установка цвета текста
        //textView.setTextColor(0xff5c6bc0);
        // делаем все буквы заглавными
        //textView.setAllCaps(true);
        // устанавливаем вравнивание текста по центру
        //textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        // устанавливаем текста
        //textView.setText("Hello Android!");
        // установка шрифта
        //textView.setTypeface(Typeface.create("casual", Typeface.NORMAL));
        // устанавливаем высоту текста
        //textView.setTextSize(26);

        //ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
        //        (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        //layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(layoutParams);

        //constraintLayout.addView(textView);
        //setContentView(constraintLayout);


        //EditText editText = findViewById(R.id.editText);

        //editText.addTextChangedListener(new TextWatcher() {

        //    public void afterTextChanged(Editable s) {}

        //    public void beforeTextChanged(CharSequence s, int start,
        //                                  int count, int after) {
        //    }

        //    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //        TextView textView = findViewById(R.id.textView);
        //        textView.setText(s);
        //    }
        //});

        //}
        // Обработка нажатия кнопки
        //public void sendMessage(View view) {
        //    TextView textView = findViewById(R.id.textView);
        //    EditText editText = findViewById(R.id.editText);
        //    textView.setText("Добро пожаловать, " + editText.getText());
        //}

        //ConstraintLayout constraintLayout = new ConstraintLayout(this);
        //textView = new TextView(this);
        //textView.setId(View.generateViewId());
        //ConstraintLayout.LayoutParams textViewLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        //textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //textViewLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //textView.setLayoutParams(textViewLayout);
        //constraintLayout.addView(textView);

        //editText = new EditText(this);
        //editText.setId(View.generateViewId());
        //editText.setHint("Введите имя");
        //ConstraintLayout.LayoutParams editTextLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //editTextLayout.topToBottom = textView.getId();
        //editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //editTextLayout.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        //editText.setLayoutParams(editTextLayout);
        //constraintLayout.addView(editText);

        //Button button = new Button(this);
        //button.setText("Ввод");
        //ConstraintLayout.LayoutParams buttonLayout =  new ConstraintLayout.LayoutParams(
        //        ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT
        //);
        //buttonLayout.topToBottom = editText.getId();
        //buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        //button.setLayoutParams(buttonLayout);
        //constraintLayout.addView(button);

        //button.setOnClickListener(new View.OnClickListener() {
        //    public void onClick(View v) {
        //        // Обработка нажатия
        //        textView.setText("Добро пожаловать, " + editText.getText());
        //    }
        //});

        //setContentView(constraintLayout);


        //}

        //public  void onClick(View view){
        //    Toast toast = Toast.makeText(this, "Hello Android!",Toast.LENGTH_LONG);
        //    toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
        //    toast.show();
        //}

        //}

        //public  void onClick(View view){
        //Snackbar snackbar = Snackbar.make(view, "Hello Android", Snackbar.LENGTH_LONG);

        //snackbar.setAction("Next...", new View.OnClickListener (){

        //    @Override
        //    public void onClick(View v) {
        //        Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
        //        toast.show();
        //    }
        //});
        //snackbar.show();
        //snackbar.setTextColor(0XFF81C784);
        //snackbar.setBackgroundTint(0XFF555555);
        //snackbar.setActionTextColor(0XFF0277BD);


        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox checkBox = (CheckBox) view;
        //TextView selection = findViewById(R.id.selection);
        // Получаем, отмечен ли данный флажок
        //if(checkBox.isChecked()) {
        //    selection.setText("Включено");
        //    checkBox.setText("Выключить");
        //}
        //else {
        //    selection.setText("Выключено");
        //    checkBox.setText("Включить");
        //}

        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox checkBox = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        //boolean checked = checkBox.isChecked();

        //TextView selection = findViewById(R.id.selection);

        // Смотрим, какой именно из флажков отмечен
        //switch (view.getId()) {
        //    case R.id.java:
        //        if (checked)
        //            Toast.makeText(this, "Вы выбрали Java ", Toast.LENGTH_LONG).show();
        //        break;
        //    case R.id.kotlin:
        //        if (checked)
        //            Toast.makeText(this, "Вы выбрали Kotlin", Toast.LENGTH_LONG).show();
        //        break;
        //    default:
        //        selection.setText("");
        //}

        //public void onCheckboxClicked(View view) {
        // Получаем флажок
        //CheckBox language = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        //TextView selection = findViewById(R.id.selection);
        //if(language.isChecked())
        //    selection.setText(language.getText());
        //}

        //public void onCheckboxClicked(View view) {

        // Получаем флажки
        //CheckBox java = findViewById(R.id.java);
        //CheckBox kotlin = findViewById(R.id.kotlin);
        //String selectedItems = "";
        //if(java.isChecked())
        //    selectedItems +=java.getText() + " ";
        //if(kotlin.isChecked())
        //    selectedItems +=kotlin.getText();

        //TextView selection = findViewById(R.id.selection);
        //selection.setText(selectedItems);
        //}

        //TextView selection = findViewById(R.id.selection);
        //CheckBox enableBox = findViewById(R.id.enabled);

        //    enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        //    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        //        if(isChecked) {
        //            selection.setText("Включено");
        //            buttonView.setText("Выключить");
        //        }
        //        else {
        //           selection.setText("Выключено");
        //            buttonView.setText("Включить");
        //        }
        //        }
        //});

        //}

        //public void onToggleClicked(View view) {

        // включена ли кнопка
        //    boolean on = ((ToggleButton) view).isChecked();
        //    if (on) {
        //        // действия если включена
        //        Toast.makeText(this, "Свет включен", Toast.LENGTH_LONG).show();
        //    } else {
        //        // действия, если выключена
        //        Toast.makeText(this, "Свет выключен!", Toast.LENGTH_LONG).show();
        //    }

//        ConstraintLayout layout = new ConstraintLayout(this);
//        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        ToggleButton toggleButton = new ToggleButton(this);
//        toggleButton.setTextOff("Выключено");
//        toggleButton.setTextOn("Включено");
//        toggleButton.setText("Выключено");
//        toggleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean on = ((ToggleButton) view).isChecked();
//
//                if (on) {
//                    Toast.makeText(getApplicationContext(), "Свет включен", Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Свет выключен!", Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layout.addView(toggleButton);
//        setContentView(layout);


        // получаем объект RadioGroup
//        RadioGroup radGrp = (RadioGroup) findViewById(R.id.radios0);
        // обработка переключения состояния переключателя
//        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup arg0, int id) {
//                TextView selection0 = findViewById(R.id.selection0);
//                switch (id) {
//                    case R.id.java0:
//                        selection0.setText("Выбрана Java");
//                        break;
//                    case R.id.kotlin0:
//                        selection0.setText("Выбран Kotlin");
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//
//    }

//    public void onRadioButtonClicked(View view) {
        // если переключатель отмечен
//        boolean checked = ((RadioButton) view).isChecked();
//        TextView selection = findViewById(R.id.selection);
        // Получаем нажатый переключатель
//        switch (view.getId()) {
//            case R.id.java:
//                if (checked) {
//                    selection.setText("Выбрана Java");
//                }
//                break;
//            case R.id.kotlin:
//                if (checked) {
//                    selection.setText("Выбран Kotlin");
//                }
//                break;
//        }


        TextView dateTextView = findViewById(R.id.dateTextView);
        DatePicker datePicker = this.findViewById(R.id.datePicker);

        // Месяц начиная с нуля. Для отображения добавляем 1.
        datePicker.init(2023, 02, 06, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
                dateTextView.setText("Дата: " + view.getDayOfMonth() + "/" +
                        (view.getMonth() + 1) + "/" + view.getYear());

                // альтернативная запись
                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            }
        });

        TextView dateTextView0 = findViewById(R.id.dateTextView0);
        DatePicker datePicker0 = this.findViewById(R.id.datePicker0);

        // Месяц начиная с нуля. Для отображения добавляем 1.
        datePicker0.init(2023, 02, 06, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
                dateTextView0.setText("Дата: " + view.getDayOfMonth() + "/" +
                        (view.getMonth() + 1) + "/" + view.getYear());

                // альтернативная запись
                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            }
        });
    }
}