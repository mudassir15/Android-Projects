package com.example.farooq.myapp;

import android.annotation.TargetApi;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Target;

import static android.R.attr.duration;
import static android.R.id.checkbox;
import static android.R.id.message;

import static com.example.farooq.myapp.R.id.text;
import static com.example.farooq.myapp.R.string.price;

/*
 * This app displays an order form to order coffee.
 */
@TargetApi(19)
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        // whipped cream object
        CheckBox hasWhippedCream = (CheckBox) findViewById(R.id.checkbox_view);
        boolean WhippedCream = hasWhippedCream.isChecked();

        // for edit text for name
        EditText myFirstEditText = (EditText) findViewById(R.id.edit_text);
        String name = myFirstEditText.getText().toString();

        // for chocolate checkbox we make object
        CheckBox chocolate = (CheckBox) findViewById(R.id.checkboxForChock_view);
        boolean addChocolate = chocolate.isChecked();
        // calculate price adding params
        int price = calculatePrice(WhippedCream, addChocolate);

        String priceMessage = orderSummeryMethod( addChocolate, name ,price, WhippedCream);
        displayMessage(priceMessage, WhippedCream);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 12){
            // show error as a toast
            Toast.makeText(this,"you cannot order more than 12 cups", Toast.LENGTH_SHORT ).show();
            // does not executes next lines of code
            return;
        }
        quantity++;
        display(quantity);


    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {

if (quantity == 1){
    // show message
    Toast.makeText(this,"you cannot order 0 cups!", Toast.LENGTH_SHORT).show();
    return;
}
        quantity--;
        display(quantity);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    private void displayMessage(String message, boolean addWhippedCream) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);

    }


    public int calculatePrice(boolean whippedCream,boolean chocolate) {
        int basePrice = 5;
        if (whippedCream){
            basePrice = basePrice + 2;
        }
        if (chocolate) {
            basePrice = basePrice + 3;
        }
        return quantity*basePrice;
    }

    public String orderSummeryMethod(boolean choco, String name, int price, boolean addWhipped) {
        String priceMessage = "\n Name :" + name;
        priceMessage += "\n Whipped Cream = " + addWhipped;
        priceMessage += "\n Chocolate = " + choco;
        priceMessage += "\n Quantity " + quantity;
        priceMessage += "\n Total : $" + price;
        return priceMessage;
    }
}
