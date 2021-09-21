package android.example.coffeeorder;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

    /**
     * This app displays an order form to order coffee.
     */
    public class MainActivity extends AppCompatActivity {
        public int quantity;

        {
            quantity = 1;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        /**
         * This method is called when the increment button is clicked.
         */
        public void increment(View view) {
            quantity++;
            display(quantity);
        }


        /**
         * This method is called when the decrement button is clicked.
         */
        public void decrement(View view) {
            if(quantity>1){
            quantity--;}
            display(quantity);
        }

        /**
         * This method is called when the order button is clicked.
         */
        public void submitOrder(View view) {
            String priceMessage="Total: ₹"+quantity*5;
            priceMessage=priceMessage+"\nThank You!";
            //displayMessage(priceMessage+getString(R.string.displayMessage));
            displayMessage(priceMessage);
           // displayPrice(quantity*5);
        }

        /**
         * This method displays the given quantity value on the screen.
         */
        private void display(int number) {
            TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
            quantityTextView.setText("" + number);
        }
        /**
         * This method displays the given price on the screen.

        private void displayPrice(int number) {
            TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
            priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(number));
        }
        /**
         * This method displays the given text on the screen.
         */
        private void displayMessage(String message) {
            TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
            priceTextView.setText(message);
        }
    }
