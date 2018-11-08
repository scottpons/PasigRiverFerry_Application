package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Screen2 extends AppCompatActivity {

    String dest="";
    String drop="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_location); // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Stations, android.R.layout.simple_spinner_item); // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        dest="Plaza Mexico";
                        break;
                    case 1:
                        dest="Escolta";
                        break;
                    case 2:
                        dest="Lawton";
                        break;
                    case 3:
                        dest="PUP";
                        break;
                    case 4:
                        dest="Sta. Ana";
                        break;
                    case 5:
                        dest="Lambingan";
                        break;
                    case 6:
                        dest="Valenzuela";
                        break;
                    case 7:
                        dest="Hulo";
                        break;
                    case 8:
                        dest="Guadalupe";
                        break;
                    case 9:
                        dest="Maybunga";
                        break;
                    case 10:
                        dest="San Joaquin";
                        break;
                    case 11:
                        dest="Pinagbuhatan";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                dest=null;
            }
        });

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner_dropoff); // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.Stations, android.R.layout.simple_spinner_item); // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        drop="Plaza Mexico";
                        break;
                    case 1:
                        drop="Escolta";
                        break;
                    case 2:
                        drop="Lawton";
                        break;
                    case 3:
                        drop="PUP";
                        break;
                    case 4:
                        drop="Sta. Ana";
                        break;
                    case 5:
                        drop="Lambingan";
                        break;
                    case 6:
                        drop="Valenzuela";
                        break;
                    case 7:
                        drop="Hulo";
                        break;
                    case 8:
                        drop="Guadalupe";
                        break;
                    case 9:
                        drop="Maybunga";
                        break;
                    case 10:
                        drop="San Joaquin";
                        break;
                    case 11:
                        drop="Pinagbuhatan";
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                drop=null;
            }
        });


    }
    public void process(View v) {

        Intent i = null, chooser = null;
        if(dest==drop) {
            Toast.makeText(this,"Your destination and dropoff can't be the same", Toast.LENGTH_SHORT).show();
        }
        else if(dest==null && drop==null){
            Toast.makeText(this,"Select a destination and dropoff", Toast.LENGTH_SHORT).show();
        }
        else if(drop==null) {
            Toast.makeText(this,"Select a dropoff", Toast.LENGTH_SHORT).show();
        }
        else if(dest==null) {
            Toast.makeText(this,"Select a destination", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.submit) {
            i = new Intent(this, Screen3.class);
            i.putExtra("dest",dest);
            i.putExtra("drop",drop);
            Log.d("Screen2","Locations: "+dest+" and "+drop);
            startActivity(i);
        }
        // } else if (v.getId() == R.id.stations) {
        //    i = new Intent(getIntent().ACTION_VIEW);
        //  i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
        //chooser = Intent.createChooser(i, "Choose A Map App");
        //startActivity(chooser);
    }
    /*
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    */
}