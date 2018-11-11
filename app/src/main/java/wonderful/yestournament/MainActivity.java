package wonderful.yestournament;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements  NavigationView.OnNavigationItemSelectedListener,
                    BlankFragment.OnFragmentInteractionListener,
                    FragmentLogin.OnFragmentInteractionListener{


    public static Fragment fragment = null;
    public static FragmentTransaction ft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);




        //QUE VISTA SE CARGA de INICIO (Falta actualizar a la de torneos)
        //String tituloVista = getString(R.string.txtLogin);
        //displaySelectedScreen("Tournaments");

        //Para que se carge este fragment al iniciar la app
        fragment = new BlankFragment();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    //MENU DE LOS TRES  PUNTOS
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //CONTROLA QUE OPCION DE LOS TRES PUNTOS ES PULSADA
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //QUE OPCION DEL MENU LATERAL ES PULSADO Y CARGA SU FRAGMENT, ASI COMO CAMBIAR EL NOMBRE DE LA APP BAR
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_torneos) {
            fragment = new BlankFragment();
        } else if (id == R.id.nav_perfil) {

        } else if (id == R.id.nav_estadisticas) {

        } else if (id == R.id.nav_ranking) {

        } else if (id == R.id.nav_mensajes) {

        } else if (id == R.id.nav_login) {
            fragment = new FragmentLogin();

        }

        if (fragment != null) {

            ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_main, fragment);
            ft.commit();

            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }

        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
