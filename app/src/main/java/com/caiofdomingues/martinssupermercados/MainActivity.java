package com.caiofdomingues.martinssupermercados;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;

public class MainActivity extends AppCompatActivity {

    private EditText sobre;
    private Button vamosla;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        SetActions();
    }

    private void findViews() {
        vamosla = (Button) findViewById(R.id.button);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        //set up navigation drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);

        //is in findView instead of setActions because the
        //other views use this
        initNavigationDrawer();

    }

    private void SetActions() {
        vamosla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    // Initialize and add Listener to NavigationDrawer
    public void initNavigationDrawer(){


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                int id = item.getItemId();

                switch (id){
                    case R.id.nav_home:
                        //btnAddExpense.callOnClick();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.galeria:
                        //signOut();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.cart:
                        drawerLayout.closeDrawers(); ;
                        break;
                    case R.id.contatos:
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.localizacao:
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.sobreapp:
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.nav_exit:
                        finish();
                        drawerLayout.closeDrawers();
                        break;
                }
                return false;
            }
        });


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar, 0,  0){
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

}
