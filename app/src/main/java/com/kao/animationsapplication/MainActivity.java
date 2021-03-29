package com.kao.animationsapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kao.animationsapplication.ani01.Ani01Activity;
import com.kao.animationsapplication.ani02.Ani02Activity;
import com.kao.animationsapplication.ani03.Ani03Activity;
import com.kao.animationsapplication.ani04.Ani04Activity;
import com.kao.animationsapplication.ani05.Ani05Activity;
import com.kao.animationsapplication.ani06.Ani06Activity;
import com.kao.animationsapplication.ani07.Ani07Activity;
import com.kao.animationsapplication.ani08.Ani08Activity;
import com.kao.animationsapplication.model.MainItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.main_rv);
        List<MainItem> mainItems = new ArrayList<>();
        mainItems.add(new MainItem(1, R.string.label_animation01));
        mainItems.add(new MainItem(2, R.string.label_animation02));
        mainItems.add(new MainItem(3, R.string.label_animation03));
        mainItems.add(new MainItem(4, R.string.label_animation04));
        mainItems.add(new MainItem(5, R.string.label_animation05));
        mainItems.add(new MainItem(6, R.string.label_animation06));
        mainItems.add(new MainItem(7, R.string.label_animation07));
        mainItems.add(new MainItem(8, R.string.label_animation08));

        // 1 -> Definir o comportamento de exibição do layout da recyclerview
        // mosaic
        // grid
        // linear (horizontal | vertical)
        rvMain.setLayoutManager(new GridLayoutManager(this, 2));
        MainAdapter adapter = new MainAdapter(mainItems);

        adapter.setListener(id -> {
            switch (id) {
                case 1:
                    startActivity(new Intent(MainActivity.this, Ani01Activity.class));
                    break;
                case 2:
                    startActivity(new Intent(MainActivity.this, Ani02Activity.class));
                    break;
                case 3:
                    startActivity(new Intent(MainActivity.this, Ani03Activity.class));
                    break;
                case 4:
                    startActivity(new Intent(MainActivity.this, Ani04Activity.class));
                    break;
                case 5:
                    startActivity(new Intent(MainActivity.this, Ani05Activity.class));
                    break;
                case 6:
                    startActivity(new Intent(MainActivity.this, Ani06Activity.class));
                    break;
                case 7:
                    startActivity(new Intent(MainActivity.this, Ani07Activity.class));
                    break;
                case 8:
                    startActivity(new Intent(MainActivity.this, Ani08Activity.class));
                    break;
            }
        });

        rvMain.setAdapter(adapter);

    }

    private class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

        private List<MainItem> mainItems;
        private OnItemClickListener listener;

        public MainAdapter(List<MainItem> mainItems) {
            this.mainItems = mainItems;
        }

        //這裡來實現接口
        public void setListener(OnItemClickListener listener) {
            this.listener = listener;
        }

        @NonNull
        @Override
        public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainViewHolder(getLayoutInflater().inflate(R.layout.main_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
            MainItem mainItemCurrent = mainItems.get(position);
            holder.bind(mainItemCurrent);
        }

        @Override
        public int getItemCount() {
            return mainItems.size();
        }

        // Entenda como sendo a VIEW DA CELULA que está dentro do RecyclerView
        private class MainViewHolder extends RecyclerView.ViewHolder {

            public MainViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void bind(MainItem item) {
                TextView txtName = itemView.findViewById(R.id.item_text_name);
                LinearLayout btnImc = (LinearLayout) itemView.findViewById(R.id.btn_animations);

                btnImc.setOnClickListener(view -> {
                    listener.onClick(item.getId());
                });

                txtName.setText(item.getTextStringId());
            }
        }

    }


}