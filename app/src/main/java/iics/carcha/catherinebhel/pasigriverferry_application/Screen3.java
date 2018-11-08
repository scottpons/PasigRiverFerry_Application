package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        Bundle bundle = getIntent().getExtras();
        String dest= bundle.getString("dest");
        String drop= bundle.getString("drop");
        TextView dFare = (TextView)findViewById(R.id.DFARE);
        TextView tFare = (TextView)findViewById(R.id.TFARE);
        TextView distance = (TextView)findViewById(R.id.Distance);
        TextView eTT = (TextView)findViewById(R.id.ETT);

        String list1[]={dest};
        String list2[]={drop};

        double d_fare=0.00;
        double t_fare=0.00;
        double dist=0.00;
        double time=0.00;

        Spinner spinner = (Spinner) findViewById(R.id.spinner_location); // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1); // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner_dropoff); // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter2 =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list2); // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        //Plaza Mexico

        if(dest.equals("Plaza Mexico")&&drop.equals("Escolta")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Lawton")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("PUP")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Sta. Ana")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Lambingan")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Valenzuela")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Hulo")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Guadalupe")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Maybunga")){
            t_fare=80.00;
            dist=26.36;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("San Joaquin")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Plaza Mexico")&&drop.equals("Pinagbuhatan")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }

        //ESCOLTA

        if(dest.equals("Escolta")&&drop.equals("Plaza Mexico")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Lawton")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("PUP")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Sta. Ana")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Lambingan")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Valenzuela")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Hulo")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Guadalupe")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Maybunga")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("San Joaquin")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Escolta")&&drop.equals("Pinagbuhatan")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }

        //Lawton

        if(dest.equals("Lawton")&&drop.equals("Plaza Mexico")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Escolta")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("PUP")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Sta. Ana")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Lambingan")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Valenzuela")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Hulo")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Guadalupe")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Maybunga")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("San Joaquin")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lawton")&&drop.equals("Pinagbuhatan")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }

        //PUP

        if(dest.equals("PUP")&&drop.equals("Plaza Mexico")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Escolta")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Lawton")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Sta. Ana")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Lambingan")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Valenzuela")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Hulo")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Guadalupe")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Maybunga")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("San Joaquin")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("PUP")&&drop.equals("Pinagbuhatan")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }

        //Sta. Ana

        if(dest.equals("Sta. Ana")&&drop.equals("Plaza Mexico")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Escolta")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Lawton")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("PUP")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Lambingan")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Valenzuela")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Hulo")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Guadalupe")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Maybunga")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("San Joaquin")){
            t_fare=38.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Sta. Ana")&&drop.equals("Pinagbuhatan")){
            t_fare=65.00;
            dist=0.31;
            time=3.00;
        }

        //Lambingan


        if(dest.equals("Lambingan")&&drop.equals("Plaza Mexico")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Escolta")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Lawton")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("PUP")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Sta. Ana")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Valenzuela")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Hulo")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Guadalupe")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Maybunga")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("San Joaquin")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Lambingan")&&drop.equals("Pinagbuhatan")){
            t_fare=60.00;
            dist=0.31;
            time=3.00;
        }

        //Valenzuela

        if(dest.equals("Valenzuela")&&drop.equals("Plaza Mexico")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Escolta")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Lawton")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("PUP")){
            t_fare=40.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Sta. Ana")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Lambingan")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Hulo")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Guadalupe")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Maybunga")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("San Joaquin")){
            t_fare=28.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Valenzuela")&&drop.equals("Pinagbuhatan")){
            t_fare=55.00;
            dist=0.31;
            time=3.00;
        }

        //Hulo

        if(dest.equals("Hulo")&&drop.equals("Plaza Mexico")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Escolta")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Lawton")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("PUP")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Sta. Ana")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Lambingan")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Valenzuela")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Guadalupe")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Maybunga")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("San Joaquin")){
            t_fare=23.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Hulo")&&drop.equals("Pinagbuhatan")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }

        //Guadalupe

        if(dest.equals("Guadalupe")&&drop.equals("Plaza Mexico")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Escolta")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Lawton")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("PUP")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Sta. Ana")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Lambingan")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Valenzuela")){
            t_fare=20.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Hulo")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Maybunga")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("San Joaquin")){
            t_fare=18.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Guadalupe")&&drop.equals("Pinagbuhatan")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }

        //Maybunga

        if(dest.equals("Maybunga")&&drop.equals("Plaza Mexico")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Escolta")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Lawton")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("PUP")){
            t_fare=80.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Sta. Ana")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Lambingan")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Valenzuela")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Hulo")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Guadalupe")){
            t_fare=30.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("San Joaquin")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Maybunga")&&drop.equals("Pinagbuhatan")){
            t_fare=43.00;
            dist=0.31;
            time=3.00;
        }

        //San Joaquin

        if(dest.equals("San Joaquin")&&drop.equals("Plaza Mexico")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Escolta")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Lawton")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("PUP")){
            t_fare=68.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Sta. Ana")){
            t_fare=38.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Lambingan")){
            t_fare=35.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Valenzuela")){
            t_fare=28.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Hulo")){
            t_fare=23.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Guadalupe")){
            t_fare=18.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Maybunga")){
            t_fare=15.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("San Joaquin")&&drop.equals("Pinagbuhatan")){
            t_fare=43.00;
            dist=0.31;
            time=3.00;
        }

        //Pinagbuhatan

        if(dest.equals("Pinagbuhatan")&&drop.equals("Plaza Mexico")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Escolta")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Lawton")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("PUP")){
            t_fare=95.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Sta. Ana")){
            t_fare=65.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Lambingan")){
            t_fare=60.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Valenzuela")){
            t_fare=55.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Hulo")){
            t_fare=50.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Guadalupe")){
            t_fare=45.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("Maybunga")){
            t_fare=43.00;
            dist=0.31;
            time=3.00;
        }
        else if(dest.equals("Pinagbuhatan")&&drop.equals("San Joaquin")){
            t_fare=28.00;
            dist=0.31;
            time=3.00;
        }

        dFare.setText((t_fare*0.8)+"");
        tFare.setText(t_fare+"");
        distance.setText(dist+" Kms.");
        eTT.setText(time+" mins.");
        Log.d("Screen3","Dropoff: "+dest+" and "+drop);

    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.other) {
            i = new Intent(this, Screen2.class);
            startActivity(i);
        }
        // } else if (v.getId() == R.id.stations) {
        //    i = new Intent(getIntent().ACTION_VIEW);
        //  i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
        //chooser = Intent.createChooser(i, "Choose A Map App");
        //startActivity(chooser);
    }
}