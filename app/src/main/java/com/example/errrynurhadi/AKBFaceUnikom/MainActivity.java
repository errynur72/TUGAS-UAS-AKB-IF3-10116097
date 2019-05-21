package com.example.errrynurhadi.AKBFaceUnikom;
//Tanggal pengerjaan : 17-05-2019
// nim      :10116097
// nama     :Erry Nurhadiansyah
// kelas    : IF-3
import androidx.annotation.NonNull;

import com.example.errrynurhadi.AKBFaceUnikom.view.biodata;
import com.example.errrynurhadi.AKBFaceUnikom.view.contact;
import com.example.errrynurhadi.AKBFaceUnikom.view.home;
import com.example.errrynurhadi.AKBFaceUnikom.view.temanwanita;
import com.example.errrynurhadi.AKBFaceUnikom.view.temanpria;
import com.example.errrynurhadi.AKBFaceUnikom.view.temanhmif;
import com.example.errrynurhadi.AKBFaceUnikom.view.SeluruhTeman;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.fragment.app.Fragment;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    static final int REQUEST_IMAGE_CAPTURE = 1;
    ImageView hasil;

    FloatingActionButton fab_upload, fab_kamera, fab_plus;
    Animation FabOpen, FabClose, FabClockwise, FabAntiClockwise;
    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistener);

        //Drawer Navigation
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new home()).commit();
            navigationView.setCheckedItem(R.id.dm_nav_home);
        }
    }

    //Bottom Navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navlistener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()) {
                        case R.id.bn_nav_home:
                            selectedFragment = new home();
                            break;
                        case R.id.bn_nav_socmed:
                            selectedFragment = new contact();
                            break;
                        case R.id.bn_nav_listtmn:
                            selectedFragment = new SeluruhTeman();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };

    //Drawer Navogation
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.dm_nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new home()).commit();
                break;
            case R.id.dm_nav_Profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new biodata()).commit();
                break;
            case R.id.dm_nav_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new contact()).commit();
                break;
            case R.id.dm_nav_listteman:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SeluruhTeman()).commit();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    //check if the user has a camera
    private boolean hasCamera() {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }


    //if you want to return take Photo
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            //get photo
            Bundle extras = data.getExtras();
            Bitmap photo = (Bitmap) extras.get("data");
            hasil.setImageBitmap(photo);
        }
    }
}
