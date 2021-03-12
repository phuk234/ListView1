package com.liem.btlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listViewSP;
    List<SanPham> sanPhamList;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        sanPhamAdapter = new SanPhamAdapter(this, R.layout.layout_list_view, sanPhamList);
        listViewSP.setAdapter(sanPhamAdapter);
    }

    private void addData() {
        listViewSP = findViewById(R.id.listViewSP);

        sanPhamList = new ArrayList<>();
        sanPhamList.add(new SanPham("Áo thun 1", 100, R.drawable.sp01));
        sanPhamList.add(new SanPham("Áo thun 2", 200, R.drawable.sp02));
        sanPhamList.add(new SanPham("Áo thun 3", 300, R.drawable.sp03));
        sanPhamList.add(new SanPham("Áo sơ mi 4", 400, R.drawable.sp04));

    }
}