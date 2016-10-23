package af.apps.android.moslslat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import af.apps.android.moslslat.AdaptersClass.MainAdapter;

public class MainActivity extends AppCompatActivity {

    public StaggeredGridLayoutManager staggeredGridLayoutManager;
    public MainAdapter adapter;
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview1);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        adapter = new MainAdapter(this);
        recyclerView.setAdapter(adapter);
    }
}
