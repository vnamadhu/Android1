package com.felight.myapp2;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng bangalore = new LatLng(12.9716, 77.5946);
        mMap.addMarker(new MarkerOptions().position(bangalore).title("Marker in Bangalore City").icon(BitmapDescriptorFactory.fromResource(R.drawable.metro)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bangalore));


        LatLng metro1 = new LatLng(12.9757, 77.5728);
        mMap.addMarker(new MarkerOptions().position(metro1).title("Marker in Kempegowda Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro1));

        LatLng metro2 = new LatLng(12.9783484,77.56839830000001);
        mMap.addMarker(new MarkerOptions().position(metro2).title("Marker in City Railway Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro2));

        LatLng metro3 = new LatLng(12.9859, 77.6449);
        mMap.addMarker(new MarkerOptions().position(metro3).title("Marker in Swamy Vivekananda Road Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro3));

        LatLng metro4 = new LatLng(12.9764, 77.6267);
        mMap.addMarker(new MarkerOptions().position(metro4).title("Marker in Halasuru Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro4));

        LatLng metro5 = new LatLng(12.9729, 77.6170);
        mMap.addMarker(new MarkerOptions().position(metro5).title("Marker in Trinity Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro5));

        LatLng metro6 = new LatLng(12.9756, 77.5554);
        mMap.addMarker(new MarkerOptions().position(metro6).title("Marker in Magadi Road Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro6));

        LatLng metro7 = new LatLng(12.9907, 77.6525);
        mMap.addMarker(new MarkerOptions().position(metro7).title("Marker in Bayyappanahalli Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro7));

        LatLng metro8 = new LatLng(12.9741, 77.5840);
        mMap.addMarker(new MarkerOptions().position(metro8).title("Marker in Sir.M.Visweswaraya Metro station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(metro8));
    }
}
