package supriyadiericsonsinaga.com.tugas_uas_akb_10118343_if8;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import supriyadiericsonsinaga.com.tugas_uas_akb_10118343_if8.info.InfoFragment;

public class MainActivity extends AppCompatActivity {
    // 13 Agustus 2021 - 10118343 - Supriyadi Ericson Sinaga - IF 8

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        getFragmentPage(new InfoFragment());
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}